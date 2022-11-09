package com.learn.oop.abstraction;

public class CSK extends IPL{

	@Override
	void play() {
		System.out.println("CSK is playing a good cricket in 2021 season");
		
	}
	
	public static void main(String[] args) {
		CSK obj = new CSK();
		obj.play();
	}

}
