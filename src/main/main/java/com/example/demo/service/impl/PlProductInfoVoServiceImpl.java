package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.PlProductInfoVoMapper;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.service.PlProductInfoVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 


import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/06/13.
 */
@Service
@Transactional
public class PlProductInfoVoServiceImpl extends ServiceImpl<PlProductInfoVo> implements PlProductInfoVoService {
    @Resource
    private PlProductInfoVoMapper plProductInfoVoMapper;
    
    
    
	/**
	 * 设置商品编码，从1000000累加
	 * @return
	 */
	public Integer getMaxProductCode(){
		Integer maxProductCode=plProductInfoVoMapper.getTotalCountsByJdbc();
		if(maxProductCode==0){
			return 1000000;
		}
		return ++maxProductCode;
	}



	@Override
	public PlProductInfoVo getProductByCode(String productCode) {
		PlProductInfoVo plProduct=plProductInfoVoMapper.getProductByCode(productCode);
		
		return plProduct;
	}
	
	@Override
	public PlProductInfoVo getMostProductInfoByProductCode(String productCode) {
		PlProductInfoVo plProduct=plProductInfoVoMapper.getMostProductInfoByProductCode(productCode);
		
		return plProduct;
	}
	
	@Override
	public PlProductInfoVo getProductCountByProductCode(String productCode) {
		PlProductInfoVo plProduct=plProductInfoVoMapper.getProductCountByProductCode(productCode);
		
		return plProduct;
	}
	
	@Override
	public List<PlProductInfoVo> getAllById(String id) {
		List<PlProductInfoVo> plProduct=plProductInfoVoMapper.getAllById(id);
		
		return plProduct;
	}
	
}