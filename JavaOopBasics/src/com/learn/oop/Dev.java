package com.learn.oop;

public class Dev extends Employee{
	Integer Bonus = 25000;
	Integer total = Bonus + baseSalary;
	
	public static void main(String[] args) {
		
		Dev Tushar = new Dev();
		System.out.println("Total salary of Tushar is "+ Tushar.total);
	}
}
