package com.pykj.moral.dao;

import com.pykj.moral.entity.Stdscorerpt;

public interface StdscorerptMapper {
    int deleteByPrimaryKey(Long cid);

    int insert(Stdscorerpt record);

    int insertSelective(Stdscorerpt record);

    Stdscorerpt selectByPrimaryKey(Long cid);

    int updateByPrimaryKeySelective(Stdscorerpt record);

    int updateByPrimaryKey(Stdscorerpt record);
}