package com.pykj.moral.service;


import com.pykj.moral.entity.User;
import com.pykj.moral.utils.ResultOut;

public interface UserService {

	ResultOut deleteByPrimaryKey(Integer userid);

	ResultOut insert(User record);

	ResultOut insertSelective(User record);

	User selectByPrimaryKey(Integer userid);

	ResultOut updateByPrimaryKeySelective(User record);

	ResultOut updateByPrimaryKey(User record);
}
