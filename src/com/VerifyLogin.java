package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VerifyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public VerifyLogin() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("t1");
		String pass=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		//out.println("hello"+name);
		
		if(ValidateDetails.validate(name, pass)){  
	        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("signup.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	    }  
	

}
