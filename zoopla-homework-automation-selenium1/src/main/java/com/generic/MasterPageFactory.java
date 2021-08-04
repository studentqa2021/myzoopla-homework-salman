package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="(//*[contains(text(),'Accept all cookies')])[2]")
private List< WebElement >accept;

@FindBy(xpath="(//*[contains(@class,'css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0')])[4]")
private WebElement signin;

@FindBy(xpath="//*[contains(@name,'email')]")
private WebElement email;

@FindBy(xpath="//*[contains(@name,'password')]")
private WebElement password;

@FindBy(xpath="(//*[contains(text(),'Sign in')])[10]")
private WebElement login;

@FindBy(xpath="(//*[contains(@class,'css-18ufi8 e1niaah3')])[1]")
private WebElement myzoopla;

@FindBy(xpath="(//*[contains(@class,'esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0')])[5]")
private WebElement logout;

//@FindBy(xpath="(//*[contains(@class,'esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0')])[5

public List< WebElement> getAccept() {
	return accept;
}

public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getMyzoopla() {
	return myzoopla;
}

public WebElement getLogout() {
	return logout;
}


}
