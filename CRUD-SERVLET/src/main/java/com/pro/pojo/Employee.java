package com.pro.pojo;

import java.io.Serializable;

public class Employee implements Serializable {
private int eid;
private String name;
private double salary;
private String address;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(int eid, String name, double salary, String address) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}
}