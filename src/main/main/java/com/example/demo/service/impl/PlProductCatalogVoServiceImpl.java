package com.example.demo.service.impl;
 
import com.example.demo.dao.PlProductCatalogVoMapper;
import com.example.demo.model.PlProductCatalogVo;
import com.example.demo.service.PlProductCatalogVoService;
import com.example.demo.common.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import javax.annotation.Resource;
 
 
/**
 * Created by zhoumin on 2019/07/12.
 */
@Service
@Transactional
public class PlProductCatalogVoServiceImpl extends ServiceImpl<PlProductCatalogVo> implements PlProductCatalogVoService {
    @Resource
    private PlProductCatalogVoMapper plProductCatalogVoMapper;
 
}