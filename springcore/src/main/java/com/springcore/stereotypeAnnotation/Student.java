package com.springcore.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")//scope is used for define scope of object type like by defualt singlton(singlton,prototype,session,reuest,golobalsession)
public class Student {
	@Value("krutarth")
	private String studentname;
	@Value("Ahmedabad")
	private String city;

	@Value("#{myaddress}")
	private List<String> address;

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + ", address=" + address + "]";
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentname, String city) {
		super();
		this.studentname = studentname;
		this.city = city;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
