package com.sathya.hibernate.model;

public class Item {
	private int itemId;
	private String itemName;
	private int Price;
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	private Customer Customer;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer customer) {
		Customer = customer;
	}
	
	

}
