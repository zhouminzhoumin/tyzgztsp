package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.OrderCrmCodeVoMapper;
import com.example.demo.model.OrderCrmCodeVo;
import com.example.demo.service.OrderCrmCodeVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 



import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class OrderCrmCodeVoServiceImpl extends ServiceImpl<OrderCrmCodeVo> implements OrderCrmCodeVoService {
    @Resource
    private OrderCrmCodeVoMapper orderCrmCodeVoMapper;
    
    @Override
	public List<OrderCrmCodeVo> getInfoByProvinceCode(String provinceCode) {
    	List<OrderCrmCodeVo> orderCrmCode = orderCrmCodeVoMapper.getInfoByProvinceCode(provinceCode);
		
		return orderCrmCode;
	}
 
}