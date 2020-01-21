package com.niit.dao;

import org.springframework.stereotype.Repository;


import com.niit.model.User;
@Repository("userDao")
public interface UserDao {

	public void addUser(User u);
}
