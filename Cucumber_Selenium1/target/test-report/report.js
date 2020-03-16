$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Test1.feature");
formatter.feature({
  "name": "Automation Practice Home Page Features",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the home page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "I navigate to home page of \"https://ultimateqa.com/automation/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_navigate_to_home_page_of(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Automation Practice - Ultimate QA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.I_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});