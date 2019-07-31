
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.ProductColumnVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
public interface ProductColumnVoService extends Service<ProductColumnVo> {
 
	public List<ProductColumnVo> getInfoByProvinceCode(String provinceCode);
}