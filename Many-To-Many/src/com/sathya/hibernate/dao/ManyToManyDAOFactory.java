package com.sathya.hibernate.dao;

public class ManyToManyDAOFactory {

	public static ManyToManyDAO getInstance()
	{
		return new ManyToManyDAOImpl();
	}
}
