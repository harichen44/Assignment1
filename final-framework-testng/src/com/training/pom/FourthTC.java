package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthTC {


private WebDriver driver; 
	
	public FourthTC(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='wp-menu-image dashicons-before dashicons-admin-multisite']")
	private WebElement properties; 
	
	@FindBy(name="post_title")
	private WebElement EnterTitle;
	
	
	@FindBy(id="content")
	private WebElement content; 
	
	@FindBy(id="_price")
	private WebElement price;
	
	@FindBy(id="_price_per")
	private WebElement pricepersqmt;
	
	@FindBy(xpath="//*[text()='Main Details']")
	private WebElement MainDetails;
	
	@FindBy(id="_status")
	private WebElement status;
	
	@FindBy(id="_location")
	private WebElement location;
	
	@FindBy(id="_possession")
	private WebElement posession;
	
	@FindBy(xpath="//*[@id=\'ui-id-3\']")
	private WebElement locationtab;
	
	
	@FindBy(id="_friendly_address")
	private WebElement address;
	
	@FindBy(id="_address")
	private WebElement gmap;
	
	@FindBy(id="_geolocation_lat")
	private WebElement lattitude;
	
	@FindBy(id="_geolocation_long")
	private WebElement longitude;
	
	@FindBy(xpath="//*[@id=\'ui-id-4\']")
	private WebElement detailstab;
	
	@FindBy(id="_storage_room")
	private WebElement storageroom;
	
	@FindBy(id="in-region-57")
	private WebElement centralbang;
	
	@FindBy(id="publish")
	private WebElement publish;
	
	public void properties() {
		Actions actions = new Actions(driver);
		actions.moveToElement(properties).build().perform();
		driver.findElement(By.xpath("//*[@id=\'menu-posts-property\']/ul/li[3]/a")).click();
		
	}
	public void allproperties() {
		this.properties.click();
		
	}
	public void enterTitle(String EnterTitle) {
		this.EnterTitle.clear();
		this.EnterTitle.sendKeys(EnterTitle);
	}
	
	public void Content(String content) {
		this.content.clear();
		this.content.sendKeys(content);
	}
	
	public void price(String price) {
		this.price.clear();
		this.price.sendKeys(price);
	}
	public void pricepersqmt(String pricepersqmt) {
		this.pricepersqmt.clear();
		this.pricepersqmt.sendKeys(pricepersqmt);
	}
	
	public void MainDetails() {
		this.MainDetails.click();
		
	}
	
	public void status(String status) {
		this.status.clear();
		this.status.sendKeys(status);
	}
	public void location(String location) {
		this.location.clear();
		this.location.sendKeys(location);
	}
	public void posession(String posession) {
		this.posession.clear();
		this.posession.sendKeys(posession);
	}
	
	public void locationtab() {
		this.locationtab.click();
		
	}
	
	public void address(String address) {
		this.address.clear();
		this.address.sendKeys(address);
	}
	
	public void gmap(String gmap) {
		this.gmap.clear();
		this.gmap.sendKeys(gmap);
	}
	
	
	public void lattitude(String lattitude) {
		this.lattitude.clear();
		this.lattitude.sendKeys(lattitude);
	}
	
	public void longitude(String longitude) {
		this.longitude.clear();
		this.longitude.sendKeys(longitude);
	}
	
	public void detailstab() {
		this.detailstab.click();
		
	}
	public void storageroom(String storage) {
		this.storageroom.clear();
		this.storageroom.sendKeys(storage);
	}
	public void centralbang() {
		this.centralbang.click();
		
	}
	public void publish() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		this.publish.click();
		
	}
	
	
	
}