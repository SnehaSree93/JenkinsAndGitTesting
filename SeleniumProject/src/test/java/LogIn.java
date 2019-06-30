import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static java.awt.Toolkit.*;

public class LogIn {
    WebDriver driver =null;
    WebElement agree ;
    WebElement adminIcon=null;



    @Test
    public void login() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver  = new ChromeDriver();
        boolean agree=false;
        driver.get("https://avanade.sumtotallab.host");
        driver.manage().window().maximize();
        driver.findElement(By.id("BodyContent_MainContent_MainContentPlaceHolder_UserName")).sendKeys("psadmin");
        driver.findElement(By.id("BodyContent_MainContent_MainContentPlaceHolder_Password")).sendKeys("p");
        driver.findElement(By.id("BodyContent_MainContent_MainContentPlaceHolder_LoginButton")).click();
//        driver.findElement(By.xpath("//input[@value='I Agree']")).isDisplayed();
  //  if( !driver.findElement(By.xpath("//input[@value='I Agree']")).isDisplayed() || driver.findElement(By.id("admin_header")).isDisplayed()  )
           if(isEnabled("//input[@value='I Agree']")){
                driver.findElement(By.xpath("//input[@value='I Agree']")).click();
            }
        driver.findElement(By.id("admin_header")).click();
           driver.findElement(By.xpath("//span[text()='Product Administration']")).click();
           driver.findElement(By.xpath("//span[text()='Learning']")).click();
           driver.findElement(By.xpath("//span[text()='Learning Activities']")).click();
           Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='btn btn-primary leftPadding15']")).click();
     //   driver.findElement(By.xpath("//button[normalize-space(text()) = 'File Upload']"));

           driver.findElement(By.xpath("id(\"FileSelction\")/div[@class=\"k-widget k-upload k-header k-upload-empty\"]/div[@class=\"k-dropzone\"]/div[@class=\"k-upload-button btn btn-primary\"]")).click();
           CommonMethods.robot(CommonMethods.path);
}

    public boolean isEnabled(String locator){
      //  boolean a=false;
        try{
            driver.findElement(By.xpath(locator));
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean anotherIsEnabled(WebElement agree){
        try{
            driver.findElement(By.xpath("//input[@value= '"+agree+" ']"));
        }catch (Exception e){
            return false;
        }
        return true;
    }



}
