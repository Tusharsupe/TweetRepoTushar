package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {
	
	Calculator calc;
	
//	@BeforeEach
//	public void init() {
//		calc = new Calculator();
//		System.out.println("The before each method is being called right now");
//	}
//	
//	@AfterEach
//	public void after() {
//		System.out.println("After each test case");
//	}
	
	@org.junit.jupiter.api.AfterAll
	public void AfterAll() {
		System.out.println("After each test case");
	}
	
	@Test
	@DisplayName("Adding two positive numbers")
	public void testAddMethod() {
		
		int sum = calc.add(10, 100);
		assertEquals(110, sum);
		System.out.println("The total is "+ sum);
	}
	
	@Test
	@DisplayName("substracting two numbers")
	public void testSubMethod() {
		
		int total = calc.sub(10, 100);
		assertEquals(-90, total);
		System.out.println("The substraction value is "+ total);
	}
	
	@Test
	@DisplayName("multiplying two positive numbers")
	public void testProductMethod() {
		
		int sum = calc.product(5, 100);
		assertEquals(500, sum);
		System.out.println("The total value is "+ sum);
	}
}
