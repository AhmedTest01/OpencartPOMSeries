package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class LoginPage {

	private WebDriver driver;
	public static final Logger LOG = Logger.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		}
	
	By returningUserText = By.xpath("//h2[text() = 'Returning Customer']");
	
	By emailTextBox = By.id("input-email");
	By passwordTextBox = By.id("input-password");
	By loginBtn = By.xpath("//input[@value = 'Login']");
	
	
	public String getReturningUserText() {
		return driver.findElement(returningUserText).getText();
		}
	
	public void doEnterEmail(String email) {
		driver.findElement(emailTextBox).sendKeys(email);
		LOG.info("Entered email :" + email);
	}
	
	public void doEnterPassword( String password) {
		driver.findElement(passwordTextBox).sendKeys(password);
		LOG.info("Entered password :" + password);
	}
	
	public void doClickOnLogin() {
		driver.findElement(loginBtn).click();
		LOG.info("Clicked on Login button");
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void doLogin(String email, String password) {
		doEnterEmail(email);
		doEnterPassword(password);
		doClickOnLogin();
		
		
	}

}
