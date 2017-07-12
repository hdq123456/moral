package com.pykj.moral.dao;

import com.pykj.moral.entity.Workspace;

public interface WorkspaceMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Workspace record);

    int insertSelective(Workspace record);

    Workspace selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Workspace record);

    int updateByPrimaryKey(Workspace record);
}