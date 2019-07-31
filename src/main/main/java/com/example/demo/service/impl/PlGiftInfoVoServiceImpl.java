package com.example.demo.service.impl;
 
import com.example.demo.dao.PlGiftInfoVoMapper;
import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.service.PlGiftInfoVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 


import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/09.
 */
@Service
@Transactional
public class PlGiftInfoVoServiceImpl extends ServiceImpl<PlGiftInfoVo> implements PlGiftInfoVoService {
    @Resource
    private PlGiftInfoVoMapper plGiftInfoVoMapper;

	public String getZPMaxProductCode(){
		Integer maxProductCode=plGiftInfoVoMapper.getTotalCountsByJdbc();
		if(maxProductCode==0){
			return "ZP"+10000;
		}
		return "ZP"+(++maxProductCode);
	}
	
	@Override
	public PlGiftInfoVo getProductCountByProductCode(String productCode) {
		PlGiftInfoVo plProduct=plGiftInfoVoMapper.getProductCountByProductCode(productCode);
		
		return plProduct;
	}
 
}