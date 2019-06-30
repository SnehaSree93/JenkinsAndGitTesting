/*
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectDropDown extends BaseClass{
    @Test
    public void selectClass() throws InterruptedException {


        driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        //   WebElement select1 = driver.findElement(By.xpath("//select[@name='country']"));
        Thread.sleep(5000);
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("window.scrollBy(0,200)");
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("INDIA");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        boolean found = false;
        List<WebElement> options = select.getOptions();

        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());

            if (options.get(i).getText().contains("ALGERIA")){
                found = true;
            }
            if (found) {
                System.out.println("value  exists");
            }



        }

    }}
*/
