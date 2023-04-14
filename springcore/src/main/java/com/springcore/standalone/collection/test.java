package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
	person p1=(person)context.getBean("person1");
	person p2=(person)context.getBean("person2");
	System.out.println(p1);
	System.out.println(p2);

	}

}
