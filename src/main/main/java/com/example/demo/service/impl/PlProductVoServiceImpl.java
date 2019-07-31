package com.example.demo.service.impl;
 
import com.example.demo.dao.PlProductVoMapper;
import com.example.demo.model.PlProductVo;
import com.example.demo.service.PlProductVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/12.
 */
@Service
@Transactional
public class PlProductVoServiceImpl extends ServiceImpl<PlProductVo> implements PlProductVoService {
    @Resource
    private PlProductVoMapper plProductVoMapper;
 
}