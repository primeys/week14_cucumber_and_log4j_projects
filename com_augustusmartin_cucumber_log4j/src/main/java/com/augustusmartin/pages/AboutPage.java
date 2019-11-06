package com.augustusmartin.pages;

import com.augustusmartin.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends Util {
    private Logger log = LogManager.getLogger(AboutPage.class.getName());

    @FindBy (xpath = "//a[contains(text(),'About')]")
    WebElement _aboutLink;

    @FindBy (xpath = "//h1[contains(text(),'Company Information')]")
    WebElement _aboutPageText;

    @FindBy(xpath = "//a[contains(text(),'Quality')]")
    WebElement _qualityLink;

    @FindBy (xpath = "//h1[contains(text(),'Quality')]")
    WebElement _qualityPageText;

    @FindBy(xpath = "//a[contains(text(),'Environment')]")
    WebElement _environmentLink;

    @FindBy(xpath = "//h1[contains(text(),'Environment')]")
    WebElement _environmentText;

    public void clickOnAboutLink(){
        log.info("Click on About Link");
        clickOnElement(_aboutLink);
    }

    public String getAboutPageText(){
        log.info("getting Header Text from About Page");
        return getTextFromElement(_aboutPageText);
    }

    public void clickOnQualityLink(){
        log.info("Click on Quality Link");
        clickOnElement(_qualityLink);
    }

    public String getQualityPageText(){
        log.info("getting header Text from Quality page");
        return getTextFromElement(_qualityPageText);
    }

    public void clickOnEnvironmentLink(){
        log.info("Click on Environment Link");
        clickOnElement(_environmentLink);
    }

    public String getEnvPageText(){
        log.info("getting header Text from Environment page ");
        return getTextFromElement(_environmentText);
    }



}
