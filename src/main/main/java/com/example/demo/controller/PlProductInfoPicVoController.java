package com.example.demo.controller;
 
import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductAccessoryVo;
import com.example.demo.model.PlProductInfoPicVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.model.PlProductPicVo;
import com.example.demo.model.PlProductVo;
import com.example.demo.service.PlGiftInfoVoService;
import com.example.demo.service.PlPresentInfoVoService;
import com.example.demo.service.PlProductAccessoryVoService;
import com.example.demo.service.PlProductInfoPicVoService;
import com.example.demo.service.PlProductInfoVoService;
import com.example.demo.service.PlProductPicVoService;
import com.example.demo.util.CopyUtil;
import com.example.demo.util.UPlatJsonUtils;
import com.example.demo.util.UPlatStringUtils;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.mapper.entity.Condition;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
 
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
 
/**
* Created by zhoumin on 2019/07/15.
*/
@RestController
@RequestMapping("/plproductinfopicvo/api")
@Api(value = "商品图片信息服务")
public class PlProductInfoPicVoController {
 
    @Resource
    private PlProductInfoPicVoService services;
    
    @Resource
    private PlProductPicVoService productPicServices;
    
    @Resource
	private PlProductInfoVoService productServices;
    
    @Resource
	private PlPresentInfoVoService presentServices;
    
    @Resource
	private PlGiftInfoVoService giftServices;
    
    @Resource
    private PlProductAccessoryVoService accessoryServices;
 
	@ApiIgnore
 	@ApiOperation(value="获取实体列表",notes="根据查询条件获取实体列表")
	@ApiImplicitParam(name="request",value="查询条件", required = true, dataType = "HttpServletRequest")
    @RequestMapping(value ="/list", method=RequestMethod.GET)
    public List<PlProductInfoPicVo> list(HttpServletRequest request) {

    	Condition condition =new Condition(PlProductInfoPicVo.class);
    	Condition.Criteria criteria = condition.createCriteria();
    	criteria.andCondition(" ID ='' ");
    	List<PlProductInfoPicVo> list =services.selectByCondition(condition);
        return  list;
    }
    @ApiIgnore
	@ApiOperation(value="获取单个实体值",notes="根据id获取实体信息")
	@ApiImplicitParam(name="id",value="实体id值", required = true, dataType = "String")
    @RequestMapping(value = "/get_one", method=RequestMethod.GET)
    @ResponseBody
    public Object get_one(String id) {
        PlProductInfoPicVo model = services.selectByPrimaryKey(id);
        return model;
        }
        
 	@ApiIgnore
	@ApiOperation(value="新增实体信息",notes="新增实体信息")
	@ApiImplicitParam(name="model",value="实体值", required = true, dataType = "PlProductInfoPicVo")
    @RequestMapping(value = "/add_one", method=RequestMethod.POST)
    @ResponseBody
    public Object add_one(@RequestBody PlProductInfoPicVo model) {
   		services.insertSelective(model);
        return true;
    }
    
 	@ApiIgnore
	@ApiOperation(value="批量增加实体信息",notes="批量增加实体信息")
	@ApiImplicitParam(name="model",value="实体集合List<PlProductInfoPicVo>", required = true, dataType = "List<PlProductInfoPicVo>")
    @RequestMapping(value = "/add_multiple", method=RequestMethod.POST)
    @ResponseBody
    public Object add_multiple(@RequestBody List<PlProductInfoPicVo> model) {
        services.insertList(model);
        return true;
     }
     
    @ApiIgnore
 	@ApiOperation(value="编辑实体信息",notes="维护编辑实体信息")
	@ApiImplicitParam(name="model",value="实体值", required = true, dataType = "PlProductInfoPicVo")
    @RequestMapping(value = "/edit_one", method=RequestMethod.POST)
    @ResponseBody
    public Object edit_one(@RequestBody PlProductInfoPicVo model) {
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
        //ids 1,2,3,4
    public Object delete_multiple(@RequestBody String ids) {
        services.deleteByIds(ids);
        return true;
    }
 	
 	@ApiOperation(value="商品图片同步服务",notes="记录和保存从产品图片信息中同步的图片文件。")
//	@ApiImplicitParams({ 
//		@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String"),
//		@ApiImplicitParam(name="productPicType",value="入参为商品图片类型", required = true, dataType = "String"),
//		@ApiImplicitParam(name="productPicUrl",value="入参为商品图片url", required = true, dataType = "String")
//	})
 	@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String")
	@RequestMapping(value = "/productPic_sync", method=RequestMethod.POST)
	@ResponseBody
	public void productPicSync(@RequestBody String productCode,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		try {
			if(null != productCode && !"".equals(productCode)){
		    	PlProductInfoVo productInfo=new PlProductInfoVo();
		    	PlGiftInfoVo plGiftInfo=new PlGiftInfoVo();
		    	PlPresentInfoVo plPresentInfo  = new PlPresentInfoVo();
		    	Condition condition = new Condition(PlGiftInfoVo.class);
				Condition.Criteria criteria = condition.createCriteria();
				criteria.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
	    		List<PlProductInfoVo> productList = productServices.selectByCondition(condition);
	    		if(null != productList && productList.size() > 0){
	    			productInfo = productList.get(0);
	    		}else{
	    			List<PlGiftInfoVo> giftList = giftServices.selectByCondition(condition);
		    		if(null != giftList && giftList.size() > 0){
		    			plGiftInfo = giftList.get(0);
		    			BeanUtils.copyProperties(plGiftInfo, productInfo);
		    		}else{
		    			List<PlPresentInfoVo> presentList = presentServices.selectByCondition(condition);
			    		if(null != presentList && presentList.size() > 0){
			    			plPresentInfo = presentList.get(0);
			    			BeanUtils.copyProperties(plPresentInfo, productInfo);
			    		}else{
			    			//do noting
			    			response.getWriter().write("{\"productCode\":\""+productCode+"\",\"result\":\"1\"}");
			    			return;
			    		}
		    		}
	    		}
	    		
	    		Condition condition1 = new Condition(PlProductPicVo.class);
				Condition.Criteria criteria1 = condition1.createCriteria();
				criteria1.andCondition(" PRODUCT_ID ='"+productInfo.getEcsProductId()+"' ");
				
		    	List<PlProductPicVo> productPics = productPicServices.selectByCondition(condition1); //获取目前产品所有图片
		    	if(productPics != null && productPics.size() > 0){
		    		Condition condition2 = new Condition(PlProductInfoPicVo.class);
					Condition.Criteria criteria2 = condition2.createCriteria();
					criteria2.andCondition(" PRODUCT_ID ='"+productInfo.getId()+"' ");
			    	List<PlProductInfoPicVo> productInfoPics = services.selectByCondition(condition2);//获取商品目前图片，将他干掉后复制新的产品图片入库
			    	for(PlProductInfoPicVo picTemp:productInfoPics){
			    		services.deleteByIds("'"+picTemp.getId()+"'");
			    	}
//			    	PlProductInfoPicVo[] infoPics = new PlProductInfoPicVo[productPics.size()];
			    	List<PlProductInfoPicVo> infoPics = new ArrayList<PlProductInfoPicVo>();
			    	
			    	for(int i = 0; i < productPics.size(); i++){  //新增
			    		PlProductPicVo pic=productPics.get(i);
		 				PlProductInfoPicVo productInfoPic = new PlProductInfoPicVo();
		 				CopyUtil.Copy(pic, productInfoPic);
		 				productInfoPic.setId(UPlatStringUtils.GetUUID());
		 				productInfoPic.setProductId(productInfo.getProductId());
		 				infoPics.add(productInfoPic);
					}
			    	for(PlProductInfoPicVo picTemp:infoPics){
			    		services.insert(picTemp);
			    	}
			    	response.getWriter().write("{\"productCode\":\""+productCode+"\",\"result\":\"0\"}");
					
		    	}else{
		    		response.getWriter().write("{\"productCode\":\""+productCode+"\",\"result\":\"1\"}");
		    	}
	    		
			}else{
				response.getWriter().write("{\"productCode\":\""+productCode+"\",\"result\":\"1\"}");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("{\"productCode\":\""+productCode+"\",\"result\":\"1\"}");
		}
		
	} 
 	
 	@ApiOperation(value="商品图片调用服务",notes="提供商品图片信息调用服务。返回结果为根据当前商品查询到该商品在PL_PRODUCT_INFO_PIC表中的所有类型的图片")
 	@ApiImplicitParam(name="productCode",value="入参为商品编码（唯一7位商品编码标识）", required = true, dataType = "String")
	@RequestMapping(value = "/productPic_callService", method=RequestMethod.POST)
	@ResponseBody
	public void productPicCallService(@RequestBody String productCode,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="";
		try {
			if(null != productCode && !"".equals(productCode)){
		    	PlProductInfoVo productInfo=new PlProductInfoVo();
		    	PlGiftInfoVo plGiftInfo=new PlGiftInfoVo();
		    	PlPresentInfoVo plPresentInfo  = new PlPresentInfoVo();
		    	Condition condition = new Condition(PlProductInfoVo.class);
				Condition.Criteria criteria = condition.createCriteria();
				criteria.andCondition(" PRODUCT_CODE ='"+productCode+"' ");
	    		List<PlProductInfoVo> productList = productServices.selectByCondition(condition);
	    		if(null != productList && productList.size() > 0){
	    			productInfo = productList.get(0);
	    		}else{
	    			List<PlGiftInfoVo> giftList = giftServices.selectByCondition(condition);
		    		if(null != giftList && giftList.size() > 0){
		    			plGiftInfo = giftList.get(0);
		    			BeanUtils.copyProperties(plGiftInfo, productInfo);
		    		}else{
		    			List<PlPresentInfoVo> presentList = presentServices.selectByCondition(condition);
			    		if(null != presentList && presentList.size() > 0){
			    			plPresentInfo = presentList.get(0);
			    			BeanUtils.copyProperties(plPresentInfo, productInfo);
			    		}else{
			    			response.getWriter().write(jsonData);
			    			return;
			    		}
		    		}
	    		}
	    		
	    		Condition condition1 = new Condition(PlProductPicVo.class);
				Condition.Criteria criteria1 = condition1.createCriteria();
				criteria1.andCondition(" PRODUCT_ID ='"+productInfo.getEcsProductId()+"' ");
				
		    	List<PlProductPicVo> productPics = productPicServices.selectByCondition(condition1); //获取目前产品所有图片
		    	if(productPics != null && productPics.size() > 0){
			    	jsonData = UPlatJsonUtils.list2json2(productPics);
		    	}else{
		    		//do nothing
		    	}
	    		
			}else{
				//do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(jsonData);
		}
		response.getWriter().write(jsonData);
		
	} 
 
 	@ApiOperation(value="商品图片维护服务-新增",notes="商品产生之后，维护商品图片功能,可以新增、设置排序和删除图片。")
	@ApiImplicitParam(name="productInfoPic",value="商品图片实体类", required = true, dataType = "PlProductInfoPicVo")
	@RequestMapping(value = "/productPic_repairService_add", method=RequestMethod.POST)
	@ResponseBody
	public void productPicRepairServiceAdd(@RequestBody PlProductInfoPicVo productInfoPic,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"picId\":\"\",\"result\":\"1\"}";
		try {
			if(null != productInfoPic && null != productInfoPic.getProductId() && null != productInfoPic.getIconType()
					&& null != productInfoPic.getPicUrl()){
 				productInfoPic.setId(UPlatStringUtils.GetUUID());
 				services.insert(productInfoPic);
 				jsonData="{\"picId\":\""+productInfoPic.getId()+"\",\"result\":\"0\"}";
			}else{
				//do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(jsonData);
		}
		response.getWriter().write(jsonData);
		
	} 
 	
 	@ApiOperation(value="商品图片维护服务-排序",notes="商品产生之后，维护商品图片功能,可以新增、设置排序和删除图片。")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="picId",value="商品图片表ID", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="sort",value="商品图片排序值", required = true, dataType = "Integer",paramType = "query")
	})
	@RequestMapping(value = "/productPic_repairService_sort", method=RequestMethod.POST)
	@ResponseBody
	public void productPicRepairServiceSort(@RequestParam String picId,@RequestParam Integer sort,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		try {
			if(null != picId && !"".equals(picId) && !"".equals(sort)){
 				PlProductInfoPicVo picVo = services.selectByPrimaryKey(picId);
 				if(null != picVo){
 					picVo.setSort(sort);
 					services.updateByPrimaryKey(picVo);
 				}
 				jsonData="{\"result\":\"0\"}";
			}else{
				//do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(jsonData);
		}
		response.getWriter().write(jsonData);
		
	} 
 	
 	@ApiOperation(value="商品图片维护服务-删除",notes="商品产生之后，维护商品图片功能,可以新增、设置排序和删除图片。")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="picId",value="商品图片表ID", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="isDel",value="0删除；其他值不删除。", required = true, dataType = "Integer",paramType = "query")
	})
	@RequestMapping(value = "/productPic_repairService_del", method=RequestMethod.POST)
	@ResponseBody
	public void productPicRepairServiceDel(@RequestParam String picId,@RequestParam Integer isDel,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		try {
			if(null != picId && !"".equals(picId) && isDel.intValue() == 0){
 				PlProductInfoPicVo picVo = services.selectByPrimaryKey(picId);
 				if(null != picVo){
 					services.deleteByPrimaryKey(picId);
 					jsonData="{\"result\":\"0\"}";
 				}
			}else{
				//do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(jsonData);
		}
		response.getWriter().write(jsonData);
		
	} 
 	
 	@ApiOperation(value="商品附件维护服务-上传",notes="商品产生之后，维护上传附件功能,可以上传附件和删除附件。商品上架后，可以在商城下载并查看商品附件。")
	@ApiImplicitParam(name="productAccessory",value="商品附件实体类", required = true, dataType = "PlProductAccessoryVo")
	@RequestMapping(value = "/productAccessory_repairService_upload", method=RequestMethod.POST)
	@ResponseBody
	public void productAccessoryRepairServiceUpload(@RequestBody PlProductAccessoryVo productAccessory,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"accessoryUrl\":\"\",\"result\":\"1\"}";
		try {
			if(null != productAccessory && null != productAccessory.getProductId() && null != productAccessory.getAccessoryUrl()){
				
				productAccessory.setId(UPlatStringUtils.GetUUID());
				accessoryServices.insert(productAccessory);
 				jsonData="{\"accessoryUrl\":\""+productAccessory.getAccessoryUrl()+"\",\"result\":\"0\"}";
			}else{
				//do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(jsonData);
		}
		response.getWriter().write(jsonData);
		
	}
 	
 	@ApiOperation(value="商品附件维护服务-删除",notes="商品产生之后，维护上传附件功能,可以上传附件和删除附件。商品上架后，可以在商城下载并查看商品附件。")
 	@ApiImplicitParams({ 
		@ApiImplicitParam(name="accessoryId",value="商品附件表ID", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="isDel",value="0删除；其他值不删除。", required = true, dataType = "Integer",paramType = "query")
	})
	@RequestMapping(value = "/productAccessory_repairService_del", method=RequestMethod.POST)
	@ResponseBody
	public void productAccessoryRepairServiceDel(@RequestParam String accessoryId,@RequestParam Integer isDel,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="{\"result\":\"1\"}";
		try {
			if(null != accessoryId && !"".equals(accessoryId) && isDel.intValue() == 0){
				PlProductAccessoryVo accessoryVo = accessoryServices.selectByPrimaryKey(accessoryId);
 				if(null != accessoryVo){
 					accessoryServices.deleteByPrimaryKey(accessoryId);
 					jsonData="{\"result\":\"0\"}";
 				}
			}else{
				//do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(jsonData);
		}
		response.getWriter().write(jsonData);
 			
	}
 	
}