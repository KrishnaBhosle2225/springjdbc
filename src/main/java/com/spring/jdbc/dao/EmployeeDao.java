package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;

public interface EmployeeDao {
	
	public int insert(Employee employee);
	
	public int change(Employee employee);
	
	public int delete(int employeeId);
	
	public Employee select(int employeeId);
}
