package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@Controller
public class UserController {
	@Autowired

	private UserMapper userMapper;

	@RequestMapping("findAll")
	public String findObjects(Model model) {

		List<User> userList = userMapper.selectList(null);
		model.addAttribute("userList", userList);
		return "userList";
	}

	@RequestMapping("user/ajax")
	public String pageAjax() {
		return "userList-ajax";
	}

	@RequestMapping("testAjax")
	@ResponseBody
	public List<User> testAjax() {
		return userMapper.selectList(null);
	}

}
