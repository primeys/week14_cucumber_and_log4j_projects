package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ComputerPage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By computerVerifyText = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopsImage = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By noteBooksImage = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    By softwareImage = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");

    public void mouseOverComputer() {
        log.info("Mouse over computer");
        mouseHoverToElement(computersLink);
        clickOnElement(computersLink);
    }

    public String verifyComputerText() {
        log.info("Verify computer text");
        return getTextFromElement(computerVerifyText);
    }
    public void clickOnDesktopImage()
    {
        log.info("Click on desktop image");
        clickOnElement(desktopsImage);
    }

    public void clickOnNoteBooksImage()
    {
        log.info("Click on noteBooks image");
        clickOnElement(noteBooksImage);
    }

    public void clickOnSoftwareImage()
    {
        log.info("Click on software image ");
        clickOnElement(softwareImage);
    }


}
