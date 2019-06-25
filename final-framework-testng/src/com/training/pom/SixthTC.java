package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthTC {

private WebDriver driver; 
	
	public SixthTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\'ajaxsearchlite1\']/div/div[3]/form/input[1]")
	private WebElement searchprop; 
	
	@FindBy(name="your-name")
	private WebElement name;
	
	
	@FindBy(name="your-email")
	private WebElement email; 
	
	@FindBy(name="your-subject")
	private WebElement subject;
	
	@FindBy(name="your-message")
	private WebElement message;
	
	@FindBy(xpath="//*[@id=\'wpcf7-f4-o1\']/form/p[5]/input")
	private WebElement send;
	
	@FindBy(id="amount")
	private WebElement amount;
	
	@FindBy(id="downpayment")
	private WebElement downpayment;
	
	@FindBy(id="years")
	private WebElement years;
	
	
	@FindBy(id="interest")
	private WebElement interest;
	

	@FindBy(xpath="//*[@class='button calc-button']")
	private WebElement calculate;
	
	
	
	
	
	public void send() {
		this.send.click();
	}
	public void sendname(String name) {
		this.name.clear();
		this.name.sendKeys(name);
	}
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	public void subject(String subject) {
		this.subject.clear();
		this.subject.sendKeys(subject);
	}
	public void message(String message) {
		this.message.clear();
		this.message.sendKeys(message);
	}
	public void searchprop(String search) throws AWTException, InterruptedException {
		this.searchprop.clear();
		this.searchprop.sendKeys(search);
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Number of Tabs are " + tabs.size());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle()); 
		Thread.sleep(2000);
		
		
	}
	
	public void amount(String amount) {
		this.amount.clear();
		this.amount.sendKeys(amount);
	}
	
	public void downpayment(String down) {
		this.downpayment.clear();
		this.downpayment.sendKeys(down);
	}
	public void interest(String subject) {
		this.interest.clear();
		this.interest.sendKeys(subject);
	}
	public void years(String years) {
		this.years.clear();
		this.years.sendKeys(years);
	}
	public void calculate() {
		this.calculate.click();
	}
	
}