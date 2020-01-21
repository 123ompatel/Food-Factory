package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Order;

@Repository("orderDao")
public interface OrderDao {
	
	public List listAllCustomers();
	 
	 public void saveOrUpdate(Order order);
	 
	 public Order findCustomerById(int id);
	 
	 public void deleteCustomer(int id);
	 
	 public void insertItemId(int itemId,int total,int qty);
	 
	 
	
}
