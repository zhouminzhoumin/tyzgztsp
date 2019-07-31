
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.ImStockProductVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
public interface ImStockProductVoService extends Service<ImStockProductVo> {
	
	public List<ImStockProductVo> getZPByProductCdAndSup(String productCd,String supplierCode,String propertyCode);
	
	public List<ImStockProductVo> getAllByProductCdAndSup(String productCd,String supplierCode,String propertyCode);
 

}