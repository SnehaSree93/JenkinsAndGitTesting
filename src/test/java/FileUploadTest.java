package test.java;

import main.java.methods.LearningActivities;


import org.apache.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;


import java.awt.*;

public class FileUploadTest extends BaseTest {
 methods.LoginPageMethod loginPageMethod ;
   // private static final Logger log = LogManager.getLogger(FileUploadTest.class.getName());
     public static Logger log = Logger.getLogger(FileUploadTest.class.getName());

    WebElement agree ;
    WebElement adminIcon=null;

    WebDriver driver;

    public void intializeBrowser(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

/*
   @BeforeMethod
    public void login() throws InterruptedException, AWTException {
        intializeBrowser();
       loginPageMethod= new LoginPageMethod();

       driver.get(PropertyUtil.getValueForKey("env.baseurl"));
       loginPageMethod.login(PropertyUtil.getValueForKey("username"), PropertyUtil.getValueForKey("password"));

   }
*/

    @Test
    public void fileUpload() throws InterruptedException, AWTException
    {
        LearningActivities learningActivities = new LearningActivities();
        learningActivities.navigateLearningActivities();
        learningActivities.uploadFile();
        String activityCode = learningActivities.getActivityCode();
        System.out.println("Activity Code is " +activityCode);
        boolean aCodeStaging=  learningActivities.aNameVisibleOrNot(activityCode);
        Assert.assertTrue(aCodeStaging,"File is in Staging");
        LearningActivities.close();

        //driver.switchTo().parentFrame();
    }

@Test
    public void test(){
        String str = "SS";
}
}
