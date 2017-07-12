package com.pykj.moral.dao;

import com.pykj.moral.entity.Illegal;

public interface IllegalMapper {
    int deleteByPrimaryKey(Integer illegalid);

    int insert(Illegal record);

    int insertSelective(Illegal record);

    Illegal selectByPrimaryKey(Integer illegalid);

    int updateByPrimaryKeySelective(Illegal record);

    int updateByPrimaryKey(Illegal record);
}