package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.mapper.entity.Condition;

import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.service.PlGiftInfoVoService;
import com.example.demo.service.PlPresentInfoVoService;
import com.example.demo.service.PlProductInfoVoService;


/**
 * Created by zhoumin on 2019/06/13.
 */
@RestController
@RequestMapping("/plproductinfostatusquery/api")
@Api(value = "商品状态查询服务")
public class PlProductInfoStatusQueryController {

	@Resource
	private PlProductInfoVoService plProductInfoServices;
	@Resource
	private PlPresentInfoVoService plPresentInfoServices;
	@Resource
	private PlGiftInfoVoService plGiftInfoServices;
	
	@ApiOperation(value="商品状态查询服务",notes="提供商品状态查询服务，用户进行相关操作时查询商品状态。（只返回商品表的状态，不包括礼品表和赠品表）")
	@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query")
	@RequestMapping(value = "/productStatus_QueryService", method=RequestMethod.POST)
	@ResponseBody
	public void productStatusQueryService(@RequestParam String productCode,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"productStatus\":\"\"}";
		if(null != productCode && !"".equals(productCode)){
			Condition condition1 = new Condition(PlProductInfoVo.class);
			Condition.Criteria criteria1 = condition1.createCriteria();
			criteria1.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			
//			Condition condition2 = new Condition(PlPresentInfoVo.class);
//			Condition.Criteria criteria2 = condition2.createCriteria();
//			criteria2.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
//			
//			Condition condition3 = new Condition(PlGiftInfoVo.class);
//			Condition.Criteria criteria3 = condition3.createCriteria();
//			criteria3.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			List<PlProductInfoVo> ppiList = plProductInfoServices.selectByCondition(condition1);
//			List<PlPresentInfoVo> priList = plPresentInfoServices.selectByCondition(condition2);
//			List<PlGiftInfoVo> pgiList = plGiftInfoServices.selectByCondition(condition3);
			if(null != ppiList && ppiList.size() > 0){
				jsonData="{\"productStatus\":\""+ppiList.get(0).getProductStatus()+"\"}";
			}
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
	
}