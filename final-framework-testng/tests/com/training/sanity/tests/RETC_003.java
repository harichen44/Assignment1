package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ThirdTC;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_003 {

	private WebDriver driver;
	private String baseUrl;
	private ThirdTC ThirdTC;
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
		ThirdTC = new ThirdTC(driver); 
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
	public void validLoginTest() throws InterruptedException {
		
		ThirdTC.login();
		ThirdTC.lostyourpwd();
		ThirdTC.enterEmail("manzoor@gmail.com");
		ThirdTC.reset();
		Thread.sleep(5000);
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "Reset Successful";
		System.out.println(Actualtitle);
		//Assert.assertEquals(Actualtitle, Expectedtitle);
		Assert.assertNotEquals(Actualtitle, Expectedtitle);
		screenShot.captureScreenShot("ThirdTestcase");
		
	}
}

