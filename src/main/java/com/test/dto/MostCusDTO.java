package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MostCusDTO {
	
	@JsonProperty("year")
	private int year;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("acctno")
	private String acctno;
	
	@JsonProperty("sumamt")
	private int sumamt;
}
