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
import com.test.dto.YearDeSumMngDTO;
import com.test.service.CusDeService;

@Controller
public class CusDeContoller {
	
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
	public @ResponseBody List<YearDeSumMngDTO> getYearDeSumMngInf() throws Exception{
    	
    	List<YearDeSumMngDTO>  dataList = new ArrayList<YearDeSumMngDTO>();
    	dataList = cusdeService.getYearDeSumMngInf();
    	
    	//List<YearDeSumListDTO> result = new ArrayList<YearDeSumListDTO>();
    	
    	//for(int i = 0; i < dataList.size(); i++) {
    	//	result.set(0,2018);
    		
    		
    	//}
    	
    	return dataList;
	}
    @RequestMapping(value="/getDeSumMngInf/{mng}",method=RequestMethod.GET)
	public @ResponseBody DeSumMngDTO getDeSumMngInf(@PathVariable("mng") String mng) throws Exception{
    	
    	return cusdeService.getDeSumMngInf(mng);
    }
   
}
