package com.pykj.moral.dao;

import com.pykj.moral.entity.Shiftset;

public interface ShiftsetMapper {
    int deleteByPrimaryKey(Integer shiftid);

    int insert(Shiftset record);

    int insertSelective(Shiftset record);

    Shiftset selectByPrimaryKey(Integer shiftid);

    int updateByPrimaryKeySelective(Shiftset record);

    int updateByPrimaryKey(Shiftset record);
}