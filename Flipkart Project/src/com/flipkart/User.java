package com.flipkart;

import java.sql.*;
import java.util.*;

public class User extends ConnectionDetails  {

	Scanner scanner=new Scanner(System.in);
	String name,mobile,email,password=null;
	String emailFormat="@gmail.com";
	
	public void register(String name,String mobile,String email, String password  ) {
		
		  try {
		      
			  Connection connection = getConnection();
		      
    //Step - 3 : Prepare Statement
		      
	PreparedStatement prepareStatement = connection.prepareStatement("insert into users "+
		                    "(name,mobile,email,password)values(?,?,?,?)");
	
	         prepareStatement.setString(1, name);
	         prepareStatement.setString(2, mobile);
	         prepareStatement.setString(3, email);
	         prepareStatement.setString(4, password);
		      
	//Step -4: Execute Prepare statement
	
	                     prepareStatement.executeUpdate();
	                    
	         System.out.println("Data added successfully ");           
     
	                   
		        }catch(Exception e) {
		    	 
		    	 System.out.println(e);
		        
		    }
	
	}
	
	public void getUserInput() {
		
		System.out.println("Enter Details of Registration ");
		
		
			System.out.println("Enter name");
			name = scanner.nextLine();
			System.out.println("----------------");
			System.out.println("Enter Mobile number");
			mobile = scanner.nextLine();
			System.out.println("----------------");
            System.out.println("Enter email id");
			email=scanner.nextLine();
			System.out.println("----------------");
            System.out.println("Enter Password");
			password=scanner.nextLine();
			System.out.println("----------------");

			if((email.endsWith(emailFormat)) && (mobile.length()==10)){
				
              register(name,mobile,email,password);
				
			}else {
				
				System.err.println("please ente valid details ");
			    getUserInput();
			}
		
		
	 }
	
}

