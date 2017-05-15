package com.cucumber.automation.utils;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.cucumber.automation.testsuites.AndroidDriver;
//import com.cucumber.automation.testsuites.URL;

public class DriverFactory {

	public static WebDriver driver = null;
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
}
