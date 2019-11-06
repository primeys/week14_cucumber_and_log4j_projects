package co.uk.matalan.Pages;

import co.uk.matalan.Utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends Util {

    private Logger log = LogManager.getLogger(MyAccount.class.getName());

    @FindBy(xpath = "//h3[contains(text(),'Existing Customer')]")
    WebElement _existingCustomer;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement _myAccountLink;

    @FindBy(id = "account_email")
    WebElement _emailField;

    @FindBy(id = "account_password")
    WebElement _passwordField;

    @FindBy(xpath = "//div[@class='col-12@xs col-5@lg u-pad-v-large']//button[1]")
    WebElement _continueSecurelyBtn;


    public void clickOnMyAccountLink() {
        log.info("click on MyAccount Link");
        clickOnElement(_myAccountLink);
    }

    public void enterEmailAddress(String email) {
        log.info("Enter email address to email field");
        sendTextToElement(_emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password to password field");
        sendTextToElement(_passwordField, password);
    }

    public void clickOnContinueBtn() {
        log.info("Click on continue button");
        clickOnElement(_continueSecurelyBtn);
    }

    public String getExistingCustomerText() {
        log.info("Getting existing customer text");
        return getTextFromElement(_existingCustomer);
    }


}
