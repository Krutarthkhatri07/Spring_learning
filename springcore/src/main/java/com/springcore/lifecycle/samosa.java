package com.springcore.lifecycle;

public class samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting samosa price..");
		this.price = price;
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("inside init method..");
	}
	public void destory()
	{
		System.out.println("inside destory mothod..");
	}
	

}
