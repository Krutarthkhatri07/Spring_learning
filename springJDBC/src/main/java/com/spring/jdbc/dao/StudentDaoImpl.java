package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int update(Student student) {
		// update query
		String query = "update student set name=?,city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(Student student) {
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, student.getId());
		return result;
	}

	public Student getstudent(int studentId) {
		// select single student data;
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public List<Student> getallstudent() {
		// get all student
		String query = "select * from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	public void createtable() {

		String sql = "CREATE TABLE users (" + "id INT PRIMARY KEY AUTO_INCREMENT," + "name VARCHAR(50) NOT NULL,"
				+ "email VARCHAR(100) NOT NULL);";
		this.jdbcTemplate.execute(sql);
		return;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
