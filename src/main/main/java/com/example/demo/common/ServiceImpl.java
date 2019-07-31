package com.example.demo.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Condition;

public class ServiceImpl<T> implements Service<T>{
	
	   @Autowired
	  private Mapper<T> baseMapper;

	@Override
	public long count(T model) {
		// TODO Auto-generated method stub
		return baseMapper.selectCount(model);
	}

	@Override
	public long countByCondition(Condition condition) {
		// TODO Auto-generated method stub
		return baseMapper.selectCountByCondition(condition);
	}

	@Override
	public void insert(T model) {
		// TODO Auto-generated method stub
		baseMapper.insert(model);
	}

	@Override
	public void insertSelective(T model) {
		// TODO Auto-generated method stub
		baseMapper.insertSelective(model);
	}

	@Override
	public void insertList(List<T> models) {
		// TODO Auto-generated method stub
		baseMapper.insertList(models);
	}

	@Override
	public void deleteByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteByIds(String ids) {
		// TODO Auto-generated method stub
		baseMapper.deleteByIds(ids);
	}

	@Override
	public void deleteByCondition(Condition condition) {
		// TODO Auto-generated method stub
		baseMapper.deleteByCondition(condition);
	}

	@Override
	public void updateByCondition(T model, Condition condition) {
		// TODO Auto-generated method stub
		baseMapper.updateByCondition(model, condition);
	}

	@Override
	public void updateByConditionSelective(T model, Condition condition) {
		// TODO Auto-generated method stub
		baseMapper.updateByConditionSelective(model, condition);
	}

	@Override
	public void updateByPrimaryKey(T model) {
		// TODO Auto-generated method stub
		baseMapper.updateByPrimaryKey(model);
	}

	@Override
	public void updateByPrimaryKeySelective(T model) {
		// TODO Auto-generated method stub
		baseMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public T selectByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public T selectOne(T model) {
		// TODO Auto-generated method stub
		return baseMapper.selectOne(model);
	}

	@Override
	public List<T> selectAll() {
		// TODO Auto-generated method stub
		return baseMapper.selectAll();
	}

	@Override
	public T selectFirst(T model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T selectFirstByCondition(Condition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> select(T model) {
		// TODO Auto-generated method stub
		return baseMapper.select(model);
	}

	@Override
	public List<T> selectForStartPage(T model, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> selectByIds(String ids) {
		return baseMapper.selectByIds(ids);
	}

	@Override
	public List<T> selectByCondition(Condition condition) {
		// TODO Auto-generated method stub
		return baseMapper.selectByCondition(condition);
	}

	@Override
	public List<T> selectByConditionForStartPage(Condition condition,
			Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
