package com.cucumber.automation.utils;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.cucumber.automation.testsuites.AndroidDriver;
//import com.cucumber.automation.testsuites.URL;

public class DriverFactory {

	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	
	public void createDriver() throws MalformedURLException{
		//set up appium
		
		//final File classpathRoot = new File(System.getProperty("user.dir"));
		//final File appDir = new File(classpathRoot, "/src/test/resources/apps/");
		//final File app = new File(appDir, "Quidco_com.quidco.apk");

		
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("appiumVersion", "1.6.4");
		capabilities.setCapability("deviceName", " "); 	//Enter device name
		capabilities.setCapability("version", " "); 	//Enter device android version
		capabilities.setCapability("platform", "Android");
		capabilities.setCapability("groups", " "); 	//Enter device groups
		capabilities.setCapability("udid", " ");	//Enter device serial number
		capabilities.setCapability("browserName", "Android");
		capabilities.setCapability("platformVersion", "7.0");	//Enter device android version
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", "*************/CucumberMobileAutomation/src/test/resources/apps/Quidco_com.quidco.apk"); //Update the path to the apk file.
		capabilities.setCapability("apppackage", "com.quidco");
		capabilities.setCapability("appactivity", ".EntryActivity");
		

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		waitVar = new WebDriverWait(driver, 180);
	}
	

	
	public void teardown() {
		//close the app
		driver.quit();
	}
	
	
	public void navigateBack() {
		//Navigate back
		driver.navigate().back();
	}
}
