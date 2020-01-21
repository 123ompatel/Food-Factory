package com.niit.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.BookTable;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

 @Autowired
 private SessionFactory sessionFactory;

 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }
 
 @SuppressWarnings("unchecked")
 public List listAllCustomers() {
  Criteria criteria = getSession().createCriteria(BookTable.class);
  return (List) criteria.list();
 }

 public void saveOrUpdate(BookTable customer) {
  getSession().saveOrUpdate(customer);
 }

 public BookTable findCustomerById(int id) {
  BookTable customer = (BookTable) getSession().get(BookTable.class, id);
  return customer;
 }

 public void deleteCustomer(int id) {
  BookTable customer = (BookTable) getSession().get(BookTable.class, id);
  getSession().delete(customer);
 }
}