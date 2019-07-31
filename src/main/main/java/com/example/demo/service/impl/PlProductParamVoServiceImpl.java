package com.example.demo.service.impl;
 
import com.example.demo.dao.PlProductParamVoMapper;
import com.example.demo.model.PlProductParamVo;
import com.example.demo.service.PlProductParamVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/15.
 */
@Service
@Transactional
public class PlProductParamVoServiceImpl extends ServiceImpl<PlProductParamVo> implements PlProductParamVoService {
    @Resource
    private PlProductParamVoMapper plProductParamVoMapper;
 
}