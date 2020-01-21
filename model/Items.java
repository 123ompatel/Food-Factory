package com.niit.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Items {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)	  
	 private int itemid;
	 
	 @Column(name = "itemname")
	 private String itemname;
	 
     @Column(name = "price")
     private int price;
     
   
	 @OneToMany(mappedBy="item")
	 List<Order> orders;
	 public List<Order> getOrder() {
		return orders;
	}

	public void setOrder(List<Order> order) {
		this.orders = order;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	 
	 

}
