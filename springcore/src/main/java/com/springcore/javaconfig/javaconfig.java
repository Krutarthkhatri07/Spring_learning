package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class javaconfig {
	
		@Bean
		public Samosa getsamosa()
		{
			Samosa samosa=new Samosa();
			return samosa;
		}
		@Bean
		public Student getstuent()
		{
			//creating new object
			Student student=new Student( getsamosa());
			return student;
		}

	
}
