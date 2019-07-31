package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.PlProductAreaVoMapper;
import com.example.demo.model.PlProductAreaVo;
import com.example.demo.service.PlProductAreaVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class PlProductAreaVoServiceImpl extends ServiceImpl<PlProductAreaVo> implements PlProductAreaVoService {
    @Resource
    private PlProductAreaVoMapper plProductAreaVoMapper;
 
    @Override
   	public List<PlProductAreaVo> getAreaIdByProductId(String id) {
       	List<PlProductAreaVo> orderCrmCode = plProductAreaVoMapper.getAreaIdByProductId(id);
   		
   		return orderCrmCode;
   	}
}