package org.mohan;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String s = request.getParameter("uname");
		//writer.println("hai this is Second Servlet: " +s +" password is :" +p );
		if(s.equals("mohan")){
		RequestDispatcher rd=request.getRequestDispatcher("SimpleServletPath");  
	        rd.forward(request, response);  
	    }  
	    else{  
	        RequestDispatcher rd=request.getRequestDispatcher("/error.html");  
	        rd.forward(request, response);  
	                      
	        }  
		
	}
}
