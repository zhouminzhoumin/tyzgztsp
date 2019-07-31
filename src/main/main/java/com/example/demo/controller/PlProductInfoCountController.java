package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;
import tk.mybatis.mapper.entity.Condition;

import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.model.PlProductVo;
import com.example.demo.service.PlGiftInfoVoService;
import com.example.demo.service.PlPresentInfoVoService;
import com.example.demo.service.PlProductInfoVoService;
import com.example.demo.service.PlProductVoService;
import com.example.demo.util.UPlatDateUtils;
import com.example.demo.util.UPlatJsonUtils;
import com.example.demo.util.UPlatStringUtils;


/**
 * Created by zhoumin on 2019/06/13.
 */
@RestController
@RequestMapping("/plproductinfocount/api")
@Api(value = "商品数量查询服务")
public class PlProductInfoCountController {

	@Resource
	private PlProductInfoVoService plProductInfoServices;
	@Resource
	private PlGiftInfoVoService plGiftInfoServices;
	@Resource
	private PlPresentInfoVoService plPresentInfoServices;

	
	
	@ApiOperation(value="商品数量查询服务",notes="提供商品销售数量等信息查询服务，主要包含商品编码、数量1、数量2、……等。")
	@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query")
	@RequestMapping(value = "/productCount_queryService", method=RequestMethod.POST)
	@ResponseBody
	public void productCountQueryService(@RequestParam String productCode,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="";
		if(null != productCode && !"".equals(productCode)){
			if(productCode.indexOf("LP") >= 0){
				PlPresentInfoVo presentInfoVo = plPresentInfoServices.getProductCountByProductCode(productCode);
				if(null != presentInfoVo){
					jsonData = UPlatJsonUtils.bean2json(presentInfoVo);
				}
			}else if(productCode.indexOf("ZP") >= 0){
				PlGiftInfoVo giftInfoVo = plGiftInfoServices.getProductCountByProductCode(productCode);
				if(null != giftInfoVo){
					jsonData = UPlatJsonUtils.bean2json(giftInfoVo);
				}
			}else{
				PlProductInfoVo productInfoVo = plProductInfoServices.getProductCountByProductCode(productCode);
				if(null != productInfoVo){
					jsonData = UPlatJsonUtils.bean2json(productInfoVo);
				}
			}
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 

}