package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> members = new HashSet<String>();
		members.add("Pratik");
		members.add("Tushar");
		members.add("peter");
		members.add("Tushar"); //this will not print
		
		Iterator<String> its =members.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
			
		}
	}
}
