package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demomain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
		Student s1=(Student)context.getBean("getstuent");
		s1.study();

	}

}
