package com.tf.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tf.demo.user.model.User;
import com.tf.demo.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("get")
	public User getUserById(String userid) {
		log.debug("userid:{}", userid);
		return userService.getUserById(userid);
	}
	
}
