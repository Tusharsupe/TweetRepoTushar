package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.student.Student;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit a student");
			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				//add student
				System.out.println("Enter Students Full name:");
				String name = br.readLine();
				
				System.out.println("Enter student's phone number :");
				String phone = br.readLine();
				
				System.out.println("Enter student's city number: ");
				String city = br.readLine();
				
				Student st = new Student(name,phone,city);
				System.out.println(st);
			}
			else if (choice == 2) {
				//delete student
			}
			else if (choice == 3) {
				//display student
			}
			else if (choice == 4) {
				//exit menu
			}else {
				
			}
			System.out.println("Thanks for using student management system ");
		}
	}
}
