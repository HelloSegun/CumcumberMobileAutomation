package com.cucumber.automation.bdt.stepDefinitions;


import java.net.MalformedURLException;

import com.cucumber.automation.mobile.pages.android.AccountPage;
import com.cucumber.automation.mobile.pages.android.AccountSettingsPage;
import com.cucumber.automation.mobile.pages.android.ExploreAppPage;
import com.cucumber.automation.mobile.pages.android.FrontPage;
import com.cucumber.automation.mobile.pages.android.HomePage;
import com.cucumber.automation.mobile.pages.android.JoinUsPage;
import com.cucumber.automation.mobile.pages.android.NavigationMenu;




import com.cucumber.automation.utils.DriverFactory;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class QuidcoStepD {

	AccountPage ap = new AccountPage();
	AccountSettingsPage as_p = new AccountSettingsPage();
	DriverFactory df = new DriverFactory();
	ExploreAppPage ep = new ExploreAppPage();
	FrontPage fp = new FrontPage();
	HomePage hp = new HomePage();
	JoinUsPage jsp = new JoinUsPage();
	NavigationMenu nm = new NavigationMenu();

	
	
	@Given("^user is on Explore page$")
	public void user_is_on_Explore_page() throws MalformedURLException {
		df.createDriver();
		ep.verifyExploreAppPage();
	}
	
	@When("^user selects Skip$")
	public void user_selects_Skip() throws Exception {
		ep.clickSkip();
	}
	
	@Then("^user is on Application Front page$")
	public void user_is_on_Application_Front_page() throws MalformedURLException {
		fp.verifyFrontPage();
	}
  
	/*
	 * 	Un-registered user can tested through API request and response verification
	@And("^user is not yet registered$")
	public void user_is_not_yet_registered() throws Exception {
		
	}
	*/

	@When("^user selects Join Us$")
	public void user_selects_Join_Us() throws Exception {
		fp.clickJoinUs();
	}

	@Then("^user is on Join Us page$")
	public void user_is_on_Join_Us_page() throws Exception {
		jsp.verifyJoinUsPage();
	}
	
	@When("^user enters First Name \"([^\"]*)\"$")
	public void user_enters_First_Name(String first_Name) throws Exception {
		jsp.enterFirstName(first_Name);
	}
	
	@And("^user enters Last Name \"([^\"]*)\"$")
	public void user_enters_Last_Name(String last_Name) throws Exception {
		jsp.enterLastName(last_Name);
	}
  
	@And("^user enters Email \"([^\"]*)\"$")
	public void user_enters_Email(String emailAddress) throws Exception {
		jsp.enterEmailAddress(emailAddress);
	}
  
	@And("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String passWord) throws Exception {
		jsp.enterPassword(passWord);
	}
  
	@When("^user select Join Us$")
	public void user_select_Join_Us() throws Exception {
		df.navigateBack();
		jsp.clickJoinUs();
	}
  
	@Then("^user is on User Home page$")
	public void user_is_on_User_Home_page() throws Exception {
		hp.verifyFrontPage();
		df.teardown();
	}
	


}
