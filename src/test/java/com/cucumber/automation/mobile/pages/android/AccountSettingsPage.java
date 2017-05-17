package com.cucumber.automation.mobile.pages.android;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class AccountSettingsPage extends DriverFactory {

	// locators for Account Settings Page
	By account_settings_header = By.id("com.quidco:id/toolbar_title");
	By sign_out_btn = By.id("com.quidco:id/account_settings_sign_out_button");
	By confirm_sign_out_pop_up = By.id("android:id/message");
	By pop_up_sign_out = By.id("android:id/button1");
	
	//Verify navigation menu
	public void verifyAccountSettingsPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(account_settings_header));
		assertEquals("Sign Out", driver.findElement(account_settings_header).getText());
	}
	
	public void clickSignOutBtn() {
		driver.findElement(sign_out_btn).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(confirm_sign_out_pop_up));
	}
	
	public void confirmSigningOutBtn() {
		driver.findElement(pop_up_sign_out).click();
	}
	
}
