package com.pykj.moral.dao;

import com.pykj.moral.entity.Classscoretype;

public interface ClassscoretypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(Classscoretype record);

    int insertSelective(Classscoretype record);

    Classscoretype selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(Classscoretype record);

    int updateByPrimaryKey(Classscoretype record);
}