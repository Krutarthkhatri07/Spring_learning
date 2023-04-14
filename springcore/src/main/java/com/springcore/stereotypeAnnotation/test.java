package com.springcore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/stereotypeAnnotation/stereotypeconfig.xml");
	Student s1=(Student)context.getBean("ob");
	System.out.println(s1.hashCode());
	Student s2=(Student)context.getBean("ob");
	System.out.println(s2.hashCode());
	
	teacher t1=(teacher)context.getBean("teacher");
	System.out.println(t1.hashCode());
	teacher t2=(teacher)context.getBean("teacher");
	System.out.println(t2.hashCode());
	
	}
}
