package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ShoppingCart extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By productVerifyText = By.xpath("//a[@class='product-name']");

    public void clickOnShoppingCartLink() {
        log.info("Click on shopping cart link");
        clickOnElement(shoppingCartLink);
    }

    public String verifyShoppingWelcomeText() {
        log.info("Verify shopping welcome text ");
        return getTextFromElement(shoppingCartText);
    }

    public String verifyProductText() {
        log.info("Verify product text");
        return getTextFromElement(productVerifyText);
    }


}
