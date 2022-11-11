package com.tweet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PostTweet {

	public void postTweet() throws IOException {

		String tweet;
		Connection connection = null;
		PreparedStatement ps = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("press 1 to Post Tweet");
			
			System.out.println("press 2 to View All Tweet");
			System.out.println("press 3 to view all users");
			System.out.println("press 4 to reset Password");
			System.out.println("press 5 to logout");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {

				System.out.println("Enter your registration details: ");
				System.out.println();
				System.out.println("Enter your user name: ");
				String uName = br.readLine();
				System.out.println("Write your tweet: ");
				// tweet = scanner.nextLine();
				tweet = br.readLine();

				try {

					DataConnection postTweet = new DataConnection();
					connection = postTweet.getConnectionDetails();

					ps = connection.prepareStatement("insert into tweetpost(username,tweetpost)values(?,?)");

					ps.setString(1, uName);
					ps.setString(2, tweet);

					int i = ps.executeUpdate();
					System.out.println("tweet post successfully...");
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (choice == 2) {
				// View All tweets
				try {

					DataConnection postTweet = new DataConnection();
					connection = postTweet.getConnectionDetails();
					String Query1 = "select * from tweetpost";
					ps = connection.prepareStatement("Query1");

					ResultSet set = ps.executeQuery(Query1);

					while (set.next()) {

						int tweetid = set.getInt(1);
						String tweet2 = set.getString(2);

						System.out.println("Tweet:" + tweetid + " : " + tweet2);
						System.out.println(
								"------------------------------------------------------------------------------------------------------------------------------");
					}

				} catch (Exception e) {
				}

			} else if (choice == 3) {

				try {

					DataConnection conAllUsers = new DataConnection();
					connection = conAllUsers.getConnectionDetails();
					String Query2 = "select firstname from registration";
					ps = connection.prepareStatement("Query2");

					ResultSet set = ps.executeQuery(Query2);

					while (set.next()) {
						String name = set.getString(1);
						System.out.println("User Name:" + name);
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------------------------------");
					}

				} catch (Exception e) {
				}

			}

			if (choice == 4) {

				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your email id: ");
				String email = scanner.next();
				System.out.println("Enter password: ");
				String pass = scanner.next();

				ForgetPassword forgetPass = new ForgetPassword();
				forgetPass.forgetPassword(email, pass);

			}

			if (choice == 5) {

				System.out.println("Thank you for using");
				System.exit(0);
			} else {
				System.out.println();
			}

			System.out.println("thanks for using our management system");
		}
	}
}
