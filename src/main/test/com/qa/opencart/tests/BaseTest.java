package com.qa.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.drivers.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	WebDriver driver;
	DriverFactory df;
	AccountPage ap;
	LoginPage lp;
	
	@BeforeTest
	public void launchBrowser() {
		
		df = new DriverFactory();
		driver = df.initBrowser("chrome");
		ap = new AccountPage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
