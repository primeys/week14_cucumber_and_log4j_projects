package co.uk.sainsburys;

import co.uk.sainsburys.pages.GroceriesPage;
import co.uk.sainsburys.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on groceries link$")
    public void iClickOnGroceriesLink() {
        new HomePage().clickOnGroceriesLink();
    }

    @Then("^I can see shoppingWithUsText$")
    public void iCanSeeShoppingWithUsText() {
        Assert.assertEquals("Shopping with us",new HomePage().shoppingWithUsText());
    }

    @When("^I click on continue shopping$")
    public void iClickOnContinueShopping() {
        new GroceriesPage().clickOnContShoppingLink();
    }

    @And("^I reached to let's check postcode page$")
    public void iReachedToLetSCheckPostcodePage() {
        Assert.assertEquals("First, let's check we deliver to you",new GroceriesPage().welcomeTextForShopping());

    }


    @Then("^I enter postcode \"([^\"]*)\" into postcode field$")
    public void iEnterPostcodeIntoPostcodeField(String postCode)  {
        new GroceriesPage().enterPostCode(postCode);


    }

    @Then("^I click on postcode field$")
    public void iClickOnPostcodeField() {
        new GroceriesPage().clickOnPostCodeField();
    }

    @When("^I click on loginLink$")
    public void iClickOnLoginLink() {
        new GroceriesPage().clickOnLoginLink();
    }
}
