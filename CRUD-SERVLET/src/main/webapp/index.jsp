<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pro.pojo.Employee"%>
<%@page import="com.pro.dao.EmployeeDao"%>
<%@page import="com.pro.daolmpl.EmployeeDaoImpL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: red;" align="center">Registration Form</h1>
	<form action="EmployeeController" method="post">
		<table align="center" border="1">
			<tr>
				<td>ID: <input type="text" name="eid" readonly="readonly"
					placeholder="DONT TYPE ">
				</td>
			</tr>
			<tr>
				<td>NAME:<input type="text" name="name" placeholder=" TYPE "
					required="required">
				</td>
			</tr>
			<tr>
				<td>SALARY:<input type="number" name="salary"
					placeholder=" TYPE " required="required">
				</td>
			</tr>
			<tr>
				<td>ADDRESS:<input type="text" name="address"
					placeholder=" TYPE " required="required">
				</td>
			</tr>

			  



			<td align="center">
				<button type="submit">SUBMIT</button>
			</td>


		</table>

		<hr>
		<table align="center" border="1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>SALARY</th>
				<th>ADDRESS</th>
			</tr>
			<%
			Employee emp1 = null;
			EmployeeDao empdao = null;
			emp1 = new Employee();
			empdao = new EmployeeDaoImpL();
			List<Employee> list = empdao.read();
			Iterator<Employee> itr = list.iterator();
			while (itr.hasNext()) {
				emp1 = itr.next();
			%>
			<tr>
				<td><%=emp1.getEid()%></td>
				<td><%=emp1.getName()%></td>
				<td><%=emp1.getSalary()%></td>
				<td><%=emp1.getAddress()%></td>
			</tr>

			<%
			}
			%>

		</table>
	</form>

</body>
</html>