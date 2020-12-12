package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class LoginPage extends Testbase{
	
	//Page Factory / Object Repository
	@FindBy(xpath="//img[@class ='img-responsive' and  @alt='Cogmento Free CRM']")
	WebElement logoLogin;
	
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	WebElement logInLink;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement logInButton;
	
	//initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String loginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean loginPageLogo() {
		return logoLogin.isDisplayed();
	}
	
	public HomePage login(String email_address, String pwd) {
		logInLink.click();
		email.sendKeys(email_address);
		password.sendKeys(pwd);
		 logInButton.click();
		 return new HomePage();
	}
	
}
	
