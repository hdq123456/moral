package com.pykj.moral.dao;

import com.pykj.moral.entity.Rptmonthset;

public interface RptmonthsetMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Rptmonthset record);

    int insertSelective(Rptmonthset record);

    Rptmonthset selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Rptmonthset record);

    int updateByPrimaryKey(Rptmonthset record);
}