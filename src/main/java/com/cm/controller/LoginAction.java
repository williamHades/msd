package com.cm.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cm.model.User;
import com.cm.service.UserService;
import com.cm.test.UserServiceTest;

@Controller
public class LoginAction {
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);

	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView selectUserByIdTest(String username,String password){
		ModelAndView mav = new ModelAndView("home");
		System.out.println("hello world ... ");
		User user = userService.selectUserById(9);
		logger.debug("²éÕÒ½á¹û £º  "+user);
		mav.addObject("user",user);
		return mav;
	}
}
