package com.example.demo.service.impl;
 
import java.util.List;

import com.example.demo.dao.ImStockProductVoMapper;
import com.example.demo.model.ImStockProductVo;
import com.example.demo.service.ImStockProductVoService;
import com.example.demo.common.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 




import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class ImStockProductVoServiceImpl extends ServiceImpl<ImStockProductVo> implements ImStockProductVoService {
    @Resource
    private ImStockProductVoMapper imStockProductVoMapper;
 
    @Override
    public List<ImStockProductVo> getZPByProductCdAndSup(String productCd,String supplierCode,String propertyCode) {
    	List<ImStockProductVo> imStockProduct = imStockProductVoMapper.getZPByProductCdAndSup(productCd,supplierCode,propertyCode);
		
		return imStockProduct;
	}
    
    @Override
    public List<ImStockProductVo> getAllByProductCdAndSup(String productCd,String supplierCode,String propertyCode) {
    	List<ImStockProductVo> ImStockProductVo = imStockProductVoMapper.getAllByProductCdAndSup(productCd,supplierCode,propertyCode);
		
		return ImStockProductVo;
	}
    
}