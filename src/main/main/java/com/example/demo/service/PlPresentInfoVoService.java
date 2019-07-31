
package com.example.demo.service;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/11.
 */
public interface PlPresentInfoVoService extends Service<PlPresentInfoVo> {

	public String getLPMaxProductCode();
 
	public PlPresentInfoVo getProductCountByProductCode(String productCode);

}