package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		samosa s1 = (samosa) context.getBean("s1");
//		System.out.println(s1);
//
//		System.out.println("****************************");
//		pepsi p1 = (pepsi) context.getBean("p1");
//		System.out.println(p1);

		
		panipuri pa1 = (panipuri) context.getBean("pa1");
		System.out.println(pa1);
		// registerShutdownHook is used for call destory method for that we have to
		// create object of AbstractApplicationContext insted of ApplicationContext
		context.registerShutdownHook();

	}

}
