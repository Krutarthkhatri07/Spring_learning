package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Emp employee=(Emp)context.getBean("employee");
		
		System.out.println(employee.getName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddresses());
		System.out.println(employee.getCourses());
		System.out.println(employee.getProps());
		

	}

}
