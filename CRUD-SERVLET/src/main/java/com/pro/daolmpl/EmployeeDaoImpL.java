package com.pro.daolmpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pro.dao.EmployeeDao;
import com.pro.pojo.Employee;
import com.pro.utility.Dbconnection;

public class EmployeeDaoImpL implements EmployeeDao {
	Connection con;
	static PreparedStatement ps;
	ResultSet rs;

	@Override
	public void create(Employee e) {
		// TODO Auto-generated method stub
		Connection con = Dbconnection.getConnection();

		String query = "insert into  Employee(name,salary,address) values(?,?,?)";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, e.getName());
			ps.setDouble(2, e.getSalary());
			ps.setString(3, e.getAddress());
			ps.executeUpdate();
			con.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Employee> read() {
		// TODO Auto-generated method stub
		String query = "select * from Employee";
		con = Dbconnection.getConnection();
		List<Employee> list = new ArrayList<Employee>();
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEid(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAddress(rs.getString("address"));
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}