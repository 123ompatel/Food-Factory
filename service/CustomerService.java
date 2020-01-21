package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerDao;
import com.niit.model.BookTable;

@Service
@Transactional
public class CustomerService  {
 
 
 
 @Autowired
 CustomerDao customerDao;
// public void setCustomerDao(CustomerDao customerDao) {
//  this.customerDao = customerDao;
// }

 public List listAllCustomers() {
  return customerDao.listAllCustomers();
 }

 public void saveOrUpdate(BookTable customer) {
  customerDao.saveOrUpdate(customer);
 }

 public BookTable findCustomerById(int id) {
  return customerDao.findCustomerById(id);
 }

 public void deleteCustomer(int id) {
  customerDao.deleteCustomer(id);
 }

}
