package com.learn.oop;

public class HR extends Employee{
	Integer Bonus = 20000;
	Integer total = Bonus + baseSalary;
	
	public static void main(String[] args) {
		HR Anisha = new HR();
		//System.out.println("Anisha's total salary is "+ Anisha.total);
		Anisha.totalSalary(Anisha.baseSalary, Anisha.Bonus);
	}
}
