package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("started...");
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(jdbcconfig.class);
		StudentDao studentDao = (StudentDao)context.getBean("studentDao");
		
		//insert row
//		Student student=new Student();
//		student.setId(3);
//		student.setName("vidhi1");
//		student.setCity("Ahmedabad");
//		
//		int insert = studentDao.insert(student);
//		System.out.println("student added "+insert);
		
		//update row
//		Student student =new Student();
//		student.setId(3);
//		student.setName("vikram");
//		student.setCity("veraval");
//		
//		int update = studentDao.update(student);
//		System.out.println("student updated "+update);
		
		//delete row	
//		Student student =new Student();
//		student.setId(3);
//		
//		int delete = studentDao.delete(student);
//		System.out.println("student deleted "+delete);
		
		//select single row
//		Student getstudent = studentDao.getstudent(5);
//		System.out.println(getstudent);
		
		List<Student> getallstudent = studentDao.getallstudent();
		for(Student student: getallstudent)
		{
			System.out.println(student);
		}
		
		//used for create table 
		//studentDao.createtable();
		
		
		
		
		
	}
}
