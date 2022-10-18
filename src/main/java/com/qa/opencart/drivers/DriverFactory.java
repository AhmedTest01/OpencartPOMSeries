package com.qa.opencart.drivers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static  WebDriver driver;
	public static final Logger LOG = Logger.getLogger(DriverFactory.class);
	public WebDriver initBrowser(String browserName) {
		
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			LOG.info(browserName + " - launched sucessfully");
;		}
		else {
			LOG.error("Invalid browser name");
		}
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
		
	}
	
public static String getScreenshot() {
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(srcFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
		
	}

}
