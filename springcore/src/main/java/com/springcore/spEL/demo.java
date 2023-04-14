package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demo {
	@Value("#{11+33}")
	private int x;
	@Value("#{11*32}")//we are setting primitive value
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}") //we are calling static method of that class
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")//we are calling static varibale of that class
	private double pi;
	
	@Value("#{new java.lang.String('krutarth')}")//we are create object of string
	private String name;
	
	@Value("#{8>3}")//we are setting boolean value 
	private boolean b;
	
	
	
	
	
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", b=" + b + "]";
	}
	
	
	
	
	
	
	

}
