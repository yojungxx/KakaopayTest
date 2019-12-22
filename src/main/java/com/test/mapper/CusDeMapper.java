package com.test.mapper;

import java.util.List;

import com.test.dto.DeNoneDTO;
import com.test.dto.DeSumMngDTO;
import com.test.dto.MostCusDTO;
import com.test.dto.YearDeSumMngDTO;

public interface CusDeMapper {
	public List<MostCusDTO> getMostCusInf() throws Exception;
	public List<DeNoneDTO> getDeNoneCusInf() throws Exception;
	public List<YearDeSumMngDTO> getYearDeSumMngInf() throws Exception;
	public DeSumMngDTO getDeSumMngInf(String mng) throws Exception;
}
