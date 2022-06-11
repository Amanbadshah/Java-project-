package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachori {
	@Override
	public String toString() {
		return "Kachori [price=" + price + "]";
	}

	private String  price;

	public Kachori() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	@PostConstruct
	public void start () {
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end () {
		System.out.println("ENDING ");
	}

}
