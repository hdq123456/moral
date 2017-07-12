package com.pykj.moral.dao;

import com.pykj.moral.entity.Holiday;

public interface HolidayMapper {
    int deleteByPrimaryKey(Integer holidayid);

    int insert(Holiday record);

    int insertSelective(Holiday record);

    Holiday selectByPrimaryKey(Integer holidayid);

    int updateByPrimaryKeySelective(Holiday record);

    int updateByPrimaryKey(Holiday record);
}