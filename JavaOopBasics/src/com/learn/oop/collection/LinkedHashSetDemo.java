package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<String> laptops = new LinkedHashSet<>();
		laptops.add("hp");
		laptops.add("asus");
		laptops.add("lenovo");
		laptops.add("hp");
		laptops.add("hp");
		
		Iterator<String> its = laptops.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
			
		}
	}
}
