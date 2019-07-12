package com;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateDetails {
	public static boolean validate(String name,String password) {
		boolean status=false;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/db","root","Sapient123");
			//Statement stmt=conn.createStatement();
			PreparedStatement ps=conn.prepareStatement("select name,password from details where name=? and password=?");  
					ps.setString(1,name);  
					ps.setString(2,password);  
					      
					ResultSet rs=ps.executeQuery();  
					while (rs.next()) {
						System.out.println("Account match");
					status=true;
					}
					System.out.println("Invalid");
					return status; 
					          
			
			
		}catch(Exception e) {
			System.out.println(e);
			return status;
		}
		
}
}
