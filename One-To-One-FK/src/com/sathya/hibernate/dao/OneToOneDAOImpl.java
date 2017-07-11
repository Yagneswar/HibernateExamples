package com.sathya.hibernate.dao;

import java.util.Calendar;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.sathya.hibernate.model.Passport;
import com.sathya.hibernate.model.Person;
import com.sathya.hibernate.util.Hibernateutil;

public class OneToOneDAOImpl implements OneToOneDAO {

	@Override
	public void savePassports() {
		Person person=new Person();
		person.setPersonId(1010);
		person.setPersonName("Arpan");
		
		Passport passport=new Passport();
		passport.setPassportId(8090);
		Calendar calender=Calendar.getInstance();
		calender.set(2019, 10, 21);
		java.util.Date date=calender.getTime();
		passport.setExpireDate(date);
		passport.setPerson(person);
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(passport);
		
        tx.commit();
        session.close();
	}

}
