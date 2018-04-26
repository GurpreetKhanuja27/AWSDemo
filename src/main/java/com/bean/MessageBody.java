package com.bean;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class MessageBody.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageBody {

	/** The Records. */
	@JsonProperty("Records")
	private List<Record> Records = new ArrayList<Record>();

	/**
	 * Gets the records.
	 *
	 * @return The Records
	 */
	@JsonProperty("Records")
	public List<Record> getRecords() {
		return Records;
	}

	/**
	 * Sets the records.
	 *
	 * @param Records
	 *            The Records
	 */
	@JsonProperty("Records")
	public void setRecords(List<Record> Records) {
		this.Records = Records;
	}

}
