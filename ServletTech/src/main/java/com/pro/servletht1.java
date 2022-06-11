package com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletht1  extends HttpServlet{
public void doGet(HttpServletRequest rs,HttpServletResponse res)throws IOException{
System.out.println("This is HttpServlet:");
res.setContentType("text/html");
PrintWriter hs=res.getWriter();
hs.print("<h1>  Hello Http Servlet</h1>");
}
}
