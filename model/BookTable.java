package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booktable")
public class BookTable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 @Column(name = "bookdate")
 private String bookdate;
 
 @Column(name = "booktime")
 private String booktime;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBookdate() {
	return bookdate;
}

public void setBookdate(String bookdate) {
	this.bookdate = bookdate;
}

public String getBooktime() {
	return booktime;
}

public void setBooktime(String booktime) {
	this.booktime = booktime;
}
 

}
