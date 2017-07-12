package com.pykj.moral.dao;

import com.pykj.moral.entity.Illegalitem;

public interface IllegalitemMapper {
    int deleteByPrimaryKey(Integer scoreid);

    int insert(Illegalitem record);

    int insertSelective(Illegalitem record);

    Illegalitem selectByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(Illegalitem record);

    int updateByPrimaryKey(Illegalitem record);
}