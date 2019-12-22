package com.test.dto;

import java.util.List;

public class YearDeSumListDTO {

	private int year;
	private List<YearDeSumMngDTO> dataList;
	
	public void setYear(int year) {
        this.year = year;
    }
	public void setDataList(List<YearDeSumMngDTO> dataList) {
        this.dataList = dataList;
    }
	
}
