package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MostCusDTO {
	
	@JsonProperty("year")
	private int year;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("acctNo")
	private String acctno;
	
	@JsonProperty("sumAmt")
	private int sumamt;
}
