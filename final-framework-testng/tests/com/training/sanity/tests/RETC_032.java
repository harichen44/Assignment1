package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.SecondTC;
import com.training.pom.SixthTC;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_032 {


	private WebDriver driver;
	private String baseUrl;
	private SecondTC SecondTC;
	private SixthTC SixthTC;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		SecondTC = new SecondTC(driver); 
		SixthTC = new SixthTC(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException, AWTException {

SixthTC.searchprop("Nullam hendrerit apartment");
SixthTC.sendname("selenium");
SixthTC.sendemail("selenium@email.com");
SixthTC.subject("apartmetn");
SixthTC.message("looking for apartment");
SixthTC.send();
Thread.sleep(15000);
		screenShot.captureScreenShot("%FIRSTSTEP");
		SixthTC.amount("40000");
		SixthTC.downpayment("2000");
		SixthTC.years("2");
		SixthTC.interest("5");
		SixthTC.calculate();	
		
		Thread.sleep(15000);
		screenShot.captureScreenShot("%FIRSTSTEP");
	}
}