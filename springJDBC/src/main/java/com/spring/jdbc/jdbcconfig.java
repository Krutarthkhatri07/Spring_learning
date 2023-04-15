package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

@Configuration
public class jdbcconfig {

	 @Bean("ds")
	 public DriverManagerDataSource getDataSource()
	 {
		 DriverManagerDataSource ds=new DriverManagerDataSource();
		 ds.setDriverClassName("com.mysql.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		 ds.setUsername("root");
		 ds.setPassword("root");
		 return ds;
	 }
	 @Bean("jdbcTemplate")
	 public JdbcTemplate getTemplate()
	 {
		 JdbcTemplate jdbcTemplate = new JdbcTemplate();
		 jdbcTemplate.setDataSource(getDataSource());
		 return jdbcTemplate;
	 }
	 @Bean("studentDao")
	 public StudentDao getstudentdao()
	 {
		 StudentDaoImpl studentDao = new StudentDaoImpl();
		 studentDao.setJdbcTemplate(getTemplate());
		 return studentDao;
	 }
}
