package com.niit.dao;

import org.springframework.stereotype.Repository;

import com.niit.model.Register;
import com.niit.model.User;


@Repository("userLogDao")
public interface UserLogDao {
	
	public void add(User user);
	
	public void update(User userLog);
	
	public void delete(int id);
	
	public User findById(String id);

}
