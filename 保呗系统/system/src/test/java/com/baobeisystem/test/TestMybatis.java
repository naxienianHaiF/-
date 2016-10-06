package com.baobeisystem.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baobeisystem.dao.user.BBSuserDao;
import com.baobeisystem.entity.BBSuser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class TestMybatis {

	@Autowired
	private BBSuserDao bBSUserDao;
	
	@Test
	public void mybatisTest(){
//		System.out.println(bBSUserDao);
//		BBSuser user=new BBSuser();
//		user.setUsername("wjh");
//		user.setPassword("wjhxcf");
//		user.setNickname("小海海");
//		user.setJob("student");
//		user.setAddress("上海市闸北区");
//		user.setAge((byte)0);
//		user.setEmail("1623631899@qq.com");
//		bBSUserDao.updateBBSuserByUsername(user);
//		System.out.println("after update.... ");
		System.out.println(bBSUserDao.getBBSuserByUsername("wjh"));
		System.out.println("".equals(null));
		System.out.println(bBSUserDao.getBBSuserByUsername("wj%"));
	}
	
	@Test
	public void registerTest(){
		BBSuser user=new BBSuser();
		user.setUsername("xcf");
		user.setPassword("wjhxcf");
		user.setEmail("991803407@qq.com");
		
		System.out.println(bBSUserDao.registerUser(user));
	}
	
}
