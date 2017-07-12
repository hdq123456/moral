package com.pykj.moral.dao;

import java.util.List;

import com.pykj.moral.entity.Stdscoreinfo;

public interface StdscoreinfoMapper<T> {
	
    int deleteByPrimaryKey(Integer uid);

    int insert(T t);

    int insertSelective(Stdscoreinfo t);

    T selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
    
    List<Stdscoreinfo> selectAll();
    
}