package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsSearchResultPage {
	WebDriver driver;

	public GoodreadsSearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//div[@id='1_book_69571']/child::div/child::form/child::button[@class='wtrToRead']")
	private WebElement WantToRead;

	public WebElement getWantToRead() {
		return WantToRead;
	}
	
}
