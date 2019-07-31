package com.example.demo.service.impl;
 
import com.example.demo.dao.PlProductPicVoMapper;
import com.example.demo.model.PlProductPicVo;
import com.example.demo.service.PlProductPicVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/12.
 */
@Service
@Transactional
public class PlProductPicVoServiceImpl extends ServiceImpl<PlProductPicVo> implements PlProductPicVoService {
    @Resource
    private PlProductPicVoMapper plProductPicVoMapper;
 
}