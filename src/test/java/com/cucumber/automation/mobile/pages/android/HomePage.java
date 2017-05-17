package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class HomePage extends DriverFactory{

	// locators for Home page
	By homePage = By.id("com.quidco:id/toolbar_title");
	By navigation_bar = By.className("android.widget.ImageButton");
	
	//Verify home page using frame layout locator
	public void verifyFrontPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(homePage));
		assertEquals("Home", driver.findElement(homePage).getText());
	}
	
	public void clickNavigationBar() {
		driver.findElement(navigation_bar).click();
	}
}