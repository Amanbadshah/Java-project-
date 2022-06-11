<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="background: black; color: white; padding: 20px;">This
		2page</h1>
	<h1 style="background: blue; color: red;">Usage of Directives
		tag....page Include</h1>
	<p>
		Current date is:<%=new Date().toString()%></p>
	<h1>Taglib tag</h1>
	<hr>
	<c:set var="name" value="SHAIKHAMAN"></c:set>
	<c:out value="${name }"></c:out>


</body>
</html>