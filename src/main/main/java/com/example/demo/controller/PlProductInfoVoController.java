package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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
@RequestMapping("/plproductinfovo/api")
@Api(value = "商品基本信息服务")
public class PlProductInfoVoController {

	@Resource
	private PlProductInfoVoService services;
	@Resource
	private PlProductVoService ppServices;
	@Resource
	private PlGiftInfoVoService plGiftInfoVoService;
	@Resource
	private PlPresentInfoVoService plPresentInfoVoService;

	@ApiIgnore
	@ApiOperation(value="获取实体列表",notes="根据查询条件获取实体列表")
	@ApiImplicitParam(name="request",value="查询条件", required = true, dataType = "HttpServletRequest")
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	@ResponseBody
	public List<PlProductInfoVo> list(HttpServletRequest request) {

		Condition condition = new Condition(PlProductInfoVo.class);
		Condition.Criteria criteria = condition.createCriteria();
		criteria.andCondition(" ID ='' ");
		List<PlProductInfoVo> list = services.selectByCondition(condition);
		return list;
	}
	
	@ApiIgnore
	@ApiOperation(value="获取单个实体值",notes="根据id获取实体信息")
	@ApiImplicitParam(name="id",value="实体id值", required = true, dataType = "String")
	@RequestMapping(value = "/get_one", method=RequestMethod.GET)
	@ResponseBody
	public Object get_one(String id) {
		PlProductInfoVo model = services.selectByPrimaryKey(id);
		return model;
	}
	
	@ApiIgnore
	@ApiOperation(value="新增实体信息",notes="新增实体信息")
	@ApiImplicitParam(name="model",value="实体值", required = true, dataType = "productInfo")
	@RequestMapping(value = "/add_one",method=RequestMethod.POST)
	@ResponseBody
	public Object add_one(@RequestBody PlProductInfoVo model) {
		services.insertSelective(model);
		return true;
	}

	@ApiIgnore
	@ApiOperation(value="批量增加实体信息",notes="批量增加实体信息")
	@ApiImplicitParam(name="model",value="实体集合List<PlProductInfoVo>", required = true, dataType = "List<PlProductInfoVo>")
	@RequestMapping(value = "/add_multiple",method=RequestMethod.POST)
	@ResponseBody
	public Object add_multiple(@RequestBody List<PlProductInfoVo> model) {
		services.insertList(model);
		return true;
	}

	@ApiIgnore
	@ApiOperation(value="编辑实体信息",notes="维护编辑实体信息")
	@ApiImplicitParam(name="model",value="实体值", required = true, dataType = "PlProductInfoVo")
	@RequestMapping(value = "/edit_one",method=RequestMethod.POST)
	@ResponseBody
	public Object edit_one(@RequestBody PlProductInfoVo model) {
		services.updateByPrimaryKeySelective(model);
		return true;
	}

	@ApiIgnore
	@ApiOperation(value="删除单个",notes="根据id删除信息")
	@ApiImplicitParam(name="id",value="实体id值", required = true, dataType = "String")
	@RequestMapping(value = "/delete_one", method=RequestMethod.GET)
	@ResponseBody
	public Object delete_one(String id) {
		services.deleteByPrimaryKey(id);
		return true;
	}
	
	@ApiIgnore
	@ApiOperation(value="批量删除",notes="根据ids批量删除信息")
	@ApiImplicitParam(name="ids",value="id的集合等", required = true, dataType = "String")
	@RequestMapping(value = "/delete_multiple", method=RequestMethod.GET)
	@ResponseBody
	public Object delete_multiple(@RequestBody String ids) {
		services.deleteByIds(ids);
		return true;
	}
	
	@ApiOperation(value="商品主信息服务",notes="维护编辑商品的主信息<br/>"
			+ "数据项	    是否必填	描述<br/>"
			+ "产品编码	是	唯一25位编码<br/>"
			+ "商品类别	是	商品、礼品、赠品，主数据服务提供具体数据项<br/>"
			+ "商品名称1	是	商品名称，主数据服务提供具体数据项<br/>"
			+ "商品名称2	否	商品名称<br/>"
			+ "价格1		是	商品价格，主数据服务提供具体数据项 <br/>"
			+ "价格2		否	商品价格<br/>"
			+ "供货商信息	是	供货商信息")
	@ApiImplicitParam(name="productInfo",value="商品赠品礼品等主信息实体，只需几个主要信息，其他可以不填", required = true, dataType = "PlProductInfoVo")
	@RequestMapping(value = "/edit_mainInfo", method=RequestMethod.POST)
	@ResponseBody
	public void edit_mainInfo(@RequestBody PlProductInfoVo productInfo,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		try {
			//response.getWriter().write("{\"status\":\"success\",\"code\":\"10001\",\"msg\":\"获取成功\",\"data\":"+UPlatJsonUtils.list2json2(list)+"}");
			if(null!=productInfo&&!"".equals(productInfo.getProductCdEighteen())
					&&!"".equals(productInfo.getType())&&!"".equals(productInfo.getProductName())
					&&!"".equals(productInfo.getZgPrice())&&!"".equals(productInfo.getZgPrice())){
				String pInfoId=UPlatStringUtils.GetUUID();
				productInfo.setId(pInfoId);
				productInfo.setCreateDate(UPlatDateUtils.getSysTimestamp());
				if("S".equals(productInfo.getType())){
					productInfo.setProductCode(services.getMaxProductCode()+"");
					services.insert(productInfo);
					response.getWriter().write("{\"msg\":\"保存成功\",\"code\":\"0\",\"status\":\"success\",\"productCode\":\""+productInfo.getProductCode()+"\"}");
				}else if("L".equals(productInfo.getType())){//礼品
					PlPresentInfoVo plPresentInfo=new PlPresentInfoVo();
					BeanUtils.copyProperties(productInfo, plPresentInfo);
					plPresentInfo.setProductCode(plPresentInfoVoService.getLPMaxProductCode());
					response.getWriter().write("{\"msg\":\"保存成功\",\"code\":\"0\",\"status\":\"success\",\"productCode\":\""+plPresentInfo.getProductCode()+"\"}");
					plPresentInfoVoService.insert(plPresentInfo);
				}else if("Z".equals(productInfo.getType())){//赠品
					PlGiftInfoVo plGiftInfo = new PlGiftInfoVo();
					BeanUtils.copyProperties(productInfo, plGiftInfo);
					plGiftInfo.setProductCode(plGiftInfoVoService.getZPMaxProductCode());
					response.getWriter().write("{\"msg\":\"保存成功\",\"code\":\"0\",\"status\":\"success\",\"productCode\":\""+plGiftInfo.getProductCode()+"\"}");
					plGiftInfoVoService.insert(plGiftInfo);
				}else{
					response.getWriter().write("{\"msg\":\"商品类型不对，只能是赠品礼品商品S、Z、L\",\"code\":\"1\",\"status\":\"error\"}");
				}
			}else{
				//0是成功1是失败
				response.getWriter().write("{\"msg\":\"传入的参数值不全，请检查\",\"code\":\"1\",\"status\":\"error\"}");
			}
		} catch (IOException e) {
			response.getWriter().write("{\"msg\":\""+e.getMessage()+"\",\"code\":\"1\",\"status\":\"error\"}");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	@ApiOperation(value="商品主信息调用服务",notes="根据商品编码查询商品")
	@ApiImplicitParam(name="productCode",value="商品编码", required = true, dataType = "string",paramType = "query")
	@RequestMapping(value = "/getMainProductByCode", method=RequestMethod.GET)
	@ResponseBody
	public void getMainProductByCode(@RequestParam String productCode,HttpServletResponse response) throws IOException  {
		response.setContentType("text/html;charset=utf-8");
		PlProductInfoVo plProduct = services.getProductByCode(productCode);
		String jsonData="";
		if(null!=plProduct){
			jsonData = UPlatJsonUtils.bean2json(plProduct);
		}
		response.getWriter().write(jsonData);
	}
	
	@ApiOperation(value="商品基本信息服务-",notes="维护编辑商品的基本信息，包含商品主信息外的其他信息，"
			+ "例如商品的品牌、颜色、型号、别名、自注册型号、版本、产品编码、产品名称、泛智能类型、上架数量、商品状态、审核状态等。<br/>"
			+ "考虑直接用主服务存所有商品信息。")
	@ApiImplicitParam(name="productInfo",value="商品赠品礼品等基本信息实体，具体必填项见操作文档。"
			+ "注意，当主信息和基本信息同时保存为一个的时候，基本信息需要传商品code", required = true, dataType = "PlProductInfoVo")
	@RequestMapping(value = "/edit_baseInfo", method=RequestMethod.POST)
	@ResponseBody
	public void edit_baseInfo(@RequestBody PlProductInfoVo productInfo,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		try {
			//response.getWriter().write("{\"status\":\"success\",\"code\":\"10001\",\"msg\":\"获取成功\",\"data\":"+UPlatJsonUtils.list2json2(list)+"}");
			if(null!=productInfo&&!"".equals(productInfo.getProductCdEighteen())
					&&!"".equals(productInfo.getType())&&!"".equals(productInfo.getProductName())
					&&!"".equals(productInfo.getZgPrice())&&!"".equals(productInfo.getZgPrice())){
				String pInfoId=UPlatStringUtils.GetUUID();
				productInfo.setId(pInfoId);
				productInfo.setCreateDate(UPlatDateUtils.getSysTimestamp());
				if("S".equals(productInfo.getType())){
					productInfo.setProductCode(services.getMaxProductCode()+"");
					services.insert(productInfo);
					response.getWriter().write("{\"msg\":\"保存成功\",\"code\":\"0\",\"status\":\"success\",\"productCode\":\""+productInfo.getProductCode()+"\"}");
				}else if("L".equals(productInfo.getType())){//礼品
					PlPresentInfoVo plPresentInfo=new PlPresentInfoVo();
					BeanUtils.copyProperties(productInfo, plPresentInfo);
					plPresentInfo.setProductCode(plPresentInfoVoService.getLPMaxProductCode());
					response.getWriter().write("{\"msg\":\"保存成功\",\"code\":\"0\",\"status\":\"success\",\"productCode\":\""+plPresentInfo.getProductCode()+"\"}");
					plPresentInfoVoService.insert(plPresentInfo);
				}else if("Z".equals(productInfo.getType())){//赠品
					PlGiftInfoVo plGiftInfo = new PlGiftInfoVo();
					BeanUtils.copyProperties(productInfo, plGiftInfo);
					plGiftInfo.setProductCode(plGiftInfoVoService.getZPMaxProductCode());
					response.getWriter().write("{\"msg\":\"保存成功\",\"code\":\"0\",\"status\":\"success\",\"productCode\":\""+plGiftInfo.getProductCode()+"\"}");
					plGiftInfoVoService.insert(plGiftInfo);
				}else{
					response.getWriter().write("{\"msg\":\"商品类型不对，只能是赠品礼品商品S、Z、L\",\"code\":\"1\",\"status\":\"error\"}");
				}
			}else{
				//0是成功1是失败
				response.getWriter().write("{\"msg\":\"传入的参数值不全，请检查\",\"code\":\"1\",\"status\":\"error\"}");
			}
		} catch (IOException e) {
			response.getWriter().write("{\"msg\":\""+e.getMessage()+"\",\"code\":\"1\",\"status\":\"error\"}");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	@ApiOperation(value="商品基本信息调用服务",notes="提供商品的基本信息调用服务，包含商品主信息外的其他信息，例如商品的品牌、颜色、型号、别名、自注册型号、版本、25位编码、泛智能类型、库存、商品状态、审核状态等。")
	@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String")
	@RequestMapping(value = "/baseInfo_callService", method=RequestMethod.POST)
	@ResponseBody
	public void baseInfoCallService(@RequestBody String productCode,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="";
		if(null != productCode && !"".equals(productCode)){
			Condition condition1 = new Condition(PlProductInfoVo.class);
			Condition.Criteria criteria1 = condition1.createCriteria();
			criteria1.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
			
			List<PlProductInfoVo> ppiList = services.selectByCondition(condition1);
			
			if(null != ppiList && ppiList.size() > 0){
				PlProductInfoVo ppiTemp = ppiList.get(0);
				Condition condition = new Condition(PlProductVo.class);
				Condition.Criteria criteria = condition.createCriteria();
				criteria.andCondition(" PRODUCT_CD ='"+ppiTemp.getProductCdEighteen()+"' ");
				List<PlProductVo> list = ppServices.selectByCondition(condition);
				if(null != list && list.size() > 0){
					ppiTemp.setBrandName(list.get(0).getBrandName());
					ppiTemp.setProductModel(list.get(0).getProductModel());
					ppiTemp.setColorName(list.get(0).getColorName());
					ppiTemp.setFiled3(list.get(0).getFiled3());
					ppiTemp.setFiled4(list.get(0).getFiled4());
					ppiTemp.setFiled5(list.get(0).getFiled5());
				}
				PlProductInfoVo ppiVo = services.getMostProductInfoByProductCode(productCode);
				if(null != ppiVo){
					ppiTemp.setTypeName(ppiVo.getTypeName());
				}
				jsonData = UPlatJsonUtils.bean2json(ppiTemp);
			}else{
				//do nothing
			}
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 

}