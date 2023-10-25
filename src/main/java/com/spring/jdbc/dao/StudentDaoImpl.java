package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) {
		
		String sql="update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(sql, student.getName(), student.getCity(), student.getId());
		return r;
	}
	
	
	@Override
	public int delete(Student student) {
		
		String sql = "delete from student where id=?";
		int r = this.jdbcTemplate.update(sql, student.getId());
		return r;
	}
	
	
	@Override
	public Student select(int studentId) {
		
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return student;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
