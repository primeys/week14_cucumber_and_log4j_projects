package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class BuildYourOwnPage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    String buildYourOwn = "build your own computer";
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By productIsAddedText = By.xpath("//p[@class='content']");
    By hdd_320GB = By.xpath("//input[@id='product_attribute_3_6']");
    By addToCartBtn = By.xpath("//input[@id='add-to-cart-button-1']");


    public String getBuildYourOwn()
    {
        log.info("Get Build Your Own Text");
        return getTextFromElement(buildYourOwnText);
    }
    public void clickOnHdd320GB()
    {
        log.info("Click On Hdd 320GB");
        clickOnElement(hdd_320GB);
    }
    public void clickOnAddToCart()
    {
        log.info("Click On Add To Cart");
        clickOnElement(addToCartBtn);
    }
    public boolean checkIfItemIsAddedSuccessfully()
    {
        log.info("Check If Item Is Added Successfully ");
        return verifyThatElementIsDisplayed(productIsAddedText);
    }
    }
