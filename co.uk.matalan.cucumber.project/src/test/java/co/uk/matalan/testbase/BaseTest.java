package co.uk.matalan.testbase;

import co.uk.matalan.basepage.BasePage;
import co.uk.matalan.browserselector.BrowserSelector;
import co.uk.matalan.loadproperties.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage {
    /*
    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod(alwaysRun = true)

    public void setUp(){
        browserSelector.selectBrowser(browser);
        }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

     */
}
