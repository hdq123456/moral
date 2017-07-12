package com.pykj.moral.service;

import java.util.List;

import com.pykj.moral.entity.Dormscoreinfo;


public interface DormscoreinfoService<T> {
	
	void deleteByPrimaryKey(Integer uid);

    void insert(T t);

    void insertSelective(Dormscoreinfo t);

    T selectByPrimaryKey(Integer uid);

    void updateByPrimaryKeySelective(Dormscoreinfo t);

    void updateByPrimaryKey(T t);
    
    List<Dormscoreinfo> selectAll();
    //这个方法不对
    //泛型要么作为类型，要么方法泛型，两种是不一样的
    void insertMul(List<Dormscoreinfo> listdormregion);
    
}
