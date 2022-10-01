package com.flipkart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sort extends ConnectionDetails {
	
	public void getSorted() {
	
		try {
			   
		
	 Connection connection = getConnection();
		         
		 
		   
     PreparedStatement prepareStatement = connection.prepareStatement(" Select Name "
				                    + "from products order by Name ");   
		    
           
     
     ResultSet rs = prepareStatement.executeQuery();
	
     System.out.println("Displaying Sorted product list ");
	 System.out.println("---------------------------------");

     Thread.sleep(1200);
     
	 while(rs.next()) {	
		 
		 System.out.println(rs.getString(1));
		 Thread.sleep(1200);
		
	 }
     
	}catch(Exception e) { 
			 
		System.out.println(e);
			   
		}
	}
	
		
}

