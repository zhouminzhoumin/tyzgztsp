
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.PlProductLimitPriceVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/18.
 */
public interface PlProductLimitPriceVoService extends Service<PlProductLimitPriceVo> {
	public List<PlProductLimitPriceVo> getPlProductLimitPriceByPlProductInfoId(String productId,String provinceCode);
}