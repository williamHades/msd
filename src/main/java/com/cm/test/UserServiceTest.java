package com.cm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cm.dao.UserDao;
import com.cm.model.User;

public class UserServiceTest{

	public static void main(String[] args){
		 ApplicationContext ctx=null;
		 ctx=new ClassPathXmlApplicationContext("application.xml");
		 UserDao userDao=(UserDao) ctx.getBean("userDao");
		 User user = userDao.selectUserById(9);
		 
		 System.out.println(user.getUserId() + " - " + user.getUserName());
	}
}
