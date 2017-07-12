package com.pykj.moral.dao;

import com.pykj.moral.entity.Attendschool;

public interface AttendschoolMapper {
	
    int deleteByPrimaryKey(Integer attendid);

    int insert(Attendschool record);

    int insertSelective(Attendschool record);

    Attendschool selectByPrimaryKey(Integer attendid);

    int updateByPrimaryKeySelective(Attendschool record);

    int updateByPrimaryKey(Attendschool record);
}