package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }
	 
	public void addUser(User u) {
		
		getSession().beginTransaction();
		getSession().save(u);
		getSession().close();
		
		
		
	}

}
