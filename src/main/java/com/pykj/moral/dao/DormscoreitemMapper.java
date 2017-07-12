package com.pykj.moral.dao;

import com.pykj.moral.entity.Dormscoreitem;

public interface DormscoreitemMapper {
    int deleteByPrimaryKey(Integer scoreid);

    int insert(Dormscoreitem record);

    int insertSelective(Dormscoreitem record);

    Dormscoreitem selectByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(Dormscoreitem record);

    int updateByPrimaryKey(Dormscoreitem record);
}