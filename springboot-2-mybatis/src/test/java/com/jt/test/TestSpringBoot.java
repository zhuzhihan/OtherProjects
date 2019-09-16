package com.jt.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestSpringBoot {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFind() {
		List<User> list = userMapper.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testInsert() {
		User user = new User();
		user.setId(null).setAge(12).setSex("男").setName("1212");
		userMapper.inserts(user);
		System.out.println("入库成功!");
	}

	// 用mybatis-plus插件 省略sql语句(单表)
	@Test
	public void insert() {
		User user = new User();
		user.setId(null).setAge(22).setSex("男").setName("zhuzhihan");
		int rows = userMapper.insert(user);
		System.out.println("入库成功影响:" + rows);
	}

}
