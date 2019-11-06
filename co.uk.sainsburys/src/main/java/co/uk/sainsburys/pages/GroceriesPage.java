package co.uk.sainsburys.pages;

import co.uk.sainsburys.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroceriesPage extends Util {

    @FindBy(xpath = "//h2[contains(text(),'New customer?')]")
    WebElement _groceriesPageText;

    @FindBy(xpath = "//input[@id='postcode-input']")
    WebElement _postCodeField;

    @FindBy(xpath = "//input[@class='button primary process']")
    WebElement _postCodeCheckBtn;

    @FindBy(xpath = "//h1[contains(text(),\"First, let's check we deliver to you\")]")
    WebElement _welcomeTextForShopping;

    @FindBy(xpath = "//a[@class='ln-c-button ln-c-button--link ln-c-button--dark']")
    WebElement _continueShoppingLink;

    @FindBy(xpath = "//a[@class='login']")
    WebElement _loginLink;


    public void clickOnLoginLink(){
        clickOnElement(_loginLink);
    }

    public String expectedGroceriesPageText() {
        return getTextFromElement(_groceriesPageText);
    }

    public void clickOnPostCodeField() {
        clickOnElement(_postCodeField);
    }

    public void enterPostCode(String postCode) {
        sendTextToElement(_postCodeField, postCode);
    }

    public void clickOnCheckPostCodeBtn() {
        clickOnElement(_postCodeCheckBtn);
    }

    public String welcomeTextForShopping() {
        return getTextFromElement(_welcomeTextForShopping);
    }

    public void clickOnContShoppingLink() {
        clickOnElement(_continueShoppingLink);
    }


}
