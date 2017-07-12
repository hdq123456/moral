package com.pykj.moral.dao;

import java.util.List;

import com.pykj.moral.entity.Dormscoreinfo;

public interface DormscoreinfoMapper<T> {
    int deleteByPrimaryKey(Integer uid);

    int insert(T t);

    int insertSelective(Dormscoreinfo t);

    T selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Dormscoreinfo t);

    int updateByPrimaryKey(T t);

	List<Dormscoreinfo> selectAll();
}