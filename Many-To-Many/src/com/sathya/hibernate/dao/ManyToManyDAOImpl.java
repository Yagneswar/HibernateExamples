package com.sathya.hibernate.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Auther;
import com.sathya.hibernate.model.Book;
import com.sathya.hibernate.util.Hibernateutil;

public class ManyToManyDAOImpl implements ManyToManyDAO {

	@Override
	public void saveBooks() {
		
		Book b1=new Book();
	      b1.setBookId(1);
	      b1.setBookName("Java");
	    
	      Book b2=new Book();
	      b2.setBookId(2);
	      b2.setBookName("Oracle");
	      Auther a1=new Auther();
	      a1.setAutherId(2001);
	      a1.setAutherName("X");
	      
	      Auther a2=new Auther();
	      a2.setAutherId(2002);
	      a2.setAutherName("Y");  
	      
	      Set authers=new HashSet();
	       authers.add(a1);
	       authers.add(a2);
	       
	       b1.setAuthers(authers);
	       b2.setAuthers(authers);
	       SessionFactory factory=Hibernateutil.getSessionFactory();
	       Session session=factory.openSession();
	       Transaction tx=session.beginTransaction();
	       session.save(b1);
	       session.save(b2);
 	       tx.commit();
	       session.close();
	       
	      
        
	}

}
