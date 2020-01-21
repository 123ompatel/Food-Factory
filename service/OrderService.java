package com.niit.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.OrderDao;
import com.niit.model.Items;
import com.niit.model.Order;

@Service
@Transactional
public class OrderService {
	
	
	 
	 @Autowired
	 OrderDao orderDao;
	/*
	 * public void setCustomerDao(OrderDao orderDao) { this.orderDao = orderDao; }
	 */

	 public List listAllCustomers() {
	  return orderDao.listAllCustomers();
	 }

	 public void saveOrUpdate(Order order) {
		 orderDao.saveOrUpdate(order);
	 }

	 public Order findCustomerById(int id) {
	  return orderDao.findCustomerById(id);
	 }
	 
	 public void insertIntoOrder(int itemId,int total,int qty)
	 {
		 orderDao.insertItemId(itemId,total,qty);
	 }

	 public void deleteCustomer(int id) {
		 orderDao.deleteCustomer(id);
	 }


}
