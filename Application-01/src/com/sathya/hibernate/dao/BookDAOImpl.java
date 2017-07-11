/**
 * 
 */
package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Book;
import com.sathya.hibernate.util.Hibernateutil;
public class BookDAOImpl implements BookDAO {

	@Override
	public void saveBook(Book b) {
		// TODO Auto-generated method stub

		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(b);
		tx.commit();
		session.close();
		System.out.println("Book is Saved to database");
	}
	@Override
	public Book readBook(int bookId) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Object o=session.get(Book.class, bookId);
		Book book=(Book)o;
		session.close();
		return book;
	}

}
