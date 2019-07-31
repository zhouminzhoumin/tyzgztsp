package com.example.demo.dao;


import java.util.List;

import com.example.demo.common.Mapper;
import com.example.demo.model.PlProductColumnVo;

public interface PlProductColumnVoMapper extends Mapper<PlProductColumnVo> {
	
	public List<PlProductColumnVo> getProductColumnById(String id);
	
}