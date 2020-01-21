package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.model.Register;

@Repository("registerDao")
public class RegisterDaoImpl implements RegisterDao {
	
	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }
	 
	 @SuppressWarnings("unchecked")
	 public List listAllCustomers() {
	  Criteria criteria = getSession().createCriteria(Register.class);
	  return (List) criteria.list();
	 }

	 public void saveOrUpdate(Register register) {
	  getSession().saveOrUpdate(register);
	 }

	 public Register findCustomerById(int id) {
		 Register register = (Register) getSession().get(Register.class, id);
	  return register;
	 }

	 public void deleteCustomer(int id) {
		 Register register = (Register) getSession().get(Register.class, id);
	  getSession().delete(register);
	 }
	

}
