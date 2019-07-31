
package com.example.demo.service;
import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/09.
 */
public interface PlGiftInfoVoService extends Service<PlGiftInfoVo> {

	public String getZPMaxProductCode();
 
	public PlGiftInfoVo getProductCountByProductCode(String productCode);

}