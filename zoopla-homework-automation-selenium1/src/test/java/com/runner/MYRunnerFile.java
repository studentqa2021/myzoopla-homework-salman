package com.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true, plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber.json", },

		features = { "./src/test/resources/Login.feature" }, glue = { "com.stepdefination" }, // package name
		monochrome = true
//		monochrome = true, dryRun = false, strict = true
//		 ,tags= {"@Function"}

)

public class MYRunnerFile extends AbstractTestNGCucumberTests {
	//WebDriver driver;
	@BeforeTest
	public void getsetup() {

	}

	@Test
	public void getlogin() {

	}

	@AfterTest
	public void teardown() {
//driver.quit();
	}
}
