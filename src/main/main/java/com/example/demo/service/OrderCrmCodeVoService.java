
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.OrderCrmCodeVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
public interface OrderCrmCodeVoService extends Service<OrderCrmCodeVo> {
 
	public List<OrderCrmCodeVo> getInfoByProvinceCode(String provinceCode);

}