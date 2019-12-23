package com.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YearDeSumMngDTO {
	
	@JsonProperty("year")
	private int year;
	
	@JsonProperty("brName")
	private String brname;
	
	@JsonProperty("brCode")
	private String brcode;
	
	@JsonProperty("sumAmt")
	private int sumamt;
	
	public int getYear() {
        return this.year;
    }
	public String getBrname() {
        return this.brname;
    }
	public String getBrcode() {
        return this.brcode;
    }
	public int getSumamt() {
        return this.sumamt;
    }
	
}
