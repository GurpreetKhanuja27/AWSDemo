package com.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Bucket.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bucket {

	/** The name. */
	@JsonProperty("name")
	private String name;
	
	/** The arn. */
	@JsonProperty("arn")
	private String arn;

	/**
	 * Gets the name.
	 *
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name     
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the arn.
	 *
	 * @return The arn
	 */
	@JsonProperty("arn")
	public String getArn() {
		return arn;
	}

	/**
	 * Sets the arn.
	 *
	 * @param arn The arn
	 */
	@JsonProperty("arn")
	public void setArn(String arn) {
		this.arn = arn;
	}

}
