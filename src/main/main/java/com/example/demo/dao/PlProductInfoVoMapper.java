package com.example.demo.dao;

import java.util.List;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlProductInfoVo;

public interface PlProductInfoVoMapper extends Mapper<PlProductInfoVo> {

	public Integer getTotalCountsByJdbc();

	public PlProductInfoVo getProductByCode(String productCode);

	public PlProductInfoVo getMostProductInfoByProductCode(String productCode);
	
	public PlProductInfoVo getProductCountByProductCode(String productCode);
	
	public List<PlProductInfoVo> getAllById(String id);
	
}