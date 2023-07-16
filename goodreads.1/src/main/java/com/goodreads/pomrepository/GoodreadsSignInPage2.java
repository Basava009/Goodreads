package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsSignInPage2 {
	WebDriver driver;

	public GoodreadsSignInPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div/child::input[@id='ap_email']")
	private WebElement EmailTextField;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement PasswordTextField;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement SignInsubmit;

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getSignInsubmit() {
		return SignInsubmit;
	}
	
	
}
