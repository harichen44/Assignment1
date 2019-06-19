package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondTC {

private WebDriver driver; 
	
	public SecondTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='sign-in']")
	private WebElement login; 
	
	@FindBy(name="login")
	private WebElement Signin;
	
	
	@FindBy(id="user_login")
	private WebElement userlogin; 
	
	@FindBy(id="user_pass")
	private WebElement userpass;
	
	public void signin() {
		this.login.click();
	}
	public void sendUsername(String userlogin) {
		this.userlogin.clear();
		this.userlogin.sendKeys(userlogin);
	}
	public void sendPassword(String userpass) {
		this.userpass.clear();
		this.userpass.sendKeys(userpass);
	}
	public void login()
	{
		this.Signin.click();
	}
	
	
}
