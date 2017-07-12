package com.pykj.moral.dao;

import com.pykj.moral.entity.Attendschoolrpt;

public interface AttendschoolrptMapper {
    int deleteByPrimaryKey(Integer rptid);

    int insert(Attendschoolrpt record);

    int insertSelective(Attendschoolrpt record);

    Attendschoolrpt selectByPrimaryKey(Integer rptid);

    int updateByPrimaryKeySelective(Attendschoolrpt record);

    int updateByPrimaryKey(Attendschoolrpt record);
}