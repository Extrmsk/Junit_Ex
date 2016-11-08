package com.lemanov.calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCalc {

	private Calc calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}


	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		
		calc = new Calc();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd");
		assertEquals(7, calc.add(5, 2));
	}

	@Test
	public void testDiv() { 
		System.out.println("testDiv");
		assertEquals(2, calc.div(10, 5));
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDiv2() {
		calc.div(2, 0);
	}

}
