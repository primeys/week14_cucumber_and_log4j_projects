package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By myAccountPageVerify=By.xpath("//a[@class='ico-account']");

/*
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    //h1[contains(text(),'Welcome, Please Sign In!')]
    WebElement _welcomeText;

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(id = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;


    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement _accountLoginVerifyText;

*/
    public void enterEmail(String email) {
        log.info("Enter email address");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginBtn() {
        log.info("Click on login button");
        clickOnElement(loginBtn);
    }

    public String loginWelcomeText() {
        log.info("Get Login Page welcome text");
        return getTextFromElement(welcomeText);
    }


    public String logInAccountVerityText() {
        log.info("Verity After Login into Account");
        return getTextFromElement(myAccountPageVerify);
    }

}
