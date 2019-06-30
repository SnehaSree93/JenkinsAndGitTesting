/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MultipleTabs extends BaseClass{
    WebDriverWait wait;



    @Test
    public void multiple() throws InterruptedException {
        driver.navigate().to("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
         WebElement switchTo=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
       */
/* Actions actions = new Actions(driver);
        actions.moveToElement(switchTo).build();
        actions.perform();*//*

     */
/*   setWait();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Windows']"))));*//*

     //   driver.findElement(By.xpath("//a[text()='Windows']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
        Thread.sleep(2000);
        //String parentWindow=driver.getWindowHandle();
        ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+   "\t");
        Thread.sleep(2000);


    }
    public void setWait(){
         wait = new WebDriverWait(driver, 10);
    }
}
*/
