package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Employee employee) {
		
		String sql= "insert into employee(id,name,dept,salary) values(?,?,?,?)";
		int r = this.jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getDept(), employee.getSalary());
		return r;
	}

	@Override
	public int change(Employee employee) {
		
		String sql = "update employee set name=?, dept=?, salary=? where id=?";
		int r = this.jdbcTemplate.update(sql, employee.getName(), employee.getDept(), employee.getSalary(),employee.getId());
		return r;
	}
	
	
	@Override
	public int delete(int employeeId) {
		String sql = "delete from employee where id=?";
		int r = this.jdbcTemplate.update(sql, employeeId);
		return r;
	}

	
	@Override
	public Employee select(int employeeId) {
		
		String query = "select * from employee where id=?";
		RowMapper<Employee> rowMapper = new RowMapperEmployee();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowMapper, employeeId);
		return employee;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	
	
	
}
