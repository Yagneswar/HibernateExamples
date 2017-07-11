package com.sathya.hibernate.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
        SQLQuery qry=session.createSQLQuery("select * from emp where deptno=?");
        qry.setParameter(0, deptno);
        qry.addEntity(Employee.class);
        List list=qry.list();
        Iterator it=list.iterator();
        
        while(it.hasNext())
        {
        	Employee e=(Employee)it.next();
        	System.out.println(e.getEmployeeNumber()+" "+e.getEmployeeName()+" "+e.getEmployeeSalary()+" "+e.getDeptNumber());
        	
        }
        session.close();
	}

	@Override
	public void insertEmployee()
	{
		SessionFactory factory=Hibernateutil.getSessionFactory();
        Session session=factory.openSession();
        SQLQuery qry=session.createSQLQuery("insert into emp values(:p1,:p2,:p3,:p4)");
        qry.setParameter("p1", 7832);
        qry.setParameter("p2", "JOHN");
        qry.setParameter("p3", 4000);
        qry.setParameter("p4", 21);
        Transaction tx=session.beginTransaction();
        int i=qry.executeUpdate();
        tx.commit();
        System.out.println(i+"row is inserted");
        session.close();
	}

	
}
