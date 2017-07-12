package com.pykj.moral.dao;

import com.pykj.moral.entity.Classscorerpt;

public interface ClassscorerptMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Classscorerpt record);

    int insertSelective(Classscorerpt record);

    Classscorerpt selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Classscorerpt record);

    int updateByPrimaryKey(Classscorerpt record);
}