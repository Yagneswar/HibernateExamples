package com.sathya.hibernate.dao;

public interface EmployeeDAO {
	
	void findEmployeesByDeptno(int deptno);
	void updateEmployeesByDeptno(int deptno);

}