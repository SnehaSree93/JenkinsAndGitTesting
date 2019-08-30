package Waiting;

import WebDriverInitialiazation.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting extends BasePage {

    public static WebDriverWait wait;
    public static void staticWait(int milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   public static void webDriverWait(WebElement element,int seconds){

            wait= new WebDriverWait(driver, seconds);
              wait.until(ExpectedConditions.visibilityOf(element));

          }
    }

