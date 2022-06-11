package Demourl.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myservlet
 */

public class myservlet extends HttpServlet {
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
		
		String name=request.getParameter("user_name");
	out.println("<h1>Your name is:"+name+"</h1>");
	//out.println("<a href='servlet2?user="+name+"'>Go to second page</a>");
	//hidden form
	out.println(""
			+ "<form action='servlet2'>"
			+ "<input type='hidden' name='user_name' value='"+name+"'/>"
			+ "<button>Go to Second Servlet</button>"
			+ ""
			+ ""
			+ ""
			+ "</form>");
		
	}

}
