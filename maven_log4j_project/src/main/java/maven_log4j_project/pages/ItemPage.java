package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ItemPage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public void clickOnAddToCart() {
        log.info("Click on add to cart");
        clickOnElement(buildYourOwnText);
    }
}
