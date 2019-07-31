package com.example.demo.service.impl;
 
import com.example.demo.dao.PlPresentInfoVoMapper;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.service.PlPresentInfoVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 


import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/10.
 */
@Service
@Transactional
public class PlPresentInfoVoServiceImpl extends ServiceImpl<PlPresentInfoVo> implements PlPresentInfoVoService {
    @Resource
    private PlPresentInfoVoMapper plPresentInfoVoMapper;

    /**
	 * 设置赠品编码，从LP10000累加
	 * @return
	 */
	public String getLPMaxProductCode(){
		Integer maxProductCode=plPresentInfoVoMapper.getTotalCountsByJdbc();
		if(maxProductCode==0){
			return "LP"+10000;
		}
		return "LP"+(++maxProductCode);
	}
 
	@Override
	public PlPresentInfoVo getProductCountByProductCode(String productCode) {
		PlPresentInfoVo plProduct=plPresentInfoVoMapper.getProductCountByProductCode(productCode);
		
		return plProduct;
	}
}