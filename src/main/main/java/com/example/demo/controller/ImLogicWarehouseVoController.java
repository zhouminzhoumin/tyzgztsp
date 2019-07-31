package com.example.demo.controller;
 
import com.example.demo.model.ImLogicWarehouseVo;
import com.example.demo.service.ImLogicWarehouseVoService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.mapper.entity.Condition;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
 
import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;
 
/**
* Created by zhoumin on 2019/07/17.
*/
@RestController
@RequestMapping("/imlogicwarehousevo/api")
@Api(value = "xx", description = "xx")
public class ImLogicWarehouseVoController {
 
    @Resource
    private ImLogicWarehouseVoService services;
 
	@ApiIgnore
 	@ApiOperation(value="获取实体列表",notes="根据查询条件获取实体列表")
	@ApiImplicitParam(name="request",value="查询条件", required = true, dataType = "HttpServletRequest")
    @RequestMapping(value ="/list", method=RequestMethod.GET)
    public List<ImLogicWarehouseVo> list(HttpServletRequest request) {

    	Condition condition =new Condition(ImLogicWarehouseVo.class);
    	Condition.Criteria criteria = condition.createCriteria();
    	criteria.andCondition(" ID ='' ");
    	List<ImLogicWarehouseVo> list =services.selectByCondition(condition);
        return  list;
    }
    @ApiIgnore
	@ApiOperation(value="获取单个实体值",notes="根据id获取实体信息")
	@ApiImplicitParam(name="id",value="实体id值", required = true, dataType = "String")
    @RequestMapping(value = "/get_one", method=RequestMethod.GET)
    @ResponseBody
    public Object get_one(String id) {
        ImLogicWarehouseVo model = services.selectByPrimaryKey(id);
        return model;
        }
        
 	@ApiIgnore
	@ApiOperation(value="新增实体信息",notes="新增实体信息")
	@ApiImplicitParam(name="model",value="实体值", required = true, dataType = "ImLogicWarehouseVo")
    @RequestMapping(value = "/add_one", method=RequestMethod.POST)
    @ResponseBody
    public Object add_one(@RequestBody ImLogicWarehouseVo model) {
   		services.insertSelective(model);
        return true;
    }
    
 	@ApiIgnore
	@ApiOperation(value="批量增加实体信息",notes="批量增加实体信息")
	@ApiImplicitParam(name="model",value="实体集合List<ImLogicWarehouseVo>", required = true, dataType = "List<ImLogicWarehouseVo>")
    @RequestMapping(value = "/add_multiple", method=RequestMethod.POST)
    @ResponseBody
    public Object add_multiple(@RequestBody List<ImLogicWarehouseVo> model) {
        services.insertList(model);
        return true;
     }
     
    @ApiIgnore
 	@ApiOperation(value="编辑实体信息",notes="维护编辑实体信息")
	@ApiImplicitParam(name="model",value="实体值", required = true, dataType = "ImLogicWarehouseVo")
    @RequestMapping(value = "/edit_one", method=RequestMethod.POST)
    @ResponseBody
    public Object edit_one(@RequestBody ImLogicWarehouseVo model) {
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
 
}