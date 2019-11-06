package co.uk.sainsburys;

import co.uk.sainsburys.basepage.BasePage;
import co.uk.sainsburys.browserselector.BrowserSelector;
import co.uk.sainsburys.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {

    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void setup(){
        browserSelector.selectBrowser(browser);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
