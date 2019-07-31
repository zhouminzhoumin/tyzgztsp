package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlProductLimitPriceVo;

public interface PlProductLimitPriceVoMapper extends Mapper<PlProductLimitPriceVo> {
	public List<PlProductLimitPriceVo> getPlProductLimitPriceByPlProductInfoId(@Param("productId") String productId,@Param("provinceCode") String provinceCode);
}