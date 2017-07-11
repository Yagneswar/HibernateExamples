package com.sathya.hibernate.dao;

public class paymentDAOFactory {
	
	public static paymentDAO getInstance()
	{
		return new paymentDAOImpl();
	}

}
