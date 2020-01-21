package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Items;

@Repository("itemDao")
public interface ItemDao {
	
	public List<Items> getitem();

	public void saveOrUpdate(Items items);

	public Items findById(int itemid);



}
