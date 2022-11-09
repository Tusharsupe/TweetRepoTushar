package com.learn.oop.abstraction;

public class TusharTech implements ITCompanies{

	@Override
	public void Working() {
		System.out.println("Tushar tech is working in a java project");
		
	}
	
	public static void main(String[] args) {
		TusharTech SMS = new TusharTech();
		SMS.Working();
	}
}
