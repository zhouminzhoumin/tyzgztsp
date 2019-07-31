package com.example.demo.dao;

import java.util.List;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlProductAreaVo;

public interface PlProductAreaVoMapper extends Mapper<PlProductAreaVo> {
	public List<PlProductAreaVo> getAreaIdByProductId(String productId);
}