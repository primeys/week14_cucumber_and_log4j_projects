package maven_log4j_project.testsuite;

import maven_log4j_project.pages.ComputerPage;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.pages.LoginPage;
import maven_log4j_project.pages.RegistrationPage;
import maven_log4j_project.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void userShouldNavigateToRegistrationPageSuccessfully(){
        HomePage homePage = new HomePage();
        RegistrationPage registrationPage = new RegistrationPage();
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        String actualText = registrationPage.registerText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void userShouldNavigateToLoginSuccessfully(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnLoginLink();
        String expectedWelcometext = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedWelcometext,new LoginPage().loginWelcomeText());
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        HomePage homePage = new HomePage();
        ComputerPage computerPage = new ComputerPage();
        homePage.clickOnComputers();
        String actualText = computerPage.verifyComputerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText,expectedText);
    }


}
