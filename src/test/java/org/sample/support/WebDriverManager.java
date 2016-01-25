package org.sample.support;

import java.lang.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class WebDriverManager {
    String BROWSER = "browser";
    WebDriver driver;

    public WebDriver get() {
        String setting = System.getProperty(BROWSER);
        if (setting == null || setting.equals("firefox")) {
            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile pDefault = profile.getProfile("default");
            driver = new FirefoxDriver(pDefault);

        } else if (setting.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
            driver = new ChromeDriver();
        }
//      TODO: IE, Safari

        driver.manage().window().maximize();
        return driver;
    }
}
