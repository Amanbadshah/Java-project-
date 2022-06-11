package com.springStereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Shaikh Aman")
	private String studentName;
	@Value("MUMBAI")
	private String city;
	@Value("#{ad}")
	private List<String> address;
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
}
