package com.example.demo.dao;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlGiftInfoVo;

public interface PlGiftInfoVoMapper extends Mapper<PlGiftInfoVo> {

	public Integer getTotalCountsByJdbc();
	
	public PlGiftInfoVo getProductCountByProductCode(String productCode);
}