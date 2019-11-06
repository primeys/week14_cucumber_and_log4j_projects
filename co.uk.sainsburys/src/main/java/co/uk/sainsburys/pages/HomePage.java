package co.uk.sainsburys.pages;

import co.uk.sainsburys.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    @FindBy(xpath = "//a[@class='styles__NavLink-sc-10po4wg-0 kbLAED'][contains(text(),'Groceries')]")
    WebElement _groceriesLink;

    @FindBy (xpath = "//h3[contains(text(),'Shopping with us')]")
    WebElement _shoppingWithUsText;

    public void clickOnGroceriesLink() {
        clickOnElement(_groceriesLink);
    }

    public String shoppingWithUsText(){
        return getTextFromElement(_shoppingWithUsText);
    }


}





