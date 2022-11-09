package com.learn.oop.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<String> cars = new TreeSet<>();
		cars.add("Honda");
		cars.add("Mercy");
		cars.add("BMW");
		
		Iterator<String> its = cars.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
			
		}
	}

}
