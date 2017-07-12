package com.pykj.moral.dao;

import com.pykj.moral.entity.Handlerecord;

public interface HandlerecordMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Handlerecord record);

    int insertSelective(Handlerecord record);

    Handlerecord selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Handlerecord record);

    int updateByPrimaryKey(Handlerecord record);
}