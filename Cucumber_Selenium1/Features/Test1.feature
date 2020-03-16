Feature: Automation Practice Home Page Features

Background: Below are the common steps for each scenario
	Given I launch chrome browser
	
@sanity
Scenario: Verify presence of automation practice text in home page
	When I navigate to automation practice home page
	Then Verify presence of automation practice text in home page
	And I close the browser
	
@functional
Scenario: Verify the home page title
	When I navigate to home page of "https://ultimateqa.com/automation/"
	Then Page Title should be "Automation Practice - Ultimate QA"
	And I close the browser
	
@regression
Scenario Outline: Verify the home page titles
	When I navigate to home page of "<url>"
	Then Page Title should be "<pageTitle>"
	And I close the browser
	Examples:
	|	url	|	pageTitle	|
	|	http://the-internet.herokuapp.com/	|	The Internet	|
	|	http://seleniumpractise.blogspot.com/2018/	|	Selenium Practise: 2018	|
	
	
	