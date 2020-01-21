package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Items;
import com.niit.model.Order;

@Repository("itemDao")
public class ItemDaoImpl  implements ItemDao{
	
	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }
	 
	 @SuppressWarnings("unchecked")
	 public List<Items> getitem() {
	  String s = "from Items";
	  List<Items> items = sessionFactory.getCurrentSession().createQuery(s).list();
	  return items;
	 
	 }

	public void saveOrUpdate(Items items) {
		Session s = getSession();
		s.beginTransaction();
		s.saveOrUpdate(items);
		s.close();
		
		
	}

	public Items findById(int itemid) {
		Session s = getSession();
		
		return s.find(Items.class, itemid);
		
	}

}
