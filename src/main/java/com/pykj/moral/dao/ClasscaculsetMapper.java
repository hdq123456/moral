package com.pykj.moral.dao;

import com.pykj.moral.entity.Classcaculset;

public interface ClasscaculsetMapper {
    int deleteByPrimaryKey(Integer systemsetid);

    int insert(Classcaculset record);

    int insertSelective(Classcaculset record);

    Classcaculset selectByPrimaryKey(Integer systemsetid);

    int updateByPrimaryKeySelective(Classcaculset record);

    int updateByPrimaryKey(Classcaculset record);
}