package com.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Object {

	/** The key. */
	@JsonProperty("key")
	private String key;

	/** The size. */
	@JsonProperty("size")
	private long size;

	/** The e tag. */
	@JsonProperty("eTag")
	private String eTag;

	/** The sequencer. */
	@JsonProperty("sequencer")
	private String sequencer;

	/**
	 * Gets the key.
	 *
	 * @return The key
	 */
	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 * The key
	 */
	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the size.
	 *
	 * @return The size
	 */
	@JsonProperty("size")
	public Long getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size
	 *            The size
	 */
	@JsonProperty("size")
	public void setSize(Long size) {
		this.size = size;
	}

	/**
	 * Gets the e tag.
	 *
	 * @return The eTag
	 */
	@JsonProperty("eTag")
	public String getETag() {
		return eTag;
	}

	/**
	 * Sets the e tag.
	 *
	 * @param eTag
	 *            The eTag
	 */
	@JsonProperty("eTag")
	public void setETag(String eTag) {
		this.eTag = eTag;
	}

	/**
	 * Gets the sequencer.
	 *
	 * @return The sequencer
	 */
	@JsonProperty("sequencer")
	public String getSequencer() {
		return sequencer;
	}

	/**
	 * Sets the sequencer.
	 *
	 * @param sequencer
	 * The sequencer
	 */
	@JsonProperty("sequencer")
	public void setSequencer(String sequencer) {
		this.sequencer = sequencer;
	}

}
