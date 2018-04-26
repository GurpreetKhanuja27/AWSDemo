package com.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {

	/** The event version. */
	@JsonProperty("eventVersion")
	private String eventVersion;

	/** The event source. */
	@JsonProperty("eventSource")
	private String eventSource;

	/** The aws region. */
	@JsonProperty("awsRegion")
	private String awsRegion;

	/** The event time. */
	@JsonProperty("eventTime")
	private String eventTime;

	/** The event name. */
	@JsonProperty("eventName")
	private String eventName;

	/** The s 3. */
	@JsonProperty("s3")
	private S3 s3;

	/**
	 * Gets the event version.
	 *
	 * @return The eventVersion
	 */
	@JsonProperty("eventVersion")
	public String getEventVersion() {
		return eventVersion;
	}

	/**
	 * Sets the event version.
	 *
	 * @param eventVersion
	 *            The eventVersion
	 */
	@JsonProperty("eventVersion")
	public void setEventVersion(String eventVersion) {
		this.eventVersion = eventVersion;
	}

	/**
	 * Gets the event source.
	 *
	 * @return The eventSource
	 */
	@JsonProperty("eventSource")
	public String getEventSource() {
		return eventSource;
	}

	/**
	 * Sets the event source.
	 *
	 * @param eventSource
	 *            The eventSource
	 */
	@JsonProperty("eventSource")
	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	/**
	 * Gets the aws region.
	 *
	 * @return The awsRegion
	 */
	@JsonProperty("awsRegion")
	public String getAwsRegion() {
		return awsRegion;
	}

	/**
	 * Sets the aws region.
	 *
	 * @param awsRegion
	 *            The awsRegion
	 */
	@JsonProperty("awsRegion")
	public void setAwsRegion(String awsRegion) {
		this.awsRegion = awsRegion;
	}

	/**
	 * Gets the event time.
	 *
	 * @return The eventTime
	 */
	@JsonProperty("eventTime")
	public String getEventTime() {
		return eventTime;
	}

	/**
	 * Sets the event time.
	 *
	 * @param eventTime
	 *            The eventTime
	 */
	@JsonProperty("eventTime")
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	/**
	 * Gets the event name.
	 *
	 * @return The eventName
	 */
	@JsonProperty("eventName")
	public String getEventName() {
		return eventName;
	}

	/**
	 * Sets the event name.
	 *
	 * @param eventName
	 *            The eventName
	 */
	@JsonProperty("eventName")
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * Gets the s3.
	 *
	 * @return The s3
	 */
	@JsonProperty("s3")
	public S3 getS3() {
		return s3;
	}

	/**
	 * Sets the s3.
	 *
	 * @param s3
	 *            The s3
	 */
	@JsonProperty("s3")
	public void setS3(S3 s3) {
		this.s3 = s3;
	}

}
