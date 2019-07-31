package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.common.Mapper;
import com.example.demo.model.ImStockProductVo;
import com.example.demo.model.OrderCrmCodeVo;

public interface ImStockProductVoMapper extends Mapper<ImStockProductVo> {
	
	public List<ImStockProductVo> getZPByProductCdAndSup(@Param("productCd") String productCd,@Param("supplierCode") String supplierCode,@Param("propertyCode") String propertyCode);
	
	public List<ImStockProductVo> getAllByProductCdAndSup(@Param("productCd") String productCd,@Param("supplierCode") String supplierCode,@Param("propertyCode") String propertyCode);
}