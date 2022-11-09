package com.learn.oop.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> employees = new HashMap<>();
		employees.put(1, "Amit");
		employees.put(2, "Yogesh");
		employees.put(3, "Pratik");
		employees.put(4, "Tushar");
		
		System.out.println(employees);
		
		
	}
}
