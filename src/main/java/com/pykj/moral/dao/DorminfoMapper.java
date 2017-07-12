package com.pykj.moral.dao;

import com.pykj.moral.entity.Dorminfo;

public interface DorminfoMapper {
    int deleteByPrimaryKey(Integer dormid);

    int insert(Dorminfo record);

    int insertSelective(Dorminfo record);

    Dorminfo selectByPrimaryKey(Integer dormid);

    int updateByPrimaryKeySelective(Dorminfo record);

    int updateByPrimaryKey(Dorminfo record);
}