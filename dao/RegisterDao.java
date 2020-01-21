package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Register;

@Repository("registerDao")
public interface RegisterDao {
	
	public List listAllCustomers();
	 
	 public void saveOrUpdate(Register register);
	 
	 public Register findCustomerById(int id);
	 
	 public void deleteCustomer(int id);

}
