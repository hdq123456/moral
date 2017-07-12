package com.pykj.moral.dao;

import com.pykj.moral.entity.Dormbase;

public interface DormbaseMapper {
    int deleteByPrimaryKey(Integer basescoreid);

    int insert(Dormbase record);

    int insertSelective(Dormbase record);

    Dormbase selectByPrimaryKey(Integer basescoreid);

    int updateByPrimaryKeySelective(Dormbase record);

    int updateByPrimaryKey(Dormbase record);
}