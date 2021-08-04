package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.Baselogin;
import com.generic.Drivermanager;
import com.generic.MasterPageFactory;

public class SmokeTest {
	ExtentTest test;
	ExtentReports extent;
	WebDriver driver;

	@BeforeTest
	public void setup() {
		ExtentSparkReporter repoter = new ExtentSparkReporter("target/ExtendsTestNGReport.html");
		repoter.config().setDocumentTitle("Automation Selenium");
		repoter.config().setReportName("Regression Test");
		repoter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));

	}

	@Test
	public void logintest() {
		test = extent.createTest("Smoke");
		driver = new Drivermanager().getdriver();
		MasterPageFactory obj=new Baselogin().getlogin(driver);
		Assert.assertTrue(obj.getLogout().isDisplayed(),"login passed");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		extent.flush();
	}

}
