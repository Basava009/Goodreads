package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsSignInPage {
	WebDriver driver;

	public GoodreadsSignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div/child::a[4]/child::button[text()]")
	private WebElement SignInWithEmailOption;

	public WebElement getSignInWithEmailOption() {
		return SignInWithEmailOption;
	}
	

}
