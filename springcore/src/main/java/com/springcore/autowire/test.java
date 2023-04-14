package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
		Emp e1=(Emp)context.getBean("employee");
		System.out.println(e1);
//		Address a1=(Address)context.getBean("address");
		

	}

}
 