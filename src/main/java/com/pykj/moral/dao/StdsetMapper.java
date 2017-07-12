package com.pykj.moral.dao;

import com.pykj.moral.entity.Stdset;

public interface StdsetMapper {
    int deleteByPrimaryKey(Integer systemsetid);

    int insert(Stdset record);

    int insertSelective(Stdset record);

    Stdset selectByPrimaryKey(Integer systemsetid);

    int updateByPrimaryKeySelective(Stdset record);

    int updateByPrimaryKey(Stdset record);
}