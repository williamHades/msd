package com.cm.action;

import org.apache.log4j.Logger;

import com.cm.model.User;
import com.cm.service.UserService;
import com.cm.test.UserServiceTest;

public class LoginAction {
	

	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	public void selectUserByIdTest(){
		User user = userService.selectUserById(10);
		logger.debug("²éÕÒ½á¹û £º  "+user);
	}
}
