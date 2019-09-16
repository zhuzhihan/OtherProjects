package com.jt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;

@RestController
@RequestMapping("/user")

public class UserController {

	@RequestMapping("getUser")
	public User getUser() {
		User user = new User();
		user.setAge(20)
		.setId(110)
		.setName("hello")
		.setSex("men");
		return user;
	}
}
