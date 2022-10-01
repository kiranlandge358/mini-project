package com.flipkart;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDetails {

	public Connection getConnection() {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "Chinku@358");

		} catch (Exception e) {

			System.out.println(e);
		}

		return conn;
	}

}
