package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.PlProductLimitPriceVoMapper;
import com.example.demo.model.PlProductLimitPriceVo;
import com.example.demo.service.PlProductLimitPriceVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 


import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/18.
 */
@Service
@Transactional
public class PlProductLimitPriceVoServiceImpl extends ServiceImpl<PlProductLimitPriceVo> implements PlProductLimitPriceVoService {
    @Resource
    private PlProductLimitPriceVoMapper plProductLimitPriceVoMapper;

	@Override
	public List<PlProductLimitPriceVo> getPlProductLimitPriceByPlProductInfoId(
			String productId, String provinceCode) {
		List<PlProductLimitPriceVo> plProductLimitPrice = plProductLimitPriceVoMapper.getPlProductLimitPriceByPlProductInfoId(productId,provinceCode);
		
		return plProductLimitPrice;
	}
 
}