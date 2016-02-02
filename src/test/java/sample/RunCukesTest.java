package sample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,format = {"pretty", "html:target/cukes", "json:target/cukes/report.json", "junit:target/cukes/junit.xml"},tags=" @smokeTest")
public class RunCukesTest {
}
