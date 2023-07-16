package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsHomePage {
	WebDriver driver;

	public GoodreadsHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement SigninOption;

	public WebElement getSigninOption() {
		return SigninOption;
	}
}
