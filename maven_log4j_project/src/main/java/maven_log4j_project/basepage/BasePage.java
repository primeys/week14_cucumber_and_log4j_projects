package maven_log4j_project.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\java\\maven_log4j_project\\propertiesfile\\log4j.properties");
    }
}
