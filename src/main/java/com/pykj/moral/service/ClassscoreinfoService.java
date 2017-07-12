package com.pykj.moral.service;

import java.util.List;

import com.pykj.moral.entity.Classscoreinfo;

public interface ClassscoreinfoService<T> {

	void deleteByPrimaryKey(Integer uid);

    void insert(T t);

    void insertSelective(Classscoreinfo t);

    T selectByPrimaryKey(Integer uid);

    void updateByPrimaryKeySelective(T t);

    void updateByPrimaryKey(T t);
    
    List<Classscoreinfo> selectAll();
}
