package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ItemDao;
import com.niit.model.BookTable;
import com.niit.model.Items;

@Service
@Transactional 
public class ItemService {
	@Autowired
	ItemDao itemDao;
	
	
	
	 public List<Items> getitem() {
	  return itemDao.getitem();
	 }




	public void saveOrUpdate(Items items) {
		// TODO Auto-generated method stub
		itemDao.saveOrUpdate(items);
	}
	
	
	public Items findById(int itemid) {
		return itemDao.findById(itemid);
	}
	
	
	

}
