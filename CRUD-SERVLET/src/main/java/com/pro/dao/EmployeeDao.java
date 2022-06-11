package com.pro.dao;

import java.util.List;

import com.pro.pojo.Employee;

public interface EmployeeDao {
	//create means (insert)
	public abstract void create(Employee e);
	//fetch
	public abstract List<Employee> read();
	

}
