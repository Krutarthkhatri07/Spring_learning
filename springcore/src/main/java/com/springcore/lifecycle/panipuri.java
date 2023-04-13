package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class panipuri {

	private double price;

	@Override
	public String toString() {
		return "panipuri [price=" + price + "]";
	}

	public panipuri() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("inside init method..");
	}
	@PreDestroy
	public void destory()
	{
		System.out.println("inside destory mothod..");
	}
	
}
