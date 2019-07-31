package com.example.demo.service.impl;
 
import com.example.demo.dao.ImWarehouseVoMapper;
import com.example.demo.model.ImWarehouseVo;
import com.example.demo.service.ImWarehouseVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/12.
 */
@Service
@Transactional
public class ImWarehouseVoServiceImpl extends ServiceImpl<ImWarehouseVo> implements ImWarehouseVoService {
    @Resource
    private ImWarehouseVoMapper imWarehouseVoMapper;
 
}