package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{

	// Page Factory or Object Repository
	
	// By using below syntax there is no need to write find element by id and then give the id
	// Below code simplifies all the process
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(id="signInSubmit")
	WebElement signinButton;
	
	@FindBy(id="createAccountSubmit")
	WebElement createAccount;
	
	@FindBy(xpath="//*[@id='a-page']/div[1]/div[1]/div/a/i")
	WebElement amazonLogo;
	
	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean validateAmazonImage() {
	return amazonLogo.isDisplayed();
}

public HomePage login(String un, String pwd) {
	email.sendKeys(un);
	password.sendKeys(pwd);
	
	
	signinButton.click();
	
	return new HomePage();
}




}
