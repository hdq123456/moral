package com.pykj.moral.dao;

import com.pykj.moral.entity.Relaxscore;

public interface RelaxscoreMapper {
    int deleteByPrimaryKey(Integer detailid);

    int insert(Relaxscore record);

    int insertSelective(Relaxscore record);

    Relaxscore selectByPrimaryKey(Integer detailid);

    int updateByPrimaryKeySelective(Relaxscore record);

    int updateByPrimaryKey(Relaxscore record);
}