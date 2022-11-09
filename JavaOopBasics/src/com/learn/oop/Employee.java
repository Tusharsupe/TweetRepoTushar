package com.learn.oop;

public class Employee {
	Integer baseSalary = 50000; //Parent
	
	void totalSalary(Integer BS,Integer Bonus) {
		Integer total = BS + Bonus;
		System.out.println(total);
	}
	
	void TotalSalary(Integer BS, Integer Bonus) {
		Integer total = BS+ Bonus;
		System.out.println(total);
	}
	
	void TotalSalary(Integer BS, Integer Bonus,Integer insentive) {
		Integer total = BS + Bonus + insentive ;
		System.out.println(total);
	}
	
	void Working() {
		System.out.println("Employee is working");
	}
}
