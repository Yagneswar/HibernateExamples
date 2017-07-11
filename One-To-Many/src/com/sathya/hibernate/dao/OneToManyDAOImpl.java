package com.sathya.hibernate.dao;

import java.util.HashSet;



import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Customer;
import com.sathya.hibernate.model.Item;
import com.sathya.hibernate.util.Hibernateutil;

public class OneToManyDAOImpl implements OneToManyDAO
{

	@Override
	public void saveCustomer() 
	{
		Customer c1=new Customer();
		c1.setCustomerId(101);
		c1.setCustomerName("Rajesh");
		
		Item i1=new Item();
		i1.setItemId(9111);
		i1.setItemName("honey");
		i1.setPrice(3000);
		
		Item i2=new Item();
		i2.setItemId(9101);
		i2.setItemName("medicine");
		i2.setPrice(5000);
		
		Set items=new HashSet();
		items.add(i1);
		items.add(i2);
		c1.setItems(items);
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(c1);
		tx.commit();
		ses.close();
       
	}

}
