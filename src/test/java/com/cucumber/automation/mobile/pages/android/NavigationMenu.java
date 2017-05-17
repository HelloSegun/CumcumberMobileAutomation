package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class NavigationMenu extends DriverFactory{

	// locators for Navigation Menu
	By navigation_menu = By.id("com.quidco:id/design_menu_item_text");
	By navigation_account = By.xpath("//android.support.v7.widget.RecyclerView[@index='4']//[@class='android.widget.CheckedTextView']");
	By sign_in_or_join_us = By.name("Sign In or Join Us");
	
	//Verify navigation menu
	public void verifyNavigationMenu() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(navigation_menu));
		assertEquals("android.widget.CheckedTextView", driver.findElement(navigation_menu).getAttribute("class"));
	}
	
	public void clickAccount() {
		driver.findElement(navigation_account).click();
	}
	
	public void verifyUserSignedOut() {
		String signed_out = driver.findElement(sign_in_or_join_us).getText();
		if (signed_out.equals("Sign In or Join Us")) {
			System.out.println("User Signed Out");
		}
	}
}
