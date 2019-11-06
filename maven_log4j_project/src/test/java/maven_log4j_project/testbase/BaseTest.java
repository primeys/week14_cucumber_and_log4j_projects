package maven_log4j_project.testbase;

import maven_log4j_project.basepage.BasePage;
import maven_log4j_project.browserselector.BrowserSelector;
import maven_log4j_project.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();


    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
        driver.get(new LoadProperty().getProperty("baseUrl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
