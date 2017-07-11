package com.sathya.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {

	private static SessionFactory factory;
	private Hibernateutil(){ }
	public static synchronized SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure("com/sathya/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
		}
		
	return factory;
	}
	
}
