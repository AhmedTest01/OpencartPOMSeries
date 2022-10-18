package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	@BeforeClass
	public void navigateToLoginPage() {
		lp = ap.doNavigateToLogin();
	}
	
	@Test
	public void doLoginTest() {
		lp.doLogin("test1@test.com", "Test1234");
		Assert.assertEquals(lp.getCurrentURL(), "https://naveenautomationlabs.com/opencart/index.php?route=account/account");
	}
	
	

}
