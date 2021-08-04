package com.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserWithTestng {
@BeforeTest
public void setup() {
	
}
@Test
@Parameters("browser")
public void gettest(String browser) {
	new TestingCrossBrowser().getcross(browser);
}
@AfterTest
public void teardown() {
	
}
}
