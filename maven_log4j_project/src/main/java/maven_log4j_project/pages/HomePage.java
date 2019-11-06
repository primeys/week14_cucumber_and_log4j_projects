package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By homePageWelcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By customerCurrency = By.id("customerCurrency");
    By wishList = By.className("wishlist-label");
    By shoppingCart = By.name("Shopping cart");
    By computers = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitalDownloads = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By books = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewellery = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftCards = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");

  /* @FindBy(linkText = "Register")
    WebElement registerLink;

   @FindBy(linkText = "Log in")
   WebElement loginLink;

   @FindBy(id = "customerCurrency")
   WebElement customerCurrency;

   @FindBy(className = "wishlist-label")
   WebElement wishList;

   @FindBy(name = "Shopping cart")
   WebElement shoppingCart;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
   WebElement computers;

   @FindBy(name = "Electronics")
   WebElement electronics;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
   WebElement apparel;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement digitalDownloads;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
   WebElement books;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
   WebElement jewellery;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
   WebElement giftCards;*/


  public String verifyWelcomeTextOnHomePage(){
      return getTextFromElement(homePageWelcomeText);
  }
    public void clickOnLoginLink() {
        log.info("Click on login link");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        log.info("Click on register link");
        clickOnElement(registerLink);
    }

    public void selectCurrencyByName(String currency) {
        log.info("Select on currency");
        selectByVisibleTextFromDropDown(customerCurrency, currency);
    }

    public void clickOnWishList() {
        log.info("Click on wishList link");
        clickOnElement(wishList);
    }

    public void clickOnShoppingCart() {
        log.info("Click on shopping cart");
        clickOnElement(shoppingCart);
    }


    public void clickOnComputers() {
        log.info("Click on computer link");
        clickOnElement(computers);
    }

    public void clickOnElectronics() {
        log.info("Click on electronic link");
        clickOnElement(electronics);
    }

    public void clickOnApparel() {
        log.info("Click on apparel link");
        clickOnElement(apparel);
    }

    public void clickOnDigitalDownloads() {
        log.info("Click on digital download link");
        clickOnElement(digitalDownloads);
    }

    public void clickOnBooks() {
        log.info("Click on books link");
        clickOnElement(books);
    }

    public void clickOnJewellery() {
        log.info("Click on jewellery link");
        clickOnElement(jewellery);
    }

    public void clickOnGiftCards() {
        log.info("Click on gift");
        clickOnElement(giftCards);
    }


}