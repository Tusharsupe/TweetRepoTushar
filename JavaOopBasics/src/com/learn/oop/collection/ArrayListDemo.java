package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> ParticipantList = new ArrayList<>();
		ParticipantList.add("Tushar");
		ParticipantList.add("Pratik");
		ParticipantList.add("Prajwal");
		ParticipantList.add("Prashant");
		ParticipantList.add("Yogesh");
		
		Iterator itr = ParticipantList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(ParticipantList);
	}
}
