package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTestSample {

	//junit will run this code after CalculatorTest is loaded
	//called only once
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("called once when CalculatorTest is loaded...");
		//connection factory
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("called before each test case....");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("called after each test case....");
	}

	//junit will run this code once CalculatorTest is finished...
	//called only once
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("called once when CalculatorTest is done...");
		//conn factory close
	}

	

}
