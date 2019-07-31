package com.example.demo.dao;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductInfoVo;

public interface PlPresentInfoVoMapper extends Mapper<PlPresentInfoVo> {

	public Integer getTotalCountsByJdbc();
	
	public PlPresentInfoVo getProductCountByProductCode(String productCode);
}