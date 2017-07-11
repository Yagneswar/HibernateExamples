package com.sathya.hibernate.dao;

public class ManyToOneDAOFactory {
	public static ManyToOneDAO getInstance()
	{
		return new ManyToOneDAOImpl();
	}

}
