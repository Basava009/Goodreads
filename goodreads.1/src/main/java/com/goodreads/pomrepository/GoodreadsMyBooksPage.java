package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsMyBooksPage {
	WebDriver driver;

	public GoodreadsMyBooksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div/a[@class='actionLinkLite editLink']")
	private WebElement EditOption;

	@FindBy(xpath = "//a[@class='right actionLink greyText reviewLightboxDeleteKCW2853']")
	private WebElement RemoveFromMyBooksOption;

	@FindBy(xpath = "//div[@class='dropdown dropdown--profileMenu']")
	private WebElement ProfileMenuOption;

	@FindBy(xpath = "//div[@class='siteHeader__subNav siteHeader__subNav--profile gr-box gr-box--withShadowLarge']/child::ul/child::li[@role='menuitem Sign out']/a")
	private WebElement SignOutOption;

	// @FindBy(xpath ="//li/a[text()='My Books' and
	// @data-reactid='.1kuiqm27zc8.1.0.2.0.1.0']")
	@FindBy(xpath = "//a[contains(@data-reactid,'1.0.2.0.1.0')]")
	private WebElement MyBooks;

	@FindBy(xpath = "//a[@class='gridViewIcon selected']/img")
	private WebElement GridView;

	@FindBy(xpath = "//a/img[@alt='Rich Dad, Poor Dad']")
	private WebElement MousePointer;

	public WebElement getMousePointer() {
		return MousePointer;
	}

	public WebElement getEditOption() {
		return EditOption;
	}

	public WebElement getRemoveFromMyBooksOption() {
		return RemoveFromMyBooksOption;
	}

	public WebElement getProfileMenuOption() {
		return ProfileMenuOption;
	}

	public WebElement getSignOutOption() {
		return SignOutOption;
	}

	public WebElement getMyBooks() {
		return MyBooks;

	}

	public WebElement getGridView() {
		return GridView;
	}

}
