package com.example.demo.service.impl;
 
import com.example.demo.dao.PlProductInfoPicVoMapper;
import com.example.demo.model.PlProductInfoPicVo;
import com.example.demo.service.PlProductInfoPicVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/15.
 */
@Service
@Transactional
public class PlProductInfoPicVoServiceImpl extends ServiceImpl<PlProductInfoPicVo> implements PlProductInfoPicVoService {
    @Resource
    private PlProductInfoPicVoMapper plProductInfoPicVoMapper;
 
}