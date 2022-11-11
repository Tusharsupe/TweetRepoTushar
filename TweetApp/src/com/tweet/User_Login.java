package com.tweet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class User_Login {

	Connection connection = null;

	public void userLogin(Object email, Object regiPassword) throws SQLException {

		try {

			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter your login details: ");
			System.out.println();

			System.out.println("Enter your user email");
			String userEmail = scanner.next();

			System.out.println("Enter password");
			String password = scanner.next();

			DataConnection user_Login = new DataConnection();
			connection = user_Login.getConnectionDetails();

			PreparedStatement psLogin = connection.prepareStatement("insert into login(uemail,upassword) values(?,?)");
			psLogin.setString(1, userEmail);
			psLogin.setString(2, password);

			psLogin.executeUpdate();

			PreparedStatement ps = connection.prepareStatement("select * from login");
			ResultSet rs = ps.executeQuery();

			if ((email.equals(userEmail)) && (regiPassword.equals(password))) {

				System.out.println("Log in successful...");
				System.out.println();
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------");

				PostTweet postTweet = new PostTweet();
				postTweet.postTweet();
			} else {
				System.out.println("You entered wrong username or password");
				System.out.println("Login again carefully");
				User_Login user_LoginAgain = new User_Login();
				user_LoginAgain.userLogin(email, regiPassword);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
