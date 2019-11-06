package com.augustusmartin.testsuite;

import com.augustusmartin.basepage.BasePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExtentReport extends BasePage {
    String projectPath = System.getProperty("user.dir");

    public ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(projectPath+"/Reports/myReport.html");

    public ExtentReports extent;
    public ExtentTest test;

    @BeforeTest
    public void setExtent(){
        htmlReporter.config().setDocumentTitle("Automation Report"); // Title of the Report
        htmlReporter.config().setReportName("Functional Report"); // Name of the report
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();

        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("HostName", "Local");
        extent.setSystemInfo("OS", "Windows7");
        extent.setSystemInfo("Tester Name", "Yatin");
        extent.setSystemInfo("Browser", "Chrome");
    }


    @AfterTest
    public void endReport(){
        extent.flush();
    }

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.augustusmartin.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void augustUsMartinTest(){
        test = extent.createTest("AugustusmartinTest");
        String title =driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Company Information");
    }

}
