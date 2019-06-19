package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstTC {
	private WebDriver driver; 
	
	public FirstTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='sign-in']")
	private WebElement login; 
	@FindBy(xpath="//*[@id=\"post-133\"]/div/div/div/ul/li[2]/a")
	private WebElement Register;
	
	
	@FindBy(id="email")
	private WebElement email; 
	
	@FindBy(id="first-name")
	private WebElement firstName;
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	@FindBy(name="submit")
	private WebElement loginBtn; 
	
	
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendFirstName(String firstName) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName); 
	}
	public void sendLastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	
	public void login() {
		this.login.click();
	}
	public void Register() {
		this.Register.click();
	}
	public void clickLoginBgtn() {
		this.loginBtn.click(); 
	}
}

