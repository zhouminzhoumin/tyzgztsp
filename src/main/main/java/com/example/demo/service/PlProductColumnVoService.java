
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PlProductColumnVo;
import com.example.demo.common.Service;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
public interface PlProductColumnVoService extends Service<PlProductColumnVo> {
 
	public List<PlProductColumnVo> getProductColumnById(String id);

}