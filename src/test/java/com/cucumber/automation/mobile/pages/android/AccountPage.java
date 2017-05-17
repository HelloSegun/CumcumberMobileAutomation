package com.cucumber.automation.mobile.pages.android;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class AccountPage extends DriverFactory{

	// locators for Account Page
	By account_header = By.id("com.quidco:id/account_header_user_layout");
	By more_options_btn = By.name("More options");
	By settings_btn = By.id("com.quidco:id/title");
	
	//Verify account settings page
	public void verifyAccountPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(account_header));
		assertEquals("More options", driver.findElement(account_header).getAttribute("content-desc"));
	}
	
	public void clickMoreOptionsBtn() {
		driver.findElement(more_options_btn).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(settings_btn));
	}
	
	public void clickSettingsBtn() {
		driver.findElement(settings_btn).click();
	}
}
