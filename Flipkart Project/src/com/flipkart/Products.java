package com.flipkart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Products extends ConnectionDetails {

	Connection connection = null;
	PreparedStatement prepareStatement = null;

	public void insert() {

		try {

			String sql = "insert into products(Name,Price,Quantity,Description)"
					+ "Values ('refrigerator','55000','3','3 star refrigerator'), "
					+ "('home theatre','20000','5','black 5.1 chanel')," + "('printer','5000','2','HP'),"
					+ "('laptop','20000','3','vivobook')," + "('oven','15550','2','samsung 23l'),"
					+ "('chimney','1000','5','pollution control')," + "('headphone','1400','3','bluetooth headset'),"
					+ "('AC','100000','2','filter lens')," + "('fan','4500','4','decorative'),"
					+ "('camera','15500','3','dslr zoom lens')";

			Connection connection = getConnection();

			Statement statement = connection.createStatement();

			statement.executeUpdate(sql);

			System.out.println("Products inserted ");
			System.out.println("-------------------------------------");
		} catch (Exception e) {

			System.out.println(e);
		}

	}
}
