package com.example.demo.dao;

import java.util.List;

import com.example.demo.common.Mapper;
import com.example.demo.model.OrderCrmCodeVo;

public interface OrderCrmCodeVoMapper extends Mapper<OrderCrmCodeVo> {
	public List<OrderCrmCodeVo> getInfoByProvinceCode(String provinceCode);
}