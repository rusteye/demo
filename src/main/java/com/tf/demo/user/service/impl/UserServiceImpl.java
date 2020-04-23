package com.tf.demo.user.service.impl;

import com.tf.demo.user.model.User;
import com.tf.demo.user.service.UserService;

import util.UUIDUtil;

public class UserServiceImpl implements UserService{
	public User getUserById(String userid) {
		String username = "zhangsan";
		return new User(UUIDUtil.getUUID(), username);
	}
}
