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
@RequestMapping("/plproductinfostatuschange/api")
@Api(value = "商品状态变更服务")
public class PlProductInfoStatusChangeController {

	@Resource
	private PlProductInfoVoService plProductInfoServices;
	@Resource
	private PlPresentInfoVoService plPresentInfoServices;
	@Resource
	private PlGiftInfoVoService plGiftInfoServices;
	
	@ApiOperation(value="商品状态变更服务",notes="提供商品上架状态变更服务，商品上架、下架、审核、退市、作废等操作时调用。")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="productStatus",value="入参为商品状态（未上架=0,上架待审核=1,已上架=2,已下架=4，已退市=5，已作废=6，已审核待上架=7，上架中=8，下架中=9）", required = true, dataType = "String",paramType = "query")
	})
	@RequestMapping(value = "/productStatus_changeService", method=RequestMethod.POST)
	@ResponseBody
	public void productStatusChangeService(@RequestParam String productCode,@RequestParam String productStatus,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		if(null != productCode && !"".equals(productCode) && null != productStatus && !"".equals(productStatus)){
			Condition condition1 = new Condition(PlProductInfoVo.class);
			Condition.Criteria criteria1 = condition1.createCriteria();
			criteria1.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			
			Condition condition2 = new Condition(PlPresentInfoVo.class);
			Condition.Criteria criteria2 = condition2.createCriteria();
			criteria2.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			
			Condition condition3 = new Condition(PlGiftInfoVo.class);
			Condition.Criteria criteria3 = condition3.createCriteria();
			criteria3.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			List<PlProductInfoVo> ppiList = plProductInfoServices.selectByCondition(condition1);
			List<PlPresentInfoVo> priList = plPresentInfoServices.selectByCondition(condition2);
			List<PlGiftInfoVo> pgiList = plGiftInfoServices.selectByCondition(condition3);
			for(PlProductInfoVo ppTemp:ppiList){
				ppTemp.setProductStatus(productStatus);
				plProductInfoServices.updateByPrimaryKeySelective(ppTemp);
			}
			for(PlPresentInfoVo ppTemp:priList){
				ppTemp.setProductStatus(productStatus);
				plPresentInfoServices.updateByPrimaryKeySelective(ppTemp);
			}
			for(PlGiftInfoVo ppTemp:pgiList){
				ppTemp.setProductStatus(productStatus);
				plGiftInfoServices.updateByPrimaryKeySelective(ppTemp);
			}
			jsonData="{\"result\":\"0\"}";
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
	
}