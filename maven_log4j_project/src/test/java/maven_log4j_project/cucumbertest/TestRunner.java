package maven_log4j_project.cucumbertest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-report"},
        dryRun = false,
        tags = "@HomePage"
)
public class TestRunner {
}
