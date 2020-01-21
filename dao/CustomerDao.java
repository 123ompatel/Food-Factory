package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.BookTable;

@Repository("customerDao")
public interface CustomerDao {
 
 public List listAllCustomers();
 
 public void saveOrUpdate(BookTable customer);
 
 public BookTable findCustomerById(int id);
 
 public void deleteCustomer(int id);
 
}
