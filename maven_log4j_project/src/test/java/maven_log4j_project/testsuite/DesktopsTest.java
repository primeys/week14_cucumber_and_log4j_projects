package maven_log4j_project.testsuite;

import maven_log4j_project.pages.BuildYourOwnPage;
import maven_log4j_project.pages.ComputerPage;
import maven_log4j_project.pages.DesktopsPage;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computersPage = new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();


    @Test
    public void userShouldNavigateToBuildYourOwnPageSuccessfully() {
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.scrollUpDown(600);
        desktopsPage.clickOnAddToCartBtn();
        String actualText = buildYourOwnPage.getBuildYourOwn();
        String expectedText = "build your own computer";
        Assert.assertEquals(actualText, expectedText);

    }
    @Test
    public void desktopShouldAddToBasketSuccessfully() throws InterruptedException {
        HomePage homePage = new HomePage();
        ComputerPage computersPage = new ComputerPage();
        DesktopsPage desktopsPage = new DesktopsPage();
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage();
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.scrollUpDown(600);
        desktopsPage.clickOnAddToCartBtn();
        Thread.sleep(2000);
        buildYourOwnPage.scrollUpDown(500);
        Thread.sleep(3000);
        buildYourOwnPage.clickOnHdd320GB();
        buildYourOwnPage.scrollUpDown(200);
        buildYourOwnPage.clickOnAddToCart();
        Thread.sleep(2000);
        Assert.assertTrue(buildYourOwnPage.checkIfItemIsAddedSuccessfully());
    }
}