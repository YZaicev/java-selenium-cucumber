$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("org/sample/test.feature");
formatter.feature({
  "line": 2,
  "name": "search a website in google",
  "description": "",
  "id": "search-a-website-in-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Provide keyword and navigate to website",
  "description": "",
  "id": "search-a-website-in-google;provide-keyword-and-navigate-to-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browse google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the keyword",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "take first website from the result",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be on \u0027cucumber.io\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.browse_google()"
});
formatter.result({
  "duration": 9935582713,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_enter_the_keyword()"
});
formatter.result({
  "duration": 28693137598,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.take_first_website_from_the_result()"
});
formatter.result({
  "duration": 3075490277,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_should_be_my_desired_page()"
});
formatter.result({
  "duration": 6957222851,
  "status": "passed"
});
});