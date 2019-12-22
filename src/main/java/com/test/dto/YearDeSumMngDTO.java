package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YearDeSumMngDTO {
	
	@JsonProperty("year")
	private int year;
	
	@JsonProperty("brname")
	private String brname;
	
	@JsonProperty("brcode")
	private String brcode;
	
	@JsonProperty("sumAmt")
	private int sumAmt;
	
}
