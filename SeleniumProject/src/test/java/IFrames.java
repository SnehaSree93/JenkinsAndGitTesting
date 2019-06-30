/*
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class IFrames extends BaseClass{

    @Test
    public void test(){
        driver.get("https://www.toolsqa.com/iframe-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor exe = (JavascriptExecutor) driver;
        Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
        System.out.println("Number of iframes on the page are " + numberOfFrames);
        exe.executeScript("window.scrollBy(0,200)");
        List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
        System.out.println(iframe.size());
        driver.switchTo().frame("iFrame1");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@class='dt-mobile-menu-icon']")).click();
        WebDriver driver = this.driver.switchTo().parentFrame();
        System.out.println("ParentFrame" +driver.getTitle());
        WebDriver driver1= driver.switchTo().defaultContent();
        System.out.println("Default Content" +driver1);

    }
}
*/
