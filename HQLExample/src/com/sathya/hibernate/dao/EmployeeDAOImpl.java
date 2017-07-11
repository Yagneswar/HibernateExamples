package com.sathya.hibernate.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Employee;
import com.sathya.hibernate.util.Hibernateutil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void findEmployeesByDeptno(int deptno) {
		SessionFactory factory=Hibernateutil.getSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("from Employee e where e.deptNumber=?");
        query.setParameter(0, deptno);
        List list=query.list();
        Iterator it=list.iterator();
        
        while(it.hasNext())
        {
        	Employee e=(Employee)it.next();
        	System.out.println(e.getEmployeeNumber()+" "+e.getEmployeeName()+" "+e.getEmployeeSalary()+" "+e.getDeptNumber());
        	
        }
        session.close();
	}

	@Override
	public void updateEmployeesByDeptno(int deptno) {
		
		SessionFactory factory=Hibernateutil.getSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("update Employee e set e.employeeSalary=8790 where e.deptNumber=?");
        query.setParameter(0, 20);
       
       Transaction tx=session.beginTransaction();
       int i=query.executeUpdate();
       tx.commit();
       System.out.println(i+" row is updated");
       
       session.close();

	}

	
}
