Feature: Quidco App
	In order to access my user account
	As a Register user
	I want to be able to log in
	
Scenario: Log in
	Given user is on Application Home page
	And user is already registered
	When user selects Sign In
	Then user is on Login page
	When user enters Email
	And user enters password
	When user select Sign In
	Then user is on User Home page
	