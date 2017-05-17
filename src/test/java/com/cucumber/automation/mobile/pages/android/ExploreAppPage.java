package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class ExploreAppPage extends DriverFactory {

	
	
	// locators for app explore page
	By explorePage = By.id("com.quidco:id/title");
	By skip_button = By.id("com.quidco:id/skip_button");
	
	//Verify explore page using browse locator
	public void verifyExploreAppPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(explorePage));
		assertEquals("Browse", driver.findElement(explorePage).getText());
	}
	
	public void clickSkip() {
		driver.findElement(skip_button).click();
	}
}
