package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> employee = new LinkedList<String>();
		employee.add("Giri");
		employee.add("Priya");
		employee.add("Ojas");
		
		employee.removeFirst();
		employee.removeLast();
		
		Iterator<String> itr = employee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
