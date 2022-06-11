<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Wolrd</h1>
<%!
int a =10;
int b=20;
String name="Aman";
public int doSum(){
	return a+b;
}
public String revers(){
	StringBuffer bf=new StringBuffer(name);
	return bf.reverse().toString();
}

%>
<%
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println("The total "+doSum());
out.println("<br>");
out.println(revers());
%>

<h1>Sum is:<%=doSum() %></h1>
<h1><%=a %></h1>
<%=name %>
</body>
</html>