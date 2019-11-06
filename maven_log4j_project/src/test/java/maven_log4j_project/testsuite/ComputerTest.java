package maven_log4j_project.testsuite;

import maven_log4j_project.pages.ComputerPage;
import maven_log4j_project.pages.DesktopsPage;
import maven_log4j_project.pages.HomePage;
import maven_log4j_project.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {


    @Test
    public void userShouldBeNavigateToComputerPageSuccessfully(){
        HomePage homePage = new HomePage();
        ComputerPage computersPage = new ComputerPage();
        DesktopsPage desktopsPage = new DesktopsPage();
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        String actualText = desktopsPage.getDesktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText,expectedText);
       }

}
