package com.learn.oop;

public class TV {
	
	String brand;
	String modelName;
	Integer screenSize;
	Integer price;
	String color;
	String displayType;
	
	void insertData(String b, String Mn, Integer ss, Integer p, String c, String dt) {
		brand = b;
		modelName = Mn;
		screenSize = ss;
		price = p;
		color = c;
		displayType = dt;
	}
	
	void displayTV() {
		System.out.println(brand + " "+ modelName + " " + screenSize);
	}
	
	public static void main(String[] args) {
		TV lgOled = new TV();
		TV SamsungFrame = new TV();
		
		lgOled.brand = "LG";
		lgOled.modelName="$K oled 75' tv";
		lgOled.screenSize=50;
		lgOled.price=100000;
		lgOled.color="black";
		lgOled.displayType="OLED";
		
		System.out.println(lgOled.brand + " " + lgOled.modelName+" "+ lgOled.screenSize);
		
		SamsungFrame.insertData("Samsung", "4K oled", 50, 15000, "black", "OLED");
		System.out.println(SamsungFrame.brand+ " " + SamsungFrame.modelName+" "+ SamsungFrame.screenSize);
		
		lgOled.displayTV();
		SamsungFrame.displayTV();
	}
}
