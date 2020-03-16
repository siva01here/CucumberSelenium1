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
  "name": "Verify presence of automation practice text in home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I navigate to automation practice home page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.I_navigate_to_automation_practice_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify presence of automation practice text in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.verify_presence_of_automation_practice_text_in_home_page()"
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
formatter.uri("file:Features/Test2%20-%20Verify%20Big%20Page%20Many%20Elements%20Sections%20Headers.feature");
formatter.feature({
  "name": "Verify Big Page Many Elements Section Header",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below would be the common steps of all scenarios",
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
  "name": "Verify section header and its text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
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
  "name": "I click on Big page with many elements link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_click_on_Big_page_with_many_elements_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Extract all section headers and verify its text",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.extract_all_section_headers_and_verify_its_text()"
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