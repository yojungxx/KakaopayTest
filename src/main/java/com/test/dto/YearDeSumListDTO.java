package com.test.dto;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YearDeSumListDTO {
	
	@JsonProperty("year")
	private int year;
	
	@JsonProperty("dataList")
	private List<YearDeSumMng2DTO> dataList;
	
	public void setYear(int year) {
        this.year = year;
    }
	public void setDataList(List<YearDeSumMng2DTO> dataList) {
        this.dataList = dataList;
    }
	public int getYear() {
        return this.year;
    }
	public List<YearDeSumMng2DTO> getDataList() {
        return this.dataList;
    }
}
