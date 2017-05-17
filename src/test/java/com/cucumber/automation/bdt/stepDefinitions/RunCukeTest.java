package com.cucumber.automation.bdt.stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/cucumber/automation/feature",
		glue = "com.cucumber.automation.bdt.stepDefinitions",
		plugin = {
				"pretty",
				"html:target/cucumber",
		}
		)


public class RunCukeTest {

}
