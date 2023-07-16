package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsHomePageBody {
	WebDriver driver;

	public GoodreadsHomePageBody(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =  "//input[@class='searchBox__input searchBox__input--navbar']")
	private WebElement SearchBooks;
	
	@FindBy(xpath =  "//button[@class='searchBox__icon--magnifyingGlass gr-iconButton searchBox__icon searchBox__icon--navbar']")
	private WebElement SearchSymbol;

	public WebElement getSearchBooks() {
		return SearchBooks;
	}

	public WebElement getSearchSymbol() {
		return SearchSymbol;
	}

}
