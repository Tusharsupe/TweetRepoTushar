package com.learn.oop;

public class Sales extends Employee{
	 Integer Bonus = 10000;
	 Integer insentive;
	 
	 void Working() {
		 System.out.println("Employee is a part of sales team and they are working");
	 }
	 
	 public static void main(String[] args) {
		Sales Ashish = new Sales();
		Ashish.insentive = 2000;
		Ashish.TotalSalary(Ashish.baseSalary, Ashish.Bonus, Ashish.insentive);
		
		Ashish.Working();
	}
}
