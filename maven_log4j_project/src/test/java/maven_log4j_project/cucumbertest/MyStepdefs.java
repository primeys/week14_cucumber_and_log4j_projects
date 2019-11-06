package maven_log4j_project.cucumbertest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import maven_log4j_project.pages.ComputerPage;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.pages.LoginPage;
import maven_log4j_project.pages.RegistrationPage;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().loginWelcomeText());
    }

    @And("^I enter email address \"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEmailField(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @Then("^I should successfully login to my account$")
    public void iShouldSuccessfullyLoginToMyAccount() {
        Assert.assertEquals("My account", new LoginPage().logInAccountVerityText());
    }

    @When("^I click on registration link$")
    public void iClickOnRegistrationLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I click on male gender$")
    public void iClickOnMaleGender() {
        new RegistrationPage().clickOnMale();
    }

    @And("^I enter \"([^\"]*)\" in first name field$")
    public void iEnterInFirstNameField(String firstName) {
        new RegistrationPage().enterFirstName(firstName);
    }


    @And("^I enter \"([^\"]*)\" in last name field$")
    public void iEnterInLastNameField(String lastName) {
        new RegistrationPage().enterLastName(lastName);
    }

    @And("^I select day (\\d+)  from dropdown list$")
    public void iSelectDayFromDropdownList(String day) {
        new RegistrationPage().enterDayOfBirth(day);
    }

    @And("^I select month \"([^\"]*)\" from dropdown list$")
    public void iSelectMonthFromDropdownList(String month) {
        new RegistrationPage().enterMonthOfBirth(month);
    }

    @And("^I select year \"([^\"]*)\" from dropdown list$")
    public void iSelectYearFromDropdownList(String year) {
        new RegistrationPage().enterYearOfBirth(year);
    }

    @And("^I enter \"([^\"]*)\" email address in email field$")
    public void iEnterEmailAddressInEmailField(String emil) {
        new RegistrationPage().enterEmailAddress(emil);
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String comName) {
        new RegistrationPage().enterCompanyName(comName);
    }

    @And("^I click on newsletter link$")
    public void iClickOnNewsletterLink() {
        new RegistrationPage().newsLetter();
    }

    @And("^I enter password \"([^\"]*)\" in password field$")
    public void iEnterPasswordInPasswordField(String password) {
        new RegistrationPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\" in password field$")
    public void iEnterConfirmPasswordInPasswordField(String confirmPassword) {
        new RegistrationPage().enterConfirmPassword(confirmPassword);
    }

    @Then("^I click on Register Button$")
    public void iClickOnRegisterButton() {
        new RegistrationPage().clickOnRegistrationBtn();
    }


    @Then("^I can see homepage successfully$")
    public void iCanSeeHomepageSuccessfully() {
        Assert.assertEquals("Welcome to our store", new HomePage().verifyWelcomeTextOnHomePage());
    }

    @Then("^I can see LoginPage successfully$")
    public void iCanSeeLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().loginWelcomeText());
    }


    @Then("^I can see RegisterPage successfully$")
    public void iCanSeeRegisterPageSuccessfully() {
        Assert.assertEquals("Your Personal Details", new RegistrationPage().registerText());
    }

    @When("^I click on computers link$")
    public void iClickOnComputersLink() {
        new HomePage().clickOnComputers();
    }

    @Then("^I can see ComputersPage successfully$")
    public void iCanSeeComputersPageSuccessfully() {
        Assert.assertEquals("Computers", new ComputerPage().verifyComputerText());
    }

    @Then("^I click on electronics link$")
    public void iClickOnElectronicsLink() {
        new HomePage().clickOnElectronics();
    }

    @Then("^I click on apparel link$")
    public void iClickOnApparelLink() {
        new HomePage().clickOnApparel();
    }

    @Then("^I click on digital downloads link$")
    public void iClickOnDigitalDownloadsLink() {
        new HomePage().clickOnDigitalDownloads();
    }

    @Then("^I click on books link$")
    public void iClickOnBooksLink() {
        new HomePage().clickOnBooks();
    }

    @Then("^I click on jewelry link$")
    public void iClickOnJewelryLink() {
        new HomePage().clickOnJewellery();
    }

    @Then("^I click on gift cards link$")
    public void iClickOnGiftCardsLink() {
        new HomePage().clickOnGiftCards();
    }

    @Then("^I click on wishlist link$")
    public void iClickOnWishlistLink() {
        new HomePage().clickOnWishList();
    }
}
