package org.sample.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
    WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

}
