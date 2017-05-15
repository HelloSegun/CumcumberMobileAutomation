package com.cucumber.automation.testsuites;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.automation.utils.DriverFactory;

public class LoginTest extends DriverFactory{
	
	//All locators are defined here
	By homePage = By.id("home page_locator_id");
	By homePageSignIn = By.id("home page_sign_in_locator_id");
	By loginPage = By.id("login page_locator_id");
	By emailAddress = By.id("sign_in_button_id_locator_element");
	By loginPassword = By.id("password_locator_id");
	By loginPageSignIn = By.id("login page sign_in_button_id_locator_element");
	By userHomePage = By.id("user_home_page_locator_id");
	
	String user;
	String pWord;
	
	/* Now in DriverFactory Class
	static WebDriver driver = null;
	protected static WebDriverWait waitVar = null;
	
	public void createDriver() throws Throwable, MalformedURLException, InterruptedException {
		//set up appium
		final File classpathRoot = new File(System.getProperty(""));
		final File appDir = new File(classpathRoot, "src/main/resources/apps");
		final File app = new File(appDir, "Name_of_app");
		
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("app", app.getAbsolutePath());
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		waitVar = new WebDriverWait(driver, 90);
	}
	
	public void teardown() {
		//close the app
		driver.quit();
	}
	*/
	
	/*
	public void verifyHomePage() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	*/
	
	public void verifyHomePage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.id("page_locator_id")));
		assertTrue(driver.findElement(homePage).isDisplayed());
	}
	
	public void verifyUserIsRegistered(String username, String password) {
		this.user = username;
		this.pWord = password;
		// write a method to assert user is registered in verifying via api request/response or database check
	}
	
	public void clickSignIn() {
		driver.findElement(homePageSignIn).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginPage)); //wait to verify the login page displayed
	}
	
	public void verifyLoginPage() {
		// Verify Login Page Title
		assertEquals("Login page title text", driver.findElement(loginPage).getText());
	}
	
	public void enterUsernamAndPassword() {
		driver.findElement(emailAddress).sendKeys(user);
		driver.findElement(loginPassword).sendKeys(pWord);
		driver.findElement(loginPageSignIn).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(userHomePage)); //wait to verify user home page displayed
		
		if (driver.findElement(userHomePage)) {
			System.out.println("User now logged in and on user's home page");
		} else {
			System.out.print("User not logged in");
		}
	}

}
