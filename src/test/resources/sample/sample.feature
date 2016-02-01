@smokeTest
Feature: search a website in google

    Scenario: Provide keyword and navigate to website
        Given browse google
        When I enter the keyword
        And take first website from the result
        Then I should be on 'cucumber.io' page
