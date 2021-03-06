package com.cm.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cm.dao.UserDao;
import com.cm.model.User;
import com.cm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired  
    private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User selectUserById(Integer key) {
	        return userDao.selectUserById(key);  
	}
}
