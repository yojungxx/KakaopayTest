package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeSumMngDTO {
	
	@JsonProperty("brname")
	private String brname;
	
	@JsonProperty("brcode")
	private String brcode;
	
	@JsonProperty("sumamt")
	private int sumamt;
}
