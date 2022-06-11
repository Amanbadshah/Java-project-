package com.annotation.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("Temp2")

	private Address adderss;

	@Override
	
	public String toString() {
		return "Employee [adderss=" + adderss + "]";
	}

	public Address getAdderss() {
		return adderss;
	}
	
	public void setAdderss(Address adderss) {
		this.adderss = adderss;
		System.out.println("this setter methiood");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public Employee(Address adderss) {
		super();
		this.adderss = adderss;
	}
	

}