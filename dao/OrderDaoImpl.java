package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Items;
import com.niit.model.Order;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {
	
	
	@Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }
	 
	 @SuppressWarnings("unchecked")
	 public List listAllCustomers() {
	  Criteria criteria = getSession().createCriteria(Order.class);
	  return (List) criteria.list();
	 }

	 public void saveOrUpdate(Order order) {
	  getSession().saveOrUpdate(order);
	 }

	 public Order findCustomerById(int id) {
	  Order order = (Order) getSession().get(Order.class, id);
	  return order;
	 }

	 public void deleteCustomer(int id) {
	  Order order = (Order) getSession().get(Order.class, id);
	  getSession().delete(order);
	 }

	public void insertItemId(int itemId,int total,int qty) {
		Items item = getSession().find(Items.class, itemId);
		Order o = new Order();
		o.setItem(item); 
		o.setPrice(total); 
		o.setQnty(qty);
		getSession().save(o);  
		
	}

	
	 
	
		 

}
