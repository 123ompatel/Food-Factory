package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserLogDao;
import com.niit.model.Register;
import com.niit.model.User;


@Service
@Transactional
public class UserLogService {
	
	@Autowired
	UserLogDao userLogDao;
	
	public void add(User user) {
		
		userLogDao.add(user);
	}
	
	public void update(User userLog) {
		userLogDao.update(userLog);
		
	}
	
	public void delete(int id) {
		
		userLogDao.delete(id);
	}
	
	 public User findById(String id) {
		  return userLogDao.findById(id);
		 }

}
