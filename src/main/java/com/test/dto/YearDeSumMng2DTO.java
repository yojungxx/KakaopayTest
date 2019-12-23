package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YearDeSumMng2DTO {
	
	@JsonProperty("brName")
	private String brname;
	
	@JsonProperty("brCode")
	private String brcode;
	
	@JsonProperty("sumAmt")
	private int sumamt;
	
	public YearDeSumMng2DTO() {
		
	}
	public YearDeSumMng2DTO(String brname, String brcode, int sumamt) {
		this.brname = brname;
		this.brcode = brcode;
		this.sumamt = sumamt;
	}
}
