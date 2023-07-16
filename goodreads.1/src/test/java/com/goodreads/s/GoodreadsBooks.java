package com.goodreads.s;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.goodreads.genericutility.BaseClass;
import com.goodreads.pomrepository.GoodreadsHomePage;
import com.goodreads.pomrepository.GoodreadsHomePageBody;
import com.goodreads.pomrepository.GoodreadsMyBooksPage;
import com.goodreads.pomrepository.GoodreadsSearchResultPage;
import com.goodreads.pomrepository.GoodreadsSignInPage;
import com.goodreads.pomrepository.GoodreadsSignInPage2;

public class GoodreadsBooks extends BaseClass {
	@Test
	public void Basava() throws IOException, Throwable {
		// click on sign in
		webdriverUtils.implicitWait(driver);
		GoodreadsHomePage homePage = new GoodreadsHomePage(driver);
		homePage.getSigninOption().click();
		// click on sign in with email
		GoodreadsSignInPage signinpage1 = new GoodreadsSignInPage(driver);
		signinpage1.getSignInWithEmailOption().click();
		// Enter the mailid
		GoodreadsSignInPage2 signinpage2 = new GoodreadsSignInPage2(driver);
		signinpage2.getEmailTextField().sendKeys(fileUtils.readCommonData("username"));
		signinpage2.getEmailTextField().sendKeys(Keys.TAB);
		signinpage2.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		signinpage2.getSignInsubmit().click();

		// optional use when important message page get displayed
		// signinpage2.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		// signinpage2.getPasswordTextField().sendKeys(Keys.TAB.TAB.TAB);
		// Thread.sleep(10000);
		// signinpage2.getSignInsubmit().click();

		// Search books
		GoodreadsHomePageBody HomePageBody = new GoodreadsHomePageBody(driver);
		HomePageBody.getSearchBooks().click();
		HomePageBody.getSearchBooks().sendKeys(fileUtils.readCommonData("bookname"));
		HomePageBody.getSearchSymbol().click();
		// Search result
		GoodreadsSearchResultPage resultpage = new GoodreadsSearchResultPage(driver);
		resultpage.getWantToRead().click();
		// Mybooks
		GoodreadsMyBooksPage MyBooksOption = new GoodreadsMyBooksPage(driver);
		MyBooksOption.getMyBooks().click();
		// gridview
		MyBooksOption.getGridView().click();
		Actions actions = new Actions(driver);
		actions.moveToElement(MyBooksOption.getMousePointer()).build().perform();
		// editoption
		MyBooksOption.getEditOption().click();
		// remove book
		MyBooksOption.getRemoveFromMyBooksOption().click();
		// handling alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		// profilemenu
		MyBooksOption.getProfileMenuOption().click();
		// scroll to element
		actions.scrollToElement(MyBooksOption.getProfileMenuOption()).perform();
		// signout
		MyBooksOption.getSignOutOption().click();

	}
}