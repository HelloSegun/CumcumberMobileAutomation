package com.cucumber.automation.bdt.stepDefinitions;

import com.cucumber.automation.testsuites.LoginTest;
import com.pages.xxx;



import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	LoginTest lt = new LoginTest();
	
	@Before
	public void beforeHookfunction() throws Throwable {
		lt.createDriver();
	}
	
	@After
	public void afterHookfunction() {
		lt.teardown();
	}
}
