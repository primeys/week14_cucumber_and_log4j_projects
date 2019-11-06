package maven_log4j_project.pages;


import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class DesktopsPage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By sortByDropDown = By.id("products-orderby");
    By desktopTextOnDesktopPage = By.xpath("//h1[contains(text(),'Desktops')]");
    By addToCartBtn = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    String zToA = "Name: Z to A";

    public void clickOnSortByDropDown()
    {
        log.info("Click on sort by drop down");
        clickOnElement(sortByDropDown);
    }

    public void selectztoA() {
        log.info("Select Z to A");
        selectByVisibleTextFromDropDown(sortByDropDown, zToA);
    }

    public void scrollDownDesktopPage(int i)
    {
        log.info("Scroll down desktop page ");
        scrollUpDown(i);
    }

    public void clickOnAddToCartBtn() {
        log.info("Click on add to cart button");
        clickOnElement(addToCartBtn);
    }
    public void buildYourOwnText(){
        log.info("Build your own text");
        clickOnElement(buildYourOwnText);
    }

    public String getDesktopText()
    {
        log.info("Get desktop text");
        return getTextFromElement(desktopTextOnDesktopPage);
    }


}

