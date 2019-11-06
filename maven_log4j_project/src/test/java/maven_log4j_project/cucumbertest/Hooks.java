package maven_log4j_project.cucumbertest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import maven_log4j_project.basepage.BasePage;
import maven_log4j_project.browserselector.BrowserSelector;
import maven_log4j_project.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperties = new LoadProperty();

    String browser = loadProperties.getProperty("browser");
    String baseUrl = loadProperties.getProperty("baseUrl");

    @Before
    public void setUp() {
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
