package co.uk.matalan.browserselector;

import co.uk.matalan.basepage.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {

    private static Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("fireFox")){
            System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",projectPath+"drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        } else {
            System.out.println("Wrong browser name");
        }



    }



}
