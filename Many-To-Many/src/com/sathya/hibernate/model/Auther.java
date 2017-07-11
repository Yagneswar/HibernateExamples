package com.sathya.hibernate.model;

import java.util.List;

public class Auther {
	
	private int autherId;
	private String autherName;
	private List books;
	public int getAutherId() {
		return autherId;
	}
	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public List getBooks() {
		return books;
	}
	public void setBooks(List books) {
		this.books = books;
	}
	

}
