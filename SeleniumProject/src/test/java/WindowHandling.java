/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    @Test

    public void windowHandles() {
        System.setProperty("webdriver.chrome.driver", "./server/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.naukri.com/");
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window is" + parentWindow);
        Set<String> set = driver.getWindowHandles();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
if(!parentWindow.equalsIgnoreCase(childWindow)){
           ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(windows.get(2));
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
            driver.manage().window().maximize();
           WebElement element= driver.findElement(By.xpath("//div[text()='Search Openings']"));
        System.out.println(element.getText());

            }


        }
    }
}

*/
