
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.PlProductInfoVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/06/13.
 */
public interface PlProductInfoVoService extends Service<PlProductInfoVo> {

	public Integer getMaxProductCode();

	public PlProductInfoVo getProductByCode(String productCode);
	
	public PlProductInfoVo getMostProductInfoByProductCode(String productCode);

	public PlProductInfoVo getProductCountByProductCode(String productCode);
	
	public List<PlProductInfoVo> getAllById(String id);
 
}