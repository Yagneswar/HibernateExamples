package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Cheque;
import com.sathya.hibernate.model.CreditCard;
import com.sathya.hibernate.util.Hibernateutil;

public class paymentDAOImpl implements paymentDAO {

	@Override
	public void saveCard(CreditCard card) {
		// TODO Auto-generated method stub
	SessionFactory factory=Hibernateutil.getSessionFactory();
     Session session=factory.openSession();
     Transaction tx=session.beginTransaction();
     session.save(card);
     tx.commit();
     session.close();
     System.out.println("card details saved");
	}

	@Override
	public void saveCheque(Cheque cheque) {
		// TODO Auto-generated method stub
  
		SessionFactory factory=Hibernateutil.getSessionFactory();
		
	     Session session=factory.openSession();
	     Transaction tx=session.beginTransaction();
	     session.save(cheque);
	     tx.commit();
	     session.close();
	     System.out.println("Cheque details saved");
	}

}
