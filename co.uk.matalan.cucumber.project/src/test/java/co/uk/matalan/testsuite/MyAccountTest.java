package co.uk.matalan.testsuite;

import co.uk.matalan.Pages.HomePage;
import co.uk.matalan.Pages.MyAccount;
import co.uk.matalan.loadproperties.LoadProperty;
import co.uk.matalan.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
/*
    HomePage homePage;
    MyAccount myAccount;
    LoadProperty loadProperty = new LoadProperty();

    @BeforeMethod
    public void setUpTest(){
        homePage = new HomePage();
        myAccount = new MyAccount();
    }
    @Test(groups = "Sanity")
    public void userShouldNavigateToHomePageSuccessfully(){
       // homePage.clickOnMyAccountLink();
        String expectedText = "Recommended For You";
        Assert.assertEquals(homePage.homePageVerificationText(),expectedText);
    }
    @Test (groups = "Sanity")
    public void userShouldBeOnMyAccountPageSuccessfully() throws InterruptedException {
        homePage.clickOnMyAccountLink();
        myAccount.enterEmailAddress(loadProperty.getProperty("email"));
        myAccount.enterPassword(loadProperty.getProperty("password"));
        Thread.sleep(1000);
        myAccount.clickOnContinueBtn();
    }


*/

}
