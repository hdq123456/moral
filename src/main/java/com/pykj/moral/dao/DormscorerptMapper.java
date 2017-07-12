package com.pykj.moral.dao;

import com.pykj.moral.entity.Dormscorerpt;

public interface DormscorerptMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Dormscorerpt record);

    int insertSelective(Dormscorerpt record);

    Dormscorerpt selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Dormscorerpt record);

    int updateByPrimaryKey(Dormscorerpt record);
}