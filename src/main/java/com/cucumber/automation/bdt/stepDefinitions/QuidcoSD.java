package com.cucumber.automation.bdt.stepDefinitions;


import com.cucumber.automation.testsuites.LoginTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class QuidcoSD {
	
	LoginTest login = new LoginTest();
	
	@Given("^user is on Application Home page$")
	public void user_is_on_Application_Home_page() throws Throwable {
	}
  
	@And("^user is already registered$")
	public void user_is_already_registered() throws Throwable {
	}

	@When("^user selects Sign In$")
	public void user_selects_Sign_In() throws Throwable {
	}

	@Then("^user is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
	}
  
	@When("^user enters Email$")
	public void user_enters_Email() throws Throwable {
	}
  
	@And("^user enters password$")
	public void user_enters_password() throws Throwable {
	}
  
	@When("^user select Sign In$")
	public void user_select_Sign_In() throws Throwable {
	}
  
  @Then("^user is on User Home page$")
  public void user_is_on_User_Home_page() throws Throwable {
  }

  
  
  
  
  /*
  @And("^you are in And annotation$")
  public void and() throws Throwable {
  }

  @But("^you are in But annotation$")
  public void but() throws Throwable {
  }

  
  @Given("^you are in Given annotation$")
  public void given() throws Throwable {
  }

  @When("^you are in When annotation$")
  public void when() throws Throwable {
  }

  @Then("^you are in Then annotation$")
  public void then() throws Throwable {
  }

  @And("^you are in And annotation$")
  public void and() throws Throwable {
  }

  @But("^you are in But annotation$")
  public void but() throws Throwable {
  }
  */
}
