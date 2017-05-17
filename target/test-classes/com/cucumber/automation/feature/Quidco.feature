Feature: Quidco App
	In order to access Quidco account
	As an Un-registered user
	I want to be able to Join in
	
Scenario: Join Us
	Given user is on Explore page
	When user selects Skip
	Then user is on Application Front page
	When user selects Join Us
	Then user is on Join Us page
	When user enters First Name ""
	And user enters Last Name ""
	And user enters Email ""
	And user enters password ""
	When user select Join Us
	Then user is on User Home page
