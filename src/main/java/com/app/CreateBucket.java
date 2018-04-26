package com.app;

import java.util.List;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;


public class CreateBucket
{
	
	static AmazonS3 s3;
	
	static {
    	//BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIAIBEFZA****","CR/zidtsw70yMxRKQ3NljH16lnBKeZqW9rj***L");
    	s3 = AmazonS3ClientBuilder.standard().withRegion("us-east-1")
    	                        .withCredentials(new ProfileCredentialsProvider())
    	                        .build();
	}
	
	
    public static Bucket getBucket(String bucket_name) {
    	
        //final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
        Bucket named_bucket = null;
        List<Bucket> buckets = s3.listBuckets();
        for (Bucket b : buckets) {
           System.out.println(b.getName());
        	if (b.getName().equals(bucket_name)) {
                named_bucket = b;
            }
        }
        return named_bucket;
    }

    public static Bucket createBucket(String bucket_name) {
    	
        //final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
    	getBucket(bucket_name);
        Bucket b = null;
        if (s3.doesBucketExist(bucket_name)) {
            System.out.format("Bucket %s already exists.\n", bucket_name);
            b = getBucket(bucket_name);
        } else {
            try {
                b = s3.createBucket(bucket_name);
            } catch (AmazonS3Exception e) {
                System.err.println(e.getErrorMessage());
            }
        }
        return b;
    }

    public static void main(String[] args)
    {
        String bucket_name = "samplebucket4192018test";//args[0];

        System.out.format("\nCreating S3 bucket: %s\n", bucket_name);
        Bucket b = createBucket(bucket_name);
        if (b == null) {
            System.out.println("Error creating bucket!\n");
        } else {
            System.out.println("Done!\n");
        }
    }
}