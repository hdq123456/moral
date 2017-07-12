package com.pykj.moral.service.impls;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pykj.moral.dao.UserMapper;
import com.pykj.moral.entity.User;
import com.pykj.moral.service.UserService;
import com.pykj.moral.utils.ResultOut;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userdao;
	
	@Override
	public ResultOut deleteByPrimaryKey(Integer userid) {
		userdao.deleteByPrimaryKey(userid);
		return ResultOut.ok();
	}

	@Override
	public ResultOut insert(User record) {
		userdao.insert(record);
		return ResultOut.ok();
	}

	@Override
	public ResultOut insertSelective(User record) {
		userdao.insertSelective(record);
		return ResultOut.ok();
	}

	@Override
	public User selectByPrimaryKey(Integer userid) {
		User user = userdao.selectByPrimaryKey(userid);
		return user;
	}

	@Override
	public ResultOut updateByPrimaryKeySelective(User record) {
		userdao.updateByPrimaryKeySelective(record);
		return ResultOut.ok();
	}

	@Override
	public ResultOut updateByPrimaryKey(User record) {
		userdao.updateByPrimaryKey(record);
		return ResultOut.ok();
	}

}
