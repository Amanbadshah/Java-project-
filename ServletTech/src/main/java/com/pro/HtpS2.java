package com.pro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HtpS2 extends HttpServlet {
	public void doGet(HttpServletRequest ret,HttpServletResponse rsp)throws IOException{
		rsp.setContentType("text/html");
		PrintWriter htps=rsp.getWriter();
		htps.print("<h1>This MY Second HttpServlet Demo2</h1>");
		htps.print("<b>This HttpServlet Its only doGet SetGEt</b>");
		htps.print(new Date().toString());
		
	}

}
