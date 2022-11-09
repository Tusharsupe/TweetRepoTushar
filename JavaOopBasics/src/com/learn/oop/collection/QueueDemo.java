package com.learn.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> employee = new PriorityQueue<>();
		employee.add("Om");
		employee.add("Pratik");
		employee.add("Tushar");
		System.out.println("Sagar");
		
		System.out.println("Lead is "+ employee.peek());
		
		Iterator<String> its = employee.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
			
		}
		
	}
}
