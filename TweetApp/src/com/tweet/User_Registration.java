package com.tweet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class User_Registration {

	Connection connection = null;
	PreparedStatement ps = null;
	String firstName;

	public void insertUserData() throws Exception {
		System.out.println(
				"*****************************************************Welcome To Tweet App****************************************************");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 for registration process :");
		int choice = scanner.nextInt();
		String email = null;
		String regiPassword = null;
		System.out.println(
				"--------------------------------------------------------------------------------------------");

		if (choice == 1) {
			System.out.println("Enter your registration details: ");
			System.out.println();
			System.out.println("Enter your first name: ");
			firstName = scanner.next();

			System.out.println("Enter your email address: ");
			email = scanner.next();

			System.out.println("Enter the password: ");
			regiPassword = scanner.next();

			try {

				DataConnection user_Register = new DataConnection();
				connection = user_Register.getConnectionDetails();
				ps = connection.prepareStatement("insert into registration(firstname,email,password)values(?,?,?)");

				ps.setString(1, firstName);

				ps.setString(2, email);

				ps.setString(3, regiPassword);

				int i = ps.executeUpdate();
				System.out.println("User registered successfully...");
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			}

			User_Login uLogin = new User_Login();
			uLogin.userLogin(email, regiPassword);
		}
	}

}
