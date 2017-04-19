package com.cm.dao;

import com.cm.model.User;

public interface UserDao {

    public User selectUserById(Integer userId); 
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
