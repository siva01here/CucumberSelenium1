Feature: Verify Big Page Many Elements Section Header

Background: Below would be the common steps of all scenarios
	Given I launch chrome browser

@sanity
Scenario: Verify section header and its text
	When I navigate to home page of "https://ultimateqa.com/automation/"
	And I click on Big page with many elements link
	Then Extract all section headers and verify its text
	And I close the browser