package com.jt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatisPlus {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelectOne() {
		// 根据主键查询数据库
		int id = 55;
		User user = userMapper.selectById(id);
		System.out.println(user);

		// 根据非主键查询 queryWrapper条件构造器
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("name", "zhuzhihan");// 相当于where name ="****";
		User user2 = userMapper.selectOne(queryWrapper);
		System.out.println(user2);
	}

	@Test
	public void testList() {
		/**
		 * >(gt) <(lt) =(eq) >=(ge) <=(le)
		 */

		// 查询全部数据 不需要条件
		List<User> list = userMapper.selectList(null);
		for (User user : list) {
			System.out.println(user);
		}

		// 查询年龄大于18岁的妹子
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.ge("age", 18).eq("sex", "女");
		List<User> list2 = userMapper.selectList(queryWrapper);
		for (User user2 : list2) {
			System.out.println(user2);
		}

		// 查询年龄等于18岁的妹子
		User user3 = new User();
		user3.setAge(18).setSex("女");
		QueryWrapper<User> queryWrapper2 = new QueryWrapper<>(user3);
		List<User> list3 = userMapper.selectList(queryWrapper2);
		for (User user4 : list3) {
			System.out.println(user4);
		}

	}

	@Test
	public void testUpdateUser() {
		// 利用主键更新
		User user = new User();
		user.setAge(5000).setId(54).setName("凹凸曼").setSex("女");
		int rows = userMapper.updateById(user);
		System.out.println(rows);

		// 利用条件构造器
		User user2 = new User();
		user2.setAge(500).setName("小怪兽").setSex("女");
		UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("id", 55);
		int row = userMapper.update(user2, updateWrapper);
		System.out.println(row);
	}

	@Test
	public void testDelete() {
		userMapper.deleteById(55);
		System.out.println("删除成功!");

		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("age", 5000);
		userMapper.delete(queryWrapper);
		System.out.println("删除ok!");

		Integer[] array = { 51, 52, 53 };
		List<Integer> asList = Arrays.asList(array);
		int row = userMapper.deleteBatchIds(asList);
		System.out.println("删除成功行数:" + row);
	}

}
