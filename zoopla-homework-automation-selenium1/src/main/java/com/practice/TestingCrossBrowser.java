package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestingCrossBrowser {
public void getcross(String browser){
	
	
	if(browser.equalsIgnoreCase("chrome")) {System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	System.out.println("open browser="+browser);
	driver.quit();
	}

	else if(browser.equalsIgnoreCase("ie")) {System.setProperty("webdriver.ie.driver","./Driver/IEDriverServer.exe");
WebDriver driver1 = new InternetExplorerDriver();
driver1.navigate().to("https://www.amazon.com");
System.out.println("open browser="+browser);
driver1.quit();
}

	else if(browser.equalsIgnoreCase("safari")) {
	System.out.println("open browser="+browser);
}else {
	System.out.println("not found browser");
}
}
public static void main(String[] args) {
	new TestingCrossBrowser().getcross("chrome");
	new TestingCrossBrowser().getcross("ie");
}
}
