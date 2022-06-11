package com.Autowiring;

public class Employee {
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
