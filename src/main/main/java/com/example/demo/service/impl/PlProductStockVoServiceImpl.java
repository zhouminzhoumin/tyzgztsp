package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.PlProductStockVoMapper;
import com.example.demo.model.PlProductStockVo;
import com.example.demo.service.PlProductStockVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 



import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class PlProductStockVoServiceImpl extends ServiceImpl<PlProductStockVo> implements PlProductStockVoService {
    @Resource
    private PlProductStockVoMapper plProductStockVoMapper;
 
    @Override
    public List<PlProductStockVo> getProductStockByPid(String warehouseType,String productId) {
    	List<PlProductStockVo> plProductStock = plProductStockVoMapper.getProductStockByPid(warehouseType,productId);
		
		return plProductStock;
	}
    
    @Override
    public void updateShelvesClearById(String id) {
    	plProductStockVoMapper.updateShelvesClearById(id);
	}
    
}