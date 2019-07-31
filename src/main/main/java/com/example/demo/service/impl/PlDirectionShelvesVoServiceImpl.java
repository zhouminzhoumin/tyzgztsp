package com.example.demo.service.impl;
 
import com.example.demo.dao.PlDirectionShelvesVoMapper;
import com.example.demo.model.PlDirectionShelvesVo;
import com.example.demo.service.PlDirectionShelvesVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/17.
 */
@Service
@Transactional
public class PlDirectionShelvesVoServiceImpl extends ServiceImpl<PlDirectionShelvesVo> implements PlDirectionShelvesVoService {
    @Resource
    private PlDirectionShelvesVoMapper plDirectionShelvesVoMapper;
 
}