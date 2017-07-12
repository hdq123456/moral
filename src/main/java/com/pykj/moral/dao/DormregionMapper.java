package com.pykj.moral.dao;

import java.util.List;

import com.pykj.moral.entity.Dormregion;

public interface DormregionMapper<T> {
	
    void deleteByPrimaryKey(Integer regionid);

    void insert(T t);

    void insertSelective(T t);

    Dormregion selectByPrimaryKey(Integer regionid);

    void updateByPrimaryKeySelective(T t);

    void updateByPrimaryKey(T t);

	List<Dormregion> _list();
	
	void batchDeleteRegion(List<Integer> regionid);
	
	List<Dormregion> selectRegionByMultCondition(Dormregion dormregion);

}