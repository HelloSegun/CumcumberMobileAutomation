package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class JoinUsPage extends DriverFactory{

	// locators for Join Us page
	By joinUsPage = By.id("com.quidco:id/terms_conditions");
	By firstname = By.id("com.quidco:id/join_first_name");
	By lastname = By.id("com.quidco:id/join_last_name");
	By email = By.id("com.quidco:id/join_email_address");
	By password = By.id("com.quidco:id/join_password");
	By join_us = By.id("com.quidco:id/join_join_button");
	
	//Home page locator
	By homePage_loc = By.id("com.quidco:id/toolbar_title");
	
	//Verify join us page using unique text locator
	public void verifyJoinUsPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(joinUsPage));
		assertEquals("Read our Terms & Conditions", driver.findElement(joinUsPage).getText());
	}
	
	public void enterFirstName(String first_name) {
		driver.findElement(firstname).sendKeys(first_name);
	}
	
	public void enterLastName(String last_name) {
		driver.findElement(lastname).sendKeys(last_name);
	}
	
	public void enterEmailAddress(String email_address) {
		driver.findElement(email).sendKeys(email_address);
	}
	
	public void enterPassword(String pass_word) {
		driver.findElement(password).sendKeys(pass_word);
	}
	
	public void clickJoinUs() {
		driver.findElement(join_us).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(homePage_loc));
	}
}
