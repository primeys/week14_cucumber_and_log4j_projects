package co.uk.matalan.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    public BasePage(){
        PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\co\\uk\\matalan\\resources\\propertiesfile\\log4j.properties");
        PageFactory.initElements(driver,this);
    }

}
