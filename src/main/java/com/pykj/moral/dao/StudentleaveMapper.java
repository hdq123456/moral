package com.pykj.moral.dao;

import com.pykj.moral.entity.Studentleave;

public interface StudentleaveMapper {
    int deleteByPrimaryKey(Integer leaveid);

    int insert(Studentleave record);

    int insertSelective(Studentleave record);

    Studentleave selectByPrimaryKey(Integer leaveid);

    int updateByPrimaryKeySelective(Studentleave record);

    int updateByPrimaryKey(Studentleave record);
}