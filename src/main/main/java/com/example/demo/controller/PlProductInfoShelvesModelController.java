package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.example.demo.model.ImStockProductVo;
import com.example.demo.model.OrderCrmCodeVo;
import com.example.demo.model.PlDirectionShelvesVo;
import com.example.demo.model.PlGiftInfoVo;
import com.example.demo.model.PlPresentInfoVo;
import com.example.demo.model.PlProductAreaVo;
import com.example.demo.model.PlProductColumnVo;
import com.example.demo.model.PlProductInfoVo;
import com.example.demo.model.PlProductLimitPriceVo;
import com.example.demo.model.PlProductParamVo;
import com.example.demo.model.PlProductStockVo;
import com.example.demo.model.PlProductVo;
import com.example.demo.model.ProductColumnVo;
import com.example.demo.service.ImStockProductVoService;
import com.example.demo.service.OrderCrmCodeVoService;
import com.example.demo.service.PlDirectionShelvesVoService;
import com.example.demo.service.PlGiftInfoVoService;
import com.example.demo.service.PlPresentInfoVoService;
import com.example.demo.service.PlProductAreaVoService;
import com.example.demo.service.PlProductColumnVoService;
import com.example.demo.service.PlProductInfoVoService;
import com.example.demo.service.PlProductLimitPriceVoService;
import com.example.demo.service.PlProductParamVoService;
import com.example.demo.service.PlProductStockVoService;
import com.example.demo.service.PlProductVoService;
import com.example.demo.service.ProductColumnVoService;
import com.example.demo.util.UPlatDateUtils;
import com.example.demo.util.UPlatJsonUtils;
import com.example.demo.util.UPlatStringUtils;


/**
 * Created by zhoumin on 2019/06/13.
 */
@RestController
@RequestMapping("/plproductshelvesmodel/api")
@Api(value = "上架模式查询服务")
public class PlProductInfoShelvesModelController {

	@Resource
	private PlProductInfoVoService plProductInfoServices;
	@Resource
	private PlGiftInfoVoService plGiftInfoServices;
	@Resource
	private PlPresentInfoVoService plPresentInfoServices;
	@Resource
	private OrderCrmCodeVoService orderCrmCodeVoService;
	@Resource
	private PlProductParamVoService plProductParamVoService;
	@Resource
	private ProductColumnVoService productColumnVoService;
	@Resource
	private PlProductColumnVoService plProductColumnVoService;
	@Resource
	private PlProductAreaVoService plProductAreaVoService;
	@Resource
	private PlDirectionShelvesVoService plDirectionShelvesVoService;
	@Resource
	private PlProductStockVoService plProductStockVoService;
	@Resource
	private ImStockProductVoService imStockProductVoService;
	@Resource
	private PlProductLimitPriceVoService plProductLimitPriceVoService;
	
	
	
	@ApiOperation(value="上架模式查询服务",notes="提供商品上架模式查询服务，包含上架模式1、上架模式2、...等。（未返回供货区域控制，需要上游调用；未返回等级业务标签，需要上游调用；未返回产品入库库存）<br>productInfo.shelvesModel")
	@ApiImplicitParams({ 
		@ApiImplicitParam(name="id",value="入参为商品ID", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="provinceCode",value="登陆人省份编码", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="channelRole",value="登陆人权限", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name="priceLimitPolicy",value="总部限价类型（0：不受控制；1：该商品直供价受总部统一限价管理，暂不可销售；2：该商品价格受总部统一限价管理，不可修改）", required = true, dataType = "String",paramType = "query")
	})
	@RequestMapping(value = "/productShelvesModel_queryService", method=RequestMethod.POST)
	@ResponseBody
	public void productShelvesModelQueryService(@RequestParam String id,@RequestParam String provinceCode,@RequestParam String channelRole,@RequestParam String priceLimitPolicy,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String jsonData="";
		if(null != id && !"".equals(id) && null != provinceCode && !"".equals(provinceCode) && null != channelRole && !"".equals(channelRole)){
			List<PlProductInfoVo> infos = new ArrayList<PlProductInfoVo>();
			PlProductInfoVo productInfo=new PlProductInfoVo();
			String isGift = "0";
	    	String isPresent = "0";
			try {
				infos = plProductInfoServices.getAllById(id);
	    		if(infos.size()>0){
	    			productInfo = infos.get(0);
	    			if(productInfo.getProductCode().indexOf("ZP")>=0){
						isGift="1";
	    			}else if(productInfo.getProductCode().indexOf("LP")>=0){
						isPresent = "1";
	    			}
	    		}
			} catch (Exception e) {
			       System.out.println(e.getMessage());
			       e.printStackTrace();
			}
			Map<String, Object> returnMap = new HashMap<String, Object>();
	    	
			if(this.isOpenModel(provinceCode)){
	    		returnMap.put("isOpenModel", "1");
	    	}
			returnMap.put("productInfo", productInfo);
	    	//共用的信息
	    	returnMap = this.MapOfproductShelvesInfoes(provinceCode,channelRole, productInfo, isGift, returnMap,isPresent,priceLimitPolicy);
	    	
	    	jsonData = UPlatJsonUtils.map2json2(returnMap);
		}else{
			//do nothing
		}
		response.getWriter().write(jsonData);
	} 
	
	 //上架模式-清单上架省份配置
    private boolean isOpenModel(String provinceCode){
    	boolean flag = false;
		String prv = provinceCode.substring(0, 3);
		Map<String, OrderCrmCodeVo> map = this.queryByProvinceCodes(prv);
		if(map!=null && map.size() > 0 ){
			String isbatch = map.get(prv).getField4();
			if("1".equals(isbatch)){
				flag = true;
			}
		}
		return flag; 
    }

    /**
	 * 功能: 根据省份编码查询省份配置信息
	 * @author wushqd
	 * @version 创建时间: 2016年4月7日 下午5:27:10
	 *
	 * @param provinceCodes 
	 * @return key-省份编码，val-省份配置对象
	 */
	public Map<String, OrderCrmCodeVo> queryByProvinceCodes(String provinceCode) {
		List<OrderCrmCodeVo> list = orderCrmCodeVoService.getInfoByProvinceCode(provinceCode);
		if(null != list && list.size() > 0) {
			Map<String, OrderCrmCodeVo> results = new HashMap<String, OrderCrmCodeVo>();
			for(OrderCrmCodeVo crmCode : list) {
				results.put(crmCode.getProvinceCode(), crmCode);
			}
			return results;
			
		} else {
			return null;
		}
		
	}
	
	 /**
     * 商品组合上架，调整库存 。 共用方法
     * @param sysUser
     * @param productInfo
     * @param returnMap
     * @return
     */
    private Map<String, Object> MapOfproductShelvesInfoes(String provinceCode,String channelRole,PlProductInfoVo productInfo,String isGift,Map<String, Object> returnMap,String isPresent,String priceLimitPolicy){
    	//商品参数信息
    	PlProductParamVo productParam=plProductParamVoService.selectByPrimaryKey(productInfo.getProductId());
    	returnMap.put("productParam", productParam);
    	returnMap.put("isGift", isGift);
    	returnMap.put("isPresent",isPresent);
    	//获取栏目
    	List<ProductColumnVo>  pcList = productColumnVoService.getInfoByProvinceCode(provinceCode);
    	returnMap.put("pcList", pcList);
    	
    	//栏目回填
    	List<PlProductColumnVo> plProductColumns = plProductColumnVoService.getProductColumnById(productInfo.getId());
    	returnMap.put("plProductColumns", plProductColumns);
    	
//    	//供货区域控制 --所有供货商都有控制
//    	ChannelSupplierChannel csc = channelSupplierChannelManager.get(productInfo.getSupplierId());
//    	List<BdRegionalInfo> bdRegionalInfos = bdRegionalInfoManager.getProductRegionalControlOfSupply(csc);
//    	returnMap.put("bdRegionalInfos", bdRegionalInfos);
    	
    	//上架区域回填
    	List<PlProductAreaVo> plProductAreas = plProductAreaVoService.getAreaIdByProductId(productInfo.getId());
    	returnMap.put("plProductAreas", plProductAreas);
    	
//    	//等级业务标签
//		List<ChannelLabel> labelList = labelManager.queryLableByProvinceCode(sysUser.getProvinceCode().substring(0, 3));
//		returnMap.put("labelList", labelList);
		
    	//标签回填
    	int role = 0;
		String labelTypeStr = "('2','3')";
    	if ("0".equals(channelRole)){//0管理员
    		if("800".equals(provinceCode.substring(0, 3)) && !"810".equals(provinceCode.substring(0, 3))){//总部管理
    			role=1;//总部管理
    			labelTypeStr = "('0','1')";
    		}else if(!"800".equals(provinceCode.substring(0, 3)) && !"810".equals(provinceCode.substring(0, 3))){//省份管理
    			role=2;//省份管理
    		}else {
    			role=3;//其他
    		}
    	}else{
    		role=3;//其他
    		if("2".equals(channelRole)&&"800".equals(provinceCode.substring(0, 3))){
    			labelTypeStr = "('0','1')";
    		}
    	}
    	Condition condition1 = new Condition(PlDirectionShelvesVo.class);
		Condition.Criteria criteria1 = condition1.createCriteria();
		criteria1.andCondition(" LABEL_TYPE in "+labelTypeStr +" and PRODUCT_ID='"+productInfo.getId()+"' ");
		
    	List<PlDirectionShelvesVo> productLabelList=plDirectionShelvesVoService.selectByCondition(condition1);
    	returnMap.put("productLabelList", productLabelList);
    	returnMap.put("role", role);
    	
    	//获取商品库存
		Map<String,PlProductStockVo> plProductStockMap=null;  //key:逻辑仓库主键   value：商品库存 实体
    	
    	if(null != productInfo.getId() && !"".equals(productInfo.getId())){
    		String warehouseType = "";
    		if("1".equals(isGift)||"1".equals(isPresent)){//赠品或者礼品
    			warehouseType = "02";
    		}else if("0".equals(isGift)){//商品
    			warehouseType = "01";
    		}
    		List<PlProductStockVo> productStocks = plProductStockVoService.getProductStockByPid(warehouseType, productInfo.getId());
    		if(productStocks!=null && productStocks.size()>0){
    			if(productStocks.get(0).getStockId().equals("-1")){
    				plProductStockMap = null;
    			}else{
    				plProductStockMap=new HashMap<String, PlProductStockVo>();
        			for(PlProductStockVo plProductStock:productStocks){
        				plProductStockMap.put(plProductStock.getStockId(), plProductStock);
        			}
    			}
    			
    		}
    	}
    	returnMap.put("plProductStockMap", plProductStockMap);//商品库存
    	
//    	//获取产品入库库存
//    	String propertyCode=productInfo.getSupplierPropertycode()!=null?productInfo.getSupplierPropertycode():"-1";//物权：PROPERTY  01=电子    02=政企     03=实体     06=连锁
//    	List<ImStockProductVo> imStockProducts = null;
//    	if("1".equals(isGift)||"1".equals(isPresent)){//查询赠品库
//    		imStockProducts = imStockProductVoService.getZPByProductCdAndSup(productInfo.getProductCdEighteen(),  productInfo.getSupplierCode(),  propertyCode);
//    	}else if("0".equals(isGift)){//查询商品库
//    		imStockProducts = imStockProductVoService.getAllByProductCdAndSup(productInfo.getProductCdEighteen(),  productInfo.getSupplierCode(),  propertyCode);
//    	}
//    	returnMap.put("imStockProducts",imStockProducts);//入库库存
    	
    	//总部限价校验
    	Map<String,String> zongbuMap = new HashMap<>();
    	if("0".equals(priceLimitPolicy)){
    		zongbuMap.put("policy", "0");//没有总部限价政策
    		//最高价格管控
    		if("0".equals(isGift)&&!"".equals(isPresent)){					
    			try {
    				List<PlProductLimitPriceVo> priceList = plProductLimitPriceVoService.getPlProductLimitPriceByPlProductInfoId(productInfo.getId(),provinceCode);
    				Map<String, String> map = dealList(priceList);
    				returnMap.put("priceMap", map);
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    	}else if("1".equals(priceLimitPolicy)){
    		zongbuMap.put("policy", "1");
    		zongbuMap.put("message", "该商品直供价受总部统一限价管理，暂不可销售");
    		Map<String, String> map = new HashMap<>();
    		map.put("flag", "0");
			returnMap.put("priceMap", map);
    	}else if("2".equals(priceLimitPolicy)){
    		zongbuMap.put("policy", "1");
    		zongbuMap.put("message", "该商品价格受总部统一限价管理，不可修改");
    		Map<String, String> map = new HashMap<>();
    		map.put("flag", "0");
			returnMap.put("priceMap", map);
    	}
    	returnMap.put("policyMap",zongbuMap);
    	return returnMap;
    }
    
    private Map<String,String> dealList(List<PlProductLimitPriceVo> list){
		Map<String,String> map = new HashMap<String,String>();
		if(list.size() == 1){
			String msg = "";
			String flag = "1";
			PlProductLimitPriceVo vo = list.get(0);
			BigDecimal hp = vo.getProductHighestPrice();
			BigDecimal lp = vo.getProductLowestPrice();
			if(null == hp && null == lp){
				msg = "本省份该商品不受价格管控。";
				flag = "0";
			}else if(null != hp && null != lp){
				flag = "2";
				msg = "本省份该商品价格管控范围："+lp+"元-"+hp+"元。";
				map.put("highestPrice", hp.toString());
				map.put("lowestPrice", lp.toString());
			}else{
				flag = "1";
				if(null == hp){
					msg = "价格范围最低价为："+lp+"元，最高价不受控制。";
					map.put("lowestPrice", lp.toString());
				}
				if(null == lp){
					msg = "价格范围最低价不受控制，最高价为："+hp+"元。";
					map.put("highestPrice", hp.toString());
				}
			}
			
			map.put("flag", flag);
			map.put("msg", msg);
			return map;
		}else if (list.size() == 0 ){
			map.put("flag", "0");
			map.put("msg", "本省份该商品不受价格管控。");
			return map;
		}else{
			throw new RuntimeException("商品价格范围管控设置有误！[2:PlProductLimitPrice.java]");
		}
	}
    
}