package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.DeNoneDTO;
import com.test.dto.DeSumMngDTO;
import com.test.dto.MostCusDTO;
import com.test.dto.YearDeSumMngDTO;
import com.test.mapper.CusDeMapper;

@Service
public class CusDeService {
	
	@Autowired
    CusDeMapper cusdeMapper;
    
    public List<MostCusDTO> getMostCusInf() throws Exception{
        return cusdeMapper.getMostCusInf();
    }
    public List<DeNoneDTO> getDeNoneCusInf() throws Exception{
        return cusdeMapper.getDeNoneCusInf();
    }
	public List<YearDeSumMngDTO> getYearDeSumMngInf() throws Exception{
		return cusdeMapper.getYearDeSumMngInf();
	}
	public DeSumMngDTO getDeSumMngInf(String mng) throws Exception{
		return cusdeMapper.getDeSumMngInf(mng);
	}
}
