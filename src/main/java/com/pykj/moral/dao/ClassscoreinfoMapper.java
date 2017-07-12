package com.pykj.moral.dao;

import java.util.List;

import com.pykj.moral.entity.Classscoreinfo;

public interface ClassscoreinfoMapper<T> {
    int deleteByPrimaryKey(Integer uid);

    int insert(T t);

    int insertSelective(Classscoreinfo t);

    Classscoreinfo selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
    
    List<Classscoreinfo> selectAll();
    
}