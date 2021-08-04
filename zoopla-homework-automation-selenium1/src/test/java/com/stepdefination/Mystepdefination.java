package com.stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.Baselogin;
import com.generic.Drivermanager;
import com.generic.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mystepdefination {
	WebDriver driver;
	MasterPageFactory obj;
@Given("open browser and send URL")
public void getsetup() {
	driver = new Drivermanager().getdriver();
}
@When("lolgin with valid credentials")
public void getlogin() {
 obj=new Baselogin().getlogin(driver);
}
@Then("Check login was success")
public void getvalidation() {
	Assert.assertTrue(obj.getLogout().isDisplayed(),"login passed");
	driver.quit();
}
}
