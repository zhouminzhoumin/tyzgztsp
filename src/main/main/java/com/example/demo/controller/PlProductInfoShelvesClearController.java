package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.mapper.entity.Condition;

import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.model.PlProductStockVo;
import com.example.demo.service.PlGiftInfoVoService;
import com.example.demo.service.PlPresentInfoVoService;
import com.example.demo.service.PlProductInfoVoService;
import com.example.demo.service.PlProductStockVoService;


/**
 * Created by zhoumin on 2019/06/13.
 */
@RestController
@RequestMapping("/plproductinfoshelvesclear/api")
@Api(value = "商品上架数量清零服务")
public class PlProductInfoShelvesClearController {

	@Resource
	private PlProductInfoVoService plProductInfoServices;
	@Resource
	private PlPresentInfoVoService plPresentInfoServices;
	@Resource
	private PlGiftInfoVoService plGiftInfoServices;
	@Resource
	private PlProductStockVoService plProductStockVoService;
	
	@ApiOperation(value="商品上架数量清零服务",notes="提供商品数量变更服务，商品下架、退市、作废等操作时调用。")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="shelvesAmount",value="上架数量", required = true, dataType = "Integer",paramType = "query")
	})
	@RequestMapping(value = "/productShelves_clearService", method=RequestMethod.POST)
	@ResponseBody
	public void productShelvesClearService(@RequestParam String productCode,@RequestParam Integer shelvesAmount,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		if(null != productCode && !"".equals(productCode)
				&& null != shelvesAmount && !"".equals(shelvesAmount)){
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
			try {
				PlProductInfoVo productInfo = new PlProductInfoVo();
				String warehouseType = "";
				for(PlProductInfoVo ppiTemp:ppiList){
					productInfo = ppiTemp;
					ppiTemp.setShelvesSum(shelvesAmount);
					ppiTemp.setShelvesStartDate(new Date());
					warehouseType = "01";
					plProductInfoServices.updateByPrimaryKeySelective(ppiTemp);
				}
				for(PlPresentInfoVo priTemp:priList){
					BeanUtils.copyProperties(priTemp, productInfo);
					priTemp.setShelvesSum(shelvesAmount);
					priTemp.setShelvesStartDate(new Date());
					warehouseType = "02";
					plPresentInfoServices.updateByPrimaryKeySelective(priTemp);
				}
				for(PlGiftInfoVo pgiTemp:pgiList){
					BeanUtils.copyProperties(pgiTemp, productInfo);
					pgiTemp.setShelvesSum(shelvesAmount);
					pgiTemp.setShelvesStartDate(new Date());
					warehouseType = "02";
					plGiftInfoServices.updateByPrimaryKeySelective(pgiTemp);
				}
				
	    		List<PlProductStockVo> productStocks = plProductStockVoService.getProductStockByPid(warehouseType, productInfo.getId());
	    		for(PlProductStockVo stockProduct:productStocks){
	    			if(stockProduct.getStockId().equals("-1")){
	    				continue;
	    			}
	    			stockProduct.setInstcokSum(stockProduct.getFreezeWaitauditSum()+stockProduct.getFreezeWaitpaySum()+stockProduct.getWaitoutSum()); //在库数量=待发货，待审核，冻结等数量不变
	    			stockProduct.setInstockMaysaleSum(0L); //可销售数量为0
	    			stockProduct.setShelvesSum(0);
	    			plProductStockVoService.updateShelvesClearById(stockProduct.getId());
	    		}
	    		
				if(null != ppiList && ppiList.size() > 0){
					jsonData="{\"result\":\"0\"}";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
	
}