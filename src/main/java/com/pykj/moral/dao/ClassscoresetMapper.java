package com.pykj.moral.dao;

import com.pykj.moral.entity.Classscoreset;

public interface ClassscoresetMapper {
    int deleteByPrimaryKey(Integer scoreid);

    int insert(Classscoreset record);

    int insertSelective(Classscoreset record);

    Classscoreset selectByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(Classscoreset record);

    int updateByPrimaryKey(Classscoreset record);
}