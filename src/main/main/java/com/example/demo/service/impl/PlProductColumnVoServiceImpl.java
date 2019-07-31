package com.example.demo.service.impl;
 

import java.util.List;

import com.example.demo.dao.PlProductColumnVoMapper;
import com.example.demo.model.PlProductColumnVo;
import com.example.demo.service.PlProductColumnVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 


import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class PlProductColumnVoServiceImpl extends ServiceImpl<PlProductColumnVo> implements PlProductColumnVoService {
    @Resource
    private PlProductColumnVoMapper plProductColumnVoMapper;
    
    @Override
	public List<PlProductColumnVo> getProductColumnById(String provinceCode) {
    	List<PlProductColumnVo> plProductColumn = plProductColumnVoMapper.getProductColumnById(provinceCode);
		return plProductColumn;
	}
 
}