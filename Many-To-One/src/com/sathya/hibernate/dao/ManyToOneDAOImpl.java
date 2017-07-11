package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Customer;
import com.sathya.hibernate.model.Item;
import com.sathya.hibernate.util.Hibernateutil;

public class ManyToOneDAOImpl implements ManyToOneDAO {

	@Override
	public void saveItem() {
		Customer c1=new Customer();
		c1.setCustomerId(101);
		c1.setCustomerName("Hari");
      Item i1=new Item();
       i1.setItemId(9001);
       i1.setItemName("X");
       i1.setPrice(5000);
       
       Item i2=new Item();
       i2.setItemId(9002);
       i2.setItemName("Y");
       i2.setPrice(6000); 
       
       i1.setCustomer(c1);
       i2.setCustomer(c1);
       SessionFactory factory=Hibernateutil.getSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(i1);
		ses.save(i2);
		tx.commit();
		ses.close();
         
	}

	@Override
	public void deleteItem() {
		
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session ses=factory.openSession();
		Item i=(Item)ses.get(Item.class, 9002);
		Transaction tx=ses.beginTransaction();
		ses.delete(i);
		tx.commit();
		ses.close();

	}

}
