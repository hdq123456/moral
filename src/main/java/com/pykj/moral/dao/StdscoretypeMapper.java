package com.pykj.moral.dao;

import com.pykj.moral.entity.Stdscoretype;

public interface StdscoretypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(Stdscoretype record);

    int insertSelective(Stdscoretype record);

    Stdscoretype selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(Stdscoretype record);

    int updateByPrimaryKey(Stdscoretype record);
}