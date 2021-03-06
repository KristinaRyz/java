//package com.telran.maptest.library;

import java.util.*;

public class Library {
  private String name;
  private String address;
  
  private TreeMap<Book,Integer> stock =
		           new TreeMap<Book,Integer>();
  
  public Library(String name,String address){
	  this.name = name;
	  this.address = address;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public void addBook(Book b){
	Set<Book> books = stock.keySet();
	for(Book bk : books){
		if(bk.equals(b)){
			int q = stock.get(bk);
			q++;
			stock.replace(bk, q);
			return;
		}
	}
	stock.put(b, 1);
}
public void display(){
	System.out.println(stock);
}
}
