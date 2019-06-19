package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdTC {
	
private WebDriver driver; 
	
	public ThirdTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='sign-in']")
	private WebElement login; 
	
	@FindBy(xpath="//*[text()=' Lost Your Password?']")
	private WebElement Lostyourpassword;
	
	
	@FindBy(id="user_login")
	private WebElement emailaddress; 
	
	
	@FindBy(name="submit")
	private WebElement Resetpassword; 
	
	
	public void login() {
		this.login.click();
	}
	
	public void lostyourpwd() {
		this.Lostyourpassword.click();
	}
	
	public void enterEmail(String email) {
		this.emailaddress.clear();
		this.emailaddress.sendKeys(email);
	}
	
	public void reset() {
		this.Resetpassword.click();
	}

}
