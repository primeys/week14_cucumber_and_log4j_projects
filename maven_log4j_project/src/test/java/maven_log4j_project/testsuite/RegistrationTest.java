package maven_log4j_project.testsuite;


import maven_log4j_project.loadproperty.LoadProperty;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.pages.RegistrationPage;
import maven_log4j_project.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedText = "Your Personal Details";
        Assert.assertEquals(registrationPage.registerText(), expectedText);
    }

    @Test
    public void userShouldRegisterSuccessFully() {

        homePage.clickOnRegisterLink();
        registrationPage.clickOnGender(loadProperty.getProperty("gender"));
        registrationPage.enterFirstName(loadProperty.getProperty("firstName"));
        registrationPage.enterLastName(loadProperty.getProperty("lastName"));
        registrationPage.enterDayOfBirth(loadProperty.getProperty("day"));
        registrationPage.enterMonthOfBirth(loadProperty.getProperty("month"));
        registrationPage.enterYearOfBirth(loadProperty.getProperty("year"));
        registrationPage.enterEmailAddress(loadProperty.getProperty("email"));
        registrationPage.enterCompanyName(loadProperty.getProperty("companyName"));
        registrationPage.enterPassword(loadProperty.getProperty("password"));
        registrationPage.enterConfirmPassword(loadProperty.getProperty("confirmPassword"));
        registrationPage.clickOnRegistrationBtn();
    }


}
