package com.pykj.moral.dao;

import com.pykj.moral.entity.Dormmenber;

public interface DormmenberMapper {
    int deleteByPrimaryKey(Integer rmbid);

    int insert(Dormmenber record);

    int insertSelective(Dormmenber record);

    Dormmenber selectByPrimaryKey(Integer rmbid);

    int updateByPrimaryKeySelective(Dormmenber record);

    int updateByPrimaryKey(Dormmenber record);
}