package maven_log4j_project.testsuite;

import maven_log4j_project.pages.ComputerPage;
import maven_log4j_project.pages.DesktopsPage;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.pages.ItemPage;
import maven_log4j_project.testbase.BaseTest;
import org.testng.annotations.Test;

public class ItemTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computersPage = new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ItemPage itemPage = new ItemPage();

    @Test
    public void userShouldNavigateToBuildYourOwnPageSuccessfully() {
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.clickOnAddToCartBtn();
        itemPage.clickOnAddToCart();
    }
}
