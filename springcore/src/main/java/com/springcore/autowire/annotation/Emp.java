package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp2")//which bean we have to call
	private Address address1;
	private String name;

	public Address getAddress1() {
		return address1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address1, String name) {
		super();
		this.address1 = address1;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [address1=" + address1 + ", name=" + name + "]";
	}
	


	
	

}
