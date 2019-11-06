package maven_log4j_project.testsuite;

import maven_log4j_project.loadproperty.LoadProperty;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.pages.LoginPage;
import maven_log4j_project.testbase.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText,new LoginPage().loginWelcomeText());
    }

    @Test
    public void userShouldLoginSuccessfully() {
        homePage.clickOnLoginLink();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginBtn();
        //WebElement text = driver.findElement(By.xpath("//li[contains(text(),'No customer account found']"));
        // Assert.assertTrue("No customer account found",text.isDisplayed());
    }


}
