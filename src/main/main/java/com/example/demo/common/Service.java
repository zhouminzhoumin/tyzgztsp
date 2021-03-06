package com.example.demo.common;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;
 
public interface Service<T> {
 
    long count(T model);
 
    long countByCondition(Condition condition);
 
    void insert(T model);
 
    void insertSelective(T model);
 
    void insertList(List<T> models);
 
    void deleteByPrimaryKey(Object id);
 
    void deleteByIds(String ids);
 
    void deleteByCondition(Condition condition);
 
    void updateByCondition(T model, Condition condition);
 
    void updateByConditionSelective(T model, Condition condition);
 
    void updateByPrimaryKey(T model);
 
    void updateByPrimaryKeySelective(T model);
 
    T selectByPrimaryKey(Object id);
 
    T selectOne(T model);
 
    List<T> selectAll();
 
    T selectFirst(T model);
 
    T selectFirstByCondition(Condition condition);
 
    List<T> select(T model);
 
    List<T> selectForStartPage(T model, Integer pageNum, Integer pageSize);
 
    List<T> selectByIds(String ids);
 
    List<T> selectByCondition(Condition condition);
 
    List<T> selectByConditionForStartPage(Condition condition, Integer pageNum, Integer pageSize);


}
