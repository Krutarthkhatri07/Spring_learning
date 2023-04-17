package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//save student
	@Transactional
	public int insert(Student student)
	{
		int i  = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	//get single record
	public Student getstudent(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	//get mutilple record
	public List<Student> getallstudent()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	//delete record
	@Transactional
	public void deletestudent(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
		
	}
	//upate record
	@Transactional
	public void updatestudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
