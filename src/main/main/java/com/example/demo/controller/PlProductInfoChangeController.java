package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.mapper.entity.Condition;

import com.example.demo.model.PlProductInfoVo;
import com.example.demo.service.PlProductInfoVoService;


/**
 * Created by zhoumin on 2019/06/13.
 */
@RestController
@RequestMapping("/plproductinfochange/api")
@Api(value = "商品信息变更服务")
public class PlProductInfoChangeController {

	@Resource
	private PlProductInfoVoService plProductInfoServices;
	
	@ApiOperation(value="商品价格变更服务-直供价",notes="支持变更商品直供价格。")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="zgPrice",value="入参为新价格", required = true, dataType = "BigDecimal",paramType = "query")
	})
	@RequestMapping(value = "/productZgPrice_changeService", method=RequestMethod.POST)
	@ResponseBody
	public void productZgPriceChangeService(@RequestParam String productCode,@RequestParam BigDecimal zgPrice,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		if(null != productCode && !"".equals(productCode)){
			Condition condition1 = new Condition(PlProductInfoVo.class);
			Condition.Criteria criteria1 = condition1.createCriteria();
			criteria1.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			
			List<PlProductInfoVo> ppiList = plProductInfoServices.selectByCondition(condition1);
			
			if(null != ppiList && ppiList.size() > 0){
				PlProductInfoVo ppiTemp = ppiList.get(0);
				ppiTemp.setZgPrice(zgPrice);
				plProductInfoServices.updateByPrimaryKeySelective(ppiTemp);
				jsonData="{\"result\":\"0\"}";
			}
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
	
	@ApiOperation(value="商品价格变更服务-零售价",notes="支持变更商品零售价格。")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="retailPrice",value="入参为新价格", required = true, dataType = "BigDecimal",paramType = "query")
	})
	@RequestMapping(value = "/productRetailPrice_changeService", method=RequestMethod.POST)
	@ResponseBody
	public void productRetailPriceChangeService(@RequestParam String productCode,@RequestParam BigDecimal retailPrice,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		if(null != productCode && !"".equals(productCode)){
			Condition condition1 = new Condition(PlProductInfoVo.class);
			Condition.Criteria criteria1 = condition1.createCriteria();
			criteria1.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			
			List<PlProductInfoVo> ppiList = plProductInfoServices.selectByCondition(condition1);
			
			if(null != ppiList && ppiList.size() > 0){
				PlProductInfoVo ppiTemp = ppiList.get(0);
				ppiTemp.setRetailPrice(retailPrice);
				plProductInfoServices.updateByPrimaryKeySelective(ppiTemp);
				jsonData="{\"result\":\"0\"}";
			}
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
	
	@ApiOperation(value="商品上架数量变更服务",notes="支持变更商品上架数量。")
	@ApiImplicitParams({ 
//		@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query"),
//		@ApiImplicitParam(name="retailPrice",value="入参为新价格", required = true, dataType = "BigDecimal",paramType = "query")
	})
	@RequestMapping(value = "/productShelvesCount_changeService", method=RequestMethod.POST)
	@ResponseBody
	public void productShelvesCountChangeService(@RequestParam String productCode,@RequestParam BigDecimal retailPrice,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		if(null != productCode && !"".equals(productCode)){
			
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
}