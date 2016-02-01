$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample/belly.feature");
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
formatter.before({
  "duration": 4455392018,
  "status": "passed"
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
  "location": "StepDefinitions.browse_google()"
});
formatter.result({
  "duration": 2495713416,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_enter_the_keyword()"
});
formatter.result({
  "duration": 3392131625,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.take_first_website_from_the_result()"
});
