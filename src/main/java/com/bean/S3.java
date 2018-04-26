package com.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class S3.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class S3 {

	/** The s3 schema version. */
	@JsonProperty("s3SchemaVersion")
	private String s3SchemaVersion;
	
	/** The configuration id. */
	@JsonProperty("configurationId")
	private String configurationId;
	
	/** The bucket. */
	@JsonProperty("bucket")
	private Bucket bucket;
	
	/** The object. */
	@JsonProperty("object")
	private Object object;

	/**
	 * Gets the s 3 schema version.
	 *
	 * @return The s3SchemaVersion
	 */
	@JsonProperty("s3SchemaVersion")
	public String getS3SchemaVersion() {
		return s3SchemaVersion;
	}

	/**
	 * Sets the s 3 schema version.
	 *
	 * @param s3SchemaVersion            The s3SchemaVersion
	 */
	@JsonProperty("s3SchemaVersion")
	public void setS3SchemaVersion(String s3SchemaVersion) {
		this.s3SchemaVersion = s3SchemaVersion;
	}

	/**
	 * Gets the configuration id.
	 *
	 * @return The configurationId
	 */
	@JsonProperty("configurationId")
	public String getConfigurationId() {
		return configurationId;
	}

	/**
	 * Sets the configuration id.
	 *
	 * @param configurationId            The configurationId
	 */
	@JsonProperty("configurationId")
	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}

	/**
	 * Gets the bucket.
	 *
	 * @return The bucket
	 */
	@JsonProperty("bucket")
	public Bucket getBucket() {
		return bucket;
	}

	/**
	 * Sets the bucket.
	 *
	 * @param bucket            The bucket
	 */
	@JsonProperty("bucket")
	public void setBucket(Bucket bucket) {
		this.bucket = bucket;
	}

	/**
	 * Gets the object.
	 *
	 * @return The object
	 */
	@JsonProperty("object")
	public Object getObject() {
		return object;
	}

	/**
	 * Sets the object.
	 *
	 * @param object            The object
	 */
	@JsonProperty("object")
	public void setObject(Object object) {
		this.object = object;
	}

}
