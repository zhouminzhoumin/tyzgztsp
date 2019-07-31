
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.PlProductStockVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
public interface PlProductStockVoService extends Service<PlProductStockVo> {
	public List<PlProductStockVo> getProductStockByPid(String warehouseType,String productId);
	
	public void updateShelvesClearById(String id);
}