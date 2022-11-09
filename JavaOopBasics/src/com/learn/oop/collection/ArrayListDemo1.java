package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> employee = new ArrayList<>();
		employee.add("Tushar");
		employee.add("Girish");
		employee.add("Nishant");
		employee.add("Girish");
		employee.add("Yogesh");
		
		Iterator itr = employee.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(ParticipantList);
	
	}
}
