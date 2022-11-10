package com.tweet;

public class TweetMain {

	public static void main(String[] args) {
		try {
		User_Registration userReistration = new User_Registration();
		userReistration.insertUserData();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
