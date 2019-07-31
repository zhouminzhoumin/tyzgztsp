package com.example.demo.service.impl;
 
import com.example.demo.dao.ImLogicWarehouseVoMapper;
import com.example.demo.model.ImLogicWarehouseVo;
import com.example.demo.service.ImLogicWarehouseVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class ImLogicWarehouseVoServiceImpl extends ServiceImpl<ImLogicWarehouseVo> implements ImLogicWarehouseVoService {
    @Resource
    private ImLogicWarehouseVoMapper imLogicWarehouseVoMapper;
 
}