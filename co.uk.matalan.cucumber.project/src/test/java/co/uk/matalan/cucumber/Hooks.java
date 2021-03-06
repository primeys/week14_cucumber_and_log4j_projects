package co.uk.matalan.cucumber;

import co.uk.matalan.basepage.BasePage;
import co.uk.matalan.browserselector.BrowserSelector;
import co.uk.matalan.loadproperties.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @Before
    public void setUp() {
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
