package com.example.demo.service.impl;
 
import com.example.demo.dao.PlProductAccessoryVoMapper;
import com.example.demo.model.PlProductAccessoryVo;
import com.example.demo.service.PlProductAccessoryVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class PlProductAccessoryVoServiceImpl extends ServiceImpl<PlProductAccessoryVo> implements PlProductAccessoryVoService {
    @Resource
    private PlProductAccessoryVoMapper plProductAccessoryVoMapper;
 
}