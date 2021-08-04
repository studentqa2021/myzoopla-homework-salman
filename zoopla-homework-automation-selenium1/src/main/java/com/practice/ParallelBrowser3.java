package com.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelBrowser3 {
	@BeforeTest
	public void setup() {
		
	}
	@Test()
		public void gettest() {
		new TestingCrossBrowser().getcross("chrome");
	}
	@AfterTest
	public void teardown() {
		
	}
}
