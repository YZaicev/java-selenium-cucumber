package org.sample;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.sample.support.Utils;
import org.sample.support.WebDriverManager;

public class StepDefinition {
    public WebDriver driver;
    public Utils utils = new Utils();

    @Before
    public void beforeScenario() {
        WebDriverManager webDriverManager = new WebDriverManager();
        driver = webDriverManager.get();
        utils.setDriver(driver);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Given("^browse google$")
    public void browse_google() {
        driver.get("https://duckduckgo.com");
    }
    @When("^I enter the keyword$")
    public void I_enter_the_keyword() {
        WebElement searchBox = utils.getElementByXpath(".//*[@id='search_form_input_homepage']");
        WebElement searchBtn = utils.getElementByXpath(".//*[@id='search_button_homepage']");
        searchBox.clear();
        searchBox.sendKeys("cucumber.io");
        searchBtn.click();
    }
    @And("^take first website from the result$")
    public void take_first_website_from_the_result() throws InterruptedException {
        Thread.sleep(3000);
        WebElement firstResult = utils.getElementByXpath(".//*[@id='links']/div/div/h2/a");
        firstResult.click();
    }
    @Then("^I should be on 'cucumber.io' page$")
    public void I_should_be_my_desired_page() throws InterruptedException {
        utils.getElementByXpath(".//*[@title='cucumber.io']");
    }
}
