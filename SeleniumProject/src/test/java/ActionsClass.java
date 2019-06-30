/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends BaseClass{
    @Test
    public void actionsText() throws InterruptedException {
        Actions action= new Actions(driver);
        driver.get("https://www.softwaretestingmaterial.com");
        //sleep for 3secs to load the page
        Thread.sleep(3000);
        //SCROLL DOWN

        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        //SCROLL UP
        action.sendKeys(Keys.PAGE_UP).build().perform();
        //driver.close();
    }
    @Test
    public void rightClick() throws InterruptedException {
        Actions actions= new Actions(driver);
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.cssSelector(".context-menu-one"));
        actions.contextClick(element).perform();
        Thread.sleep(3000);

    }
}
*/
