package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dto.DeNoneDTO;
import com.test.dto.DeSumMngDTO;
import com.test.dto.MostCusDTO;
import com.test.dto.YearDeSumListDTO;
import com.test.dto.YearDeSumMng2DTO;
import com.test.dto.YearDeSumMngDTO;
import com.test.service.CusDeService;

@Controller
public class CusDeController {
	
    @Autowired
    CusDeService cusdeService;
    
    @RequestMapping(value="/getMostCusInf",method=RequestMethod.GET)
    public @ResponseBody List<MostCusDTO> getMostCusInf() throws Exception{
        return cusdeService.getMostCusInf();
    }
    @RequestMapping(value="/getDeNoneCusInf",method=RequestMethod.GET)
    public @ResponseBody List<DeNoneDTO> getDeNoneCusInf() throws Exception{
        return cusdeService.getDeNoneCusInf();
    }
    @RequestMapping(value="/getYearDeSumMngInf",method=RequestMethod.GET)
	public @ResponseBody List<YearDeSumListDTO> getYearDeSumMngInf() throws Exception{
    	
    	int hyo = 0;
    	YearDeSumMngDTO temp = new YearDeSumMngDTO();
    	YearDeSumMng2DTO temp2;
    	YearDeSumListDTO tempListDTO = new YearDeSumListDTO();;
    	
    	// dataList : DB조회 결과 저장
    	List<YearDeSumMngDTO>  dbResult = new ArrayList<YearDeSumMngDTO>();
    	dbResult = cusdeService.getYearDeSumMngInf();

    	List<YearDeSumMng2DTO> tempMngDTO = new ArrayList<YearDeSumMng2DTO>();
		
		List<YearDeSumListDTO> result = new ArrayList<YearDeSumListDTO>();
		
    	for(int i = 0; i < dbResult.size(); i++) {
    		
    		temp = dbResult.get(i);
    		temp2 = new YearDeSumMng2DTO(temp.getBrname(), temp.getBrcode(), temp.getSumamt());
    		
    		
    		if (i == 0) {
    			//첫 대상일 때, year 셋팅
    			hyo = temp.getYear();
    			//dataList 셋팅
    			tempMngDTO.add(temp2);
    		}
    		else if (hyo == temp.getYear()) {
    			
    			//dataList 셋팅
    			tempMngDTO.add(temp2);
    		}
    		else {

    			//year가 바뀔 때, result 셋팅
    			tempListDTO.setYear(hyo);
    			tempListDTO.setDataList(tempMngDTO);
    			
    			result.add(tempListDTO);
    			
    			hyo = temp.getYear();

    			tempListDTO = new YearDeSumListDTO();
        		tempMngDTO = new ArrayList<YearDeSumMng2DTO>();
    			tempMngDTO.add(temp2);
    		}
			
			if (i == dbResult.size()-1) {
				
				//마지막 result 셋팅
				tempListDTO.setYear(hyo);
				tempListDTO.setDataList(tempMngDTO);
				
				result.add(tempListDTO);
			}
    	}
    	
    	return result;
	}
	
    @RequestMapping(value="/getDeSumMngInf/{mng}",method=RequestMethod.GET)
	public @ResponseBody DeSumMngDTO getDeSumMngInf(@PathVariable("mng") String mng) throws Exception{
    	
    	return cusdeService.getDeSumMngInf(mng);
    }
   
}
