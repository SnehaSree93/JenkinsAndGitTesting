package methods;

import Waiting.Waiting;
import WebDriverInitialiazation.BasePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageMethod extends LoginPage {
  public static WebDriverWait wait = new WebDriverWait(driver, 30);
 public static Logger log = Logger.getLogger(LoginPageMethod.class);

    LoginPage loginPage;
    public void login(String username, String password){
        loginPage=new LoginPageMethod();
        wait.until(ExpectedConditions.visibilityOf(getUserName()));
        loginPage.getUserName().sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(getPassword()));
        Waiting.staticWait(2000);
        loginPage.getPassword().sendKeys(password);
        loginPage.getSignIn().click();
        Waiting.staticWait(5000);
        if(isEnabled("//input[@value='I Agree']"))
        {
            driver.findElement(By.xpath("//input[@value='I Agree']")).click();
        }
    }
    public boolean isEnabled(String locator){
        try{
            driver.findElement(By.xpath(locator));
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public static void logout(){
        log.info("Navigate to logout button");
        driver.switchTo().parentFrame();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement self_header=driver.findElement(By.id("self_header"));
        log.info("Clicked on self header");
        wait.until(ExpectedConditions.visibilityOf(self_header));
        self_header.click();
        log.info("Self Header is clicked");
        WebElement sign_out=driver.findElement(By.xpath("//span[text()='Signout']"));
        wait.until(ExpectedConditions.visibilityOf(sign_out));
        log.info("Clicked on Sign Out");
        sign_out.click();
    }


}