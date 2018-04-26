package com.app;


/*
 * SQS Poller will continuously pool the messages from SQS
 */

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.bean.MessageBody;
import com.bean.S3;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SQSPoller {

	public static void main(String[] args) {
		new SQSPollerThread("https://sqs.us-east-1.amazonaws.com/967401445969/SampleSQS", 10).start();

	}

}

class SQSPollerThread extends Thread {

	static AmazonSQS service;
	
	static {
    	//BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIAIBEFZA****","CR/zidtsw70yMxRKQ3NljH16lnBKeZqW9rj***L");
		service = AmazonSQSClientBuilder.standard().withRegion("us-east-1").withCredentials(new ProfileCredentialsProvider()).build();
	}
	
	/** The sqs events to poll. */
	private int sqsEventsToPoll;
	
	/** The queue url. */
	private String QUEUE_URL;
	
	public SQSPollerThread(String QUEUE_URL, int sqsEventsToPoll) {
		this.sqsEventsToPoll = sqsEventsToPoll;
		this.QUEUE_URL = QUEUE_URL;		
	}

	/**
	 * Polls and receives the messages from SQS.
	 */
	@Override
	public void run() {
		for(;;) {
			try  {
				ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest();
				receiveMessageRequest.setQueueUrl(QUEUE_URL);
				receiveMessageRequest.setMaxNumberOfMessages(sqsEventsToPoll);
				receiveMessageRequest.setWaitTimeSeconds(5);
				final List<Message> receiveMessageResult = service.receiveMessage(receiveMessageRequest)
						.getMessages();
				getMessageContentList(receiveMessageResult);
				Thread.sleep(2000);
			} catch(Throwable t) {
				t.printStackTrace();
			}
		}
	}

	private void removeMessageFromQueue(String messageReceiptHandle) {
		service.deleteMessage(new DeleteMessageRequest().withQueueUrl(QUEUE_URL)
				.withReceiptHandle(messageReceiptHandle));
	}

	private void getMessageContentList(List<Message> messages) throws IOException, JsonParseException, JsonMappingException {
		final ObjectMapper mapper = new ObjectMapper();
		System.out.println(messages);
		for (Message message : messages) {
			final MessageBody msgbody = mapper.readValue(message.getBody(), MessageBody.class);
			if(msgbody != null && msgbody.getRecords().size() > 0) {
				final S3 s3 = msgbody.getRecords().get(0).getS3();
				final String key = URLDecoder.decode(s3.getObject().getKey(), "UTF-8");
				final String bucket = s3.getBucket().getName();
				try {
					System.out.println(key + " " + bucket);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			removeMessageFromQueue(message.getReceiptHandle());
		}

	}

}
