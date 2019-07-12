package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Registration {
	
<<<<<<< HEAD
//int count;
=======
int count;
>>>>>>> 020658676271ad4cf7d9c17c80c411305f3d4642
	public int register(String name, int age, String password, String dept, String designation) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost/db","root","Sapient123");  
			ValidateDetails val=new ValidateDetails();
<<<<<<< HEAD
			if ((val.validate(name, password))!=true) 
=======
			if (val.validate(name, password)!=true) 
>>>>>>> 020658676271ad4cf7d9c17c80c411305f3d4642
			{PreparedStatement ps1 = con.prepareStatement("insert into details values(?,?,?,?,?)");

			ps1.setString(1, name);
			ps1.setInt(2, age);
			ps1.setString(3, password);
			ps1.setString(4, dept);
			ps1.setString(5, designation);

			int i = ps1.executeUpdate();
			if (i>0) 
			{
				System.out.println("You are successfully registered...");
				return 1;
			}
			else
			{
				return 3;
			}
		} 
		else 
		{
			System.out.println("Account already exists");
			return 2;
		}
			          
			}catch (Exception e2) {System.out.println(e2);
			return 3;}  
			          
			  
			}  

}
