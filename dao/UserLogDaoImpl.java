package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Items;
import com.niit.model.User;





@Repository("userLogDao")
public class UserLogDaoImpl implements UserLogDao {
	
	
	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }



	public void update(User user) {
//		Session s = getSession();
//		s.beginTransaction();
//		s.saveOrUpdate(user);
//		s.close();		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void add(User user) {
		Session s = getSession();
		//s.beginTransaction();
		s.save(user);
		//s.close();
		
	}

	public User findById(String userid) {
        Session s = getSession();
		
		return s.find(User.class,userid);
	}

}
