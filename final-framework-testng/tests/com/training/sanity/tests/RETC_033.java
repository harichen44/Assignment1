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
import com.training.pom.FourthTC;
import com.training.pom.SecondTC;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_033 {
	private WebDriver driver;
	private String baseUrl;
	private SecondTC SecondTC;
	private FourthTC FourthTC;
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
		FourthTC = new FourthTC(driver); 
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
		SecondTC.signin();
		SecondTC.sendUsername("admin");
		SecondTC.sendPassword("adminuser@12345");
		SecondTC.login();
		Thread.sleep(5000);
		screenShot.captureScreenShot("6TCLogin");
		FourthTC.properties();
		FourthTC.enterTitle("new launch");
		FourthTC.Content("new launch");
		Thread.sleep(5000);
		FourthTC.publish();
		Thread.sleep(15000);
		FourthTC.allproperties();
		Thread.sleep(10000);
		screenShot.captureScreenShot("6TCPASS");
		
	}
}
  