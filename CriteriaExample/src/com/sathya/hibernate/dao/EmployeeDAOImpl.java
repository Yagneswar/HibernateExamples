package com.sathya.hibernate.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
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
        Criteria crit=session.createCriteria(Employee.class);
        List list=crit.list();
        Iterator it=list.iterator();
        
        while(it.hasNext())
        {
        	Employee e=(Employee)it.next();
        	System.out.println(e.getEmployeeNumber()+" "+e.getEmployeeName()+" "+e.getEmployeeSalary()+" "+e.getDeptNumber());
        	
        }
        session.close();
	}

	
	

	
}
