package co.uk.matalan.cucumber;

import co.uk.matalan.Pages.HomePage;
import co.uk.matalan.Pages.MyAccount;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on myAccount link$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("^I enter email address \"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEmailField(String email)  {
        new MyAccount().enterEmailAddress(email);

    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password)  {
        new MyAccount().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new MyAccount().clickOnContinueBtn();
    }

    @Then("^I should successfully login to my account$")
    public void iShouldSuccessfullyLoginToMyAccount() {
        Assert.assertEquals("Existing Customer",new MyAccount().getExistingCustomerText());
    }



}
