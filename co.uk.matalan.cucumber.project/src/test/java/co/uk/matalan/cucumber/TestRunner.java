package co.uk.matalan.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".",
        plugin = {"pretty","html:target/cucumber-report"}
        //tags = "@Sanity,@Regression"

)

public class TestRunner {
}
