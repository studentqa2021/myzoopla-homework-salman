package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class Baselogin {

public   MasterPageFactory getlogin(WebDriver driver){
	MasterPageFactory obj=new MasterPageFactory(driver);
	ScreenShot.getscreen(driver, "first page");
if(obj.getAccept().size()>0) {
	HighLighter.addcolor(driver, obj.getAccept().get(0));
	obj.getAccept().get(0).click();;
}
	ScreenShot.getscreen(driver, "signin page");
	HighLighter.addcolor(driver, obj.getSignin());
	obj.getSignin().click();
	HighLighter.addcolor(driver, obj.getEmail());
	obj.getEmail().sendKeys(BaseConfig.getconfig("user"));
	ScreenShot.getscreen(driver, "email filed");
	HighLighter.addcolor(driver,obj.getPassword());
	obj.getPassword().sendKeys(BaseConfig.getconfig("password"));
	HighLighter.addcolor(driver,obj.getLogin());
	obj.getLogin().click();
	//;
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
	Actions ac=new Actions(driver) ;
	ScreenShot.getscreen(driver, "myzoopla home page");
	HighLighter.addcolor(driver,obj.getMyzoopla());
	ac.moveToElement(obj.getMyzoopla()).build().perform();
		
	

	
//	if(obj.getLogout().isDisplayed()) {
//		ScreenShot.getscreen(driver, "sign out");
//		HighLighter.addcolor(driver,obj.getLogout());
//		System.out.println("login passed");
//		
//		
//	}else {
//		System.out.println("login failed");
//	}
return obj;
}
}
