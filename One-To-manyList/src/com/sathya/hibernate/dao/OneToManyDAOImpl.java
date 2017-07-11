package com.sathya.hibernate.dao;

import java.util.ArrayList;
import java.util.HashSet;



import java.util.List;

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
		c1.setCustomerName("Dinesh");
		
		Item i1=new Item();
		i1.setItemId(2001);
		i1.setItemName("dress");
		i1.setPrice(5000);
		
		Item i2=new Item();
		i2.setItemId(2002);
		i2.setItemName("vehicle");
		i2.setPrice(7000);
		
		List items=new ArrayList();
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
	
	/*
	@Override
	public void addAnatherItem()
	{
		Item i3=new Item();
		i3.setItemId(9003);
		i3.setItemName("z");
		i3.setPrice(9000);
		
		Item i4=new Item();
		i4.setItemId(9004);
		i4.setItemName("Arpan");
		i4.setPrice(10000);
		
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Customer c1=(Customer)session.get(Customer.class,101);
		Set items=c1.getItems();
		Transaction tx=session.beginTransaction();
		items.add(i3);
		items.add(i4);
		tx.commit();
		session.close();
		
	}
	@Override
	public void removeItem()
	{
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Customer c1=(Customer)session.get(Customer.class,101);
		Set items=c1.getItems();
		Item i3=(Item)session.get(Item.class, 9003);
		Transaction tx=session.beginTransaction();
		items.remove(i3);
		tx.commit();
		session.close();
		
	}
	@Override
	public void removeCustomer()
	{
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Customer c1=(Customer)session.get(Customer.class,101);
		Set items=c1.getItems();
		Transaction tx=session.beginTransaction();
		session.delete(c1);
		tx.commit();
		session.close();
	}
  */
  
}
