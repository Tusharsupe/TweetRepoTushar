package com.tweet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnection {

	public Connection getConnectionDetails() {
		Connection connection = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweetapp","root", "pass@word1");
		}catch(Exception e) {
			System.out.println(e);
		}
		return connection;
		
	}
}
