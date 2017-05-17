package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class FrontPage extends DriverFactory {
	
	
	// locators for front page
	By frontPage_join_us = By.id("com.quidco:id/join_button");
	By joinUs = By.id("com.quidco:id/join_button");
	
	//Verify front page using frame layout locator
	public void verifyFrontPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(frontPage_join_us));
		assertEquals("Join Us", driver.findElement(frontPage_join_us).getText());
	}
	
	public void clickJoinUs() {
		driver.findElement(joinUs).click();
	}
	
}