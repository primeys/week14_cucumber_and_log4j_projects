package co.uk.matalan.Pages;

import co.uk.matalan.Utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//body[@class='cart--is-empty']/div[@class='o-header__container']/div[@class='container']/div[@class='row hidden@md-down u-mar-v-large u-pos-rel']/div[@class='col-3@lg']/div[@class='o-header__brand u-pad-v-tiny']/a[@class='o-header__brand__logo o-header__brand__logo--inline u-dis-b']/*[1]")
    WebElement _logo;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement _myAccountLink;

    @FindBy(xpath = "//h4[@class='eg-header']")
    WebElement _homePageForYouText;

    public boolean isLogoDisplayed() {
        if (_logo.isDisplayed()) {
            log.info("Logo is displayed on home page");
            return true;
        } else {
            log.info("Logo is not displayed on home page");
            return false;
        }
    }

    public String homePageVerificationText(){
        return getTextFromElement(_homePageForYouText);
    }

    public void clickOnMyAccountLink() {
        log.info("click on MyAccount Link");
        clickOnElement(_myAccountLink);
    }

}
