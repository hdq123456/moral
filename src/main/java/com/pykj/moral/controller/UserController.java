package com.pykj.moral.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pykj.moral.entity.User;
import com.pykj.moral.service.UserService;
import com.pykj.moral.utils.ResultOut;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	UserService userService;
	
	//只输出json数据，不考虑业务逻辑的跳转;
	@RequestMapping("/get")
	public ResultOut getUser(Integer userid){
		
		System.out.println("userid:" + userid);
		User user = userService.selectByPrimaryKey(userid);
		return ResultOut.ok(user);
	}
	
}
