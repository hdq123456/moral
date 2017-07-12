package com.pykj.moral.service;

import java.util.List;

import com.pykj.moral.entity.Stdscoreinfo;

public interface StdscoreinfoService<T> {

	void deleteByPrimaryKey(Integer uid);

    void insert(T t);

    void insertSelective(Stdscoreinfo t);

    T selectByPrimaryKey(Integer uid);

    void updateByPrimaryKeySelective(T t);

    void updateByPrimaryKey(T t);
    
    List<Stdscoreinfo> selectAll();
    
    //void insertMul(List<dormscoreinfo> listdormregion);
}
