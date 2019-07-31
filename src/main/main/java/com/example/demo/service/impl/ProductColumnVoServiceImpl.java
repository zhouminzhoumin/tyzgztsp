package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.ProductColumnVoMapper;
import com.example.demo.model.ProductColumnVo;
import com.example.demo.service.ProductColumnVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class ProductColumnVoServiceImpl extends ServiceImpl<ProductColumnVo> implements ProductColumnVoService {
    @Resource
    private ProductColumnVoMapper productColumnVoMapper;
    
    @Override
	public List<ProductColumnVo> getInfoByProvinceCode(String provinceCode) {
    	List<ProductColumnVo> productColumn = productColumnVoMapper.getInfoByProvinceCode(provinceCode);
		
		return productColumn;
	}
 
}