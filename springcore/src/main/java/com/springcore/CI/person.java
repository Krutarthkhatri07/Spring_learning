package com.springcore.CI;

import java.util.List;

public class person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	
	public person(String name, int personId, Certi certi,List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.list=list;
	}
	

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", list=" + list + "]";
	}


	
	
	

}
