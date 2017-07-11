package com.sathya.hibernate.model;

import java.util.Set;

public class Book {
	private int bookId;
	private String bookName;
	private Set authers;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Set getAuthers() {
		return authers;
	}
	public void setAuthers(Set authers) {
		this.authers = authers;
	}
	

}
