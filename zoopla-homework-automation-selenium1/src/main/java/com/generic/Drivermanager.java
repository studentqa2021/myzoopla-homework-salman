package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class Drivermanager {
	public WebDriver getdriver(){
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(BaseConfig.getconfig("QA_URL"));
		driver.manage().window().maximize();
		
		return driver;
	}
	
}
