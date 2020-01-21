package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
	
	 @Id
		 
	 private String userid;
	 private String pwd;
	 @OneToOne
	 Role role;
	 
	public String getUserid() {
		return userid;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
		 
	 
	 
	 
	 
//	 public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}
//	private String userpwd;
//	 
//	 @OneToMany(mappedBy="user")
//	 List<Order> order;
//	
//	public List<Order> getOrder() {
//		return order;
//	}
//	public void setOrder(List<Order> order) {
//		this.order = order;
//	}
//	
//	public String getUserpwd() {
//		return userpwd;
//	}
//	public void setUserpwd(String userpwd) {
//		this.userpwd = userpwd;
//	}	 
	 

}
