package com.goodreads.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public boolean verifyCompleteTitle(WebDriver driver, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean result=wait.until(ExpectedConditions.titleIs(expectedTitle));
		return result;
	}
	public boolean verifyPartialTitle(WebDriver driver, String partialTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean result=wait.until(ExpectedConditions.titleContains(partialTitle));
		return result;
	}
	public WebDriver switchFrameAsElement(WebDriver driver, WebElement frameElement) {
		WebDriver frameDriver = driver.switchTo().frame(frameElement);
		return frameDriver;
	}
	public void alertOkButton(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public String getJavaScriptPopupMessage(WebDriver driver) {
		String popupMessage = driver.switchTo().alert().getText();
		return popupMessage;
	}
	public WebElement waitTillElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		return clickableElement;
	}
}
