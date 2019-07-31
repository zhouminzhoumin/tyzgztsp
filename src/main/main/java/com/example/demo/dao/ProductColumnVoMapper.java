package com.example.demo.dao;

import java.util.List;

import com.example.demo.common.Mapper;
import com.example.demo.model.ProductColumnVo;

public interface ProductColumnVoMapper extends Mapper<ProductColumnVo> {
	public List<ProductColumnVo> getInfoByProvinceCode(String provinceCode);
}