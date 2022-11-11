package com.tweet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ForgetPassword {

	public void forgetPassword(String Useremail, String userPassword) {
		DataConnection forgetpass = new DataConnection();
		Connection connection = forgetpass.getConnectionDetails();
		try {
			String Query = ("update login set upassword = ? where uemail = ?");
			PreparedStatement ps1 = connection.prepareStatement(Query);
			ps1.setString(1, userPassword);
			ps1.setString(2, Useremail);

			ps1.executeUpdate();
			System.out.println("password updated successfully...");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
