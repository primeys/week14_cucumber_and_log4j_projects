package com.augustusmartin;

import com.augustusmartin.pages.AboutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on about link$")
    public void iClickOnAboutLink() {
        new AboutPage().clickOnAboutLink();
    }

    @Then("^I should navigate to about page successfully$")
    public void iShouldNavigateToAboutPageSuccessfully() {
        Assert.assertEquals("Company Information",new AboutPage().getAboutPageText());
    }

    @And("^I click on Quality link page$")
    public void iClickOnQualityLinkPage() {
        new AboutPage().clickOnQualityLink();
    }

    @Then("^I should navigate to quality page successfully$")
    public void iShouldNavigateToQualityPageSuccessfully() {
        Assert.assertEquals("Quality",new AboutPage().getQualityPageText());
    }

    @And("^I click on Environment link page$")
    public void iClickOnEnvironmentLinkPage() {
        new AboutPage().clickOnEnvironmentLink();
    }

    @Then("^I should navigate to Environment page successfully$")
    public void iShouldNavigateToEnvironmentPageSuccessfully() {
        Assert.assertEquals("Environment",new AboutPage().getEnvPageText());
    }
}
