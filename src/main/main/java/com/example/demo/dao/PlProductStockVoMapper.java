package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlProductStockVo;

public interface PlProductStockVoMapper extends Mapper<PlProductStockVo> {
	public List<PlProductStockVo> getProductStockByPid(@Param("warehouseType") String warehouseType,@Param("productId") String productId);
	
	public void updateShelvesClearById(String id);
}