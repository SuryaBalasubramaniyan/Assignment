package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AbcServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Registration rg=new Registration();
		   if((rg. register(request.getParameter("name"), Integer.parseInt(request.getParameter("age")),request.getParameter("password"), request.getParameter("dept"), request.getParameter("designation"))==1)){
			   RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
			   request.setAttribute("check", 0);
		     	rd.forward(request, response);
		     	
		   }
		   if((rg.register(request.getParameter("name"), Integer.parseInt(request.getParameter("age")),request.getParameter("password"), request.getParameter("dept"), request.getParameter("designation"))==2)) {
			   RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
			   request.setAttribute("check", 1);
		       rd.forward(request, response); 
		     	
		   }
		   else {
			   RequestDispatcher rd= request.getRequestDispatcher("failure.jsp");
		     	rd.forward(request, response);
		}
	}
	

}
