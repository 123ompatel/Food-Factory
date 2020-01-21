package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.RegisterDao;
import com.niit.model.Register;

@Service
@Transactional
public class RegisterService {
	
	 
	 @Autowired
	 RegisterDao registerDao;
	/*
	 * public void setCustomerDao(RegisterDao registerDao) { this.registerDao =
	 * registerDao; }
	 */

	 public List listAllCustomers() {
	  return registerDao.listAllCustomers();
	 }

	 public void saveOrUpdate(Register register) {
		 registerDao.saveOrUpdate(register);
	 }

	 public Register findCustomerById(int id) {
	  return registerDao.findCustomerById(id);
	 }

	 public void deleteCustomer(int id) {
		 registerDao.deleteCustomer(id);
	 }


}
