package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.drivers.DriverFactory;

public class AccountPage extends DriverFactory {
	private WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 By myAccountLink = By.cssSelector("a.dropdown-toggle span.hidden-xs");
	 By loginLink = By.linkText("Login");
	 
	 
	 public void doClickAccountLink() {
		 driver.findElement(myAccountLink).click();
		 }
	 
	 public void doClickLoginBtn() {
		
		 driver.findElement(loginLink).click();
		 
	 }
	 
	 public LoginPage doNavigateToLogin() {
		 doClickAccountLink();
		 doClickLoginBtn();
		 return new LoginPage(driver);
		 
		 
	 }


}
