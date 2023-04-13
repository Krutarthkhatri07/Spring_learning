package com.springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/CI/CIconfig.xml");
		person p = (person) context.getBean("person1");
		System.out.println(p);

	}

}
