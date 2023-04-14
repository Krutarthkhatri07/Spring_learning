package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spEL/spELconfig.xml");
		demo d=(demo)context.getBean("demo");
		System.out.println(d);

	}

}	
