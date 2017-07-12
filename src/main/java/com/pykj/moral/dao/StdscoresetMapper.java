package com.pykj.moral.dao;

import com.pykj.moral.entity.Stdscoreset;

public interface StdscoresetMapper {
	
    int deleteByPrimaryKey(Integer scoreid);

    int insert(Stdscoreset record);

    int insertSelective(Stdscoreset record);

    Stdscoreset selectByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(Stdscoreset record);

    int updateByPrimaryKey(Stdscoreset record);
}