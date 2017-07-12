package com.pykj.moral.controller;

import com.pykj.moral.utils.ResultOut;

public interface BaseController<T> {

	ResultOut deleteByPrimaryKey(Integer id);

	ResultOut insertSelective(T t);

	ResultOut selectByPrimaryKey(Integer id);

	ResultOut updateByPrimaryKeySelective(T t);

	ResultOut selectAll();
	
}
