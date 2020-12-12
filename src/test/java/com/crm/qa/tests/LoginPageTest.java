package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;


import com.crm.qa.base.Testbase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends Testbase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}

@BeforeMethod

public void setUp() {
	initialization();
	loginPage =new LoginPage();
}
@Test(priority=1)
public void loginPageTitleTest() {
	String title = loginPage.loginPageTitle();
	Assert.assertEquals(title, "Free CRM software helps any business large or small");
}

@Test(priority=2)
public void crmLogoTest() {
	boolean flag = loginPage.loginPageLogo();
	Assert.assertTrue(flag, "CRM Login logo displayed");
}

@Test(priority=3)
public void loginTest() {
	homePage =loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
}

@AfterMethod

public void tearDown() {
	driver.quit();
	}
}
