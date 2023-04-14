package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	private List<String> friends;
	private Map<String, Integer> fees;
	private Properties pros1;

	public Properties getPros1() {
		return pros1;
	}

	public void setPros1(Properties pros1) {
		this.pros1 = pros1;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", fees=" + fees + ", pros1=" + pros1 + "]";
	}

	

	

}
