package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeSumMngDTO {
	
	@JsonProperty("brName")
	private String brname;
	
	@JsonProperty("brCode")
	private String brcode;
	
	@JsonProperty("sumAmt")
	private int sumamt;
}
