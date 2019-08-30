package WebDriverInitialiazation;

import Common.CommonConstants;
import Common.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BasePage extends WebDriverInitialiazation.PropertyUtil {

    public static WebDriver driver;


    @BeforeSuite
    public void launchDriver() {
        if (WebDriverInitialiazation.PropertyUtil.getValueForKey("selenium.defaultbrowser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./server/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (WebDriverInitialiazation.PropertyUtil.getValueForKey("selenium.defaultbrowser").equalsIgnoreCase("firfox")) {
            System.setProperty("webdriver.firefox.driver", "./server/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
       // driver.get(PropertyUtil.getValueForKey("env.baseurl"));
    }

    @BeforeTest
    public void launchURL(){
        driver.get(WebDriverInitialiazation.PropertyUtil.getValueForKey("env.baseurl"));

    }
    @AfterSuite

    public static void tesrDown(){
        driver.quit();
    }
}


/*   @AfterSuite
    public static void takeScreenShot(ITestResult result){

        if(ITestResult.FAILURE==result.getStatus()){
            try{
                // To create reference of TakesScreenshot
                TakesScreenshot screenshot=(TakesScreenshot)driver;
                // Call method to capture screenshot
                File src=screenshot.getScreenshotAs(OutputType.FILE);
                // Copy files to specific location
                // result.getName() will return name of test case so that screenshot name will be same as test case name
                FileUtils.copyFile(src, new File(CommonConstants.screenshot+result.getName()+".png"));
                System.out.println("Successfully captured a screenshot");
            }catch (Exception e){
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }*/



