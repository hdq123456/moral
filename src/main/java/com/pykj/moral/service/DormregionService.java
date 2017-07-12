package com.pykj.moral.service;

import java.util.List;

import com.pykj.moral.entity.Dormregion;


public interface DormregionService<T> {
	
	void deleteByPrimaryKey(Integer regionid);

    void insert(T t);

    void insertSelective(T t);

    T selectByPrimaryKey(Integer regionid);

    void updateByPrimaryKeySelective(T t);

    void updateByPrimaryKey(T t);
    
    List<Dormregion> selectAll();
    
    void insertMul(List<Dormregion> listdormregion);

    void batchDeleteRegion(List<Integer> regionid);
    
    List<Dormregion> selectRegionByMultCondition(Dormregion dormregion);
    
}
