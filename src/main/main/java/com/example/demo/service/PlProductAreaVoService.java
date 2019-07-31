
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.PlProductAreaVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
public interface PlProductAreaVoService extends Service<PlProductAreaVo> {
	
	public List<PlProductAreaVo> getAreaIdByProductId(String id);

}