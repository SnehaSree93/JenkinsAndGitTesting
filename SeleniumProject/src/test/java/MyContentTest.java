/*
import MyContentMethod.MyContentMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyContentTest extends BaseClass {

     MyContentMethod myContentMethod = null;

     public void clickMyContentPage(){
         driver.findElement(By.xpath("//span[contains(text(),'My Content')]")).click();

     }
     @BeforeMethod

    public void launch(){
         driver.manage().window().maximize();
        driver.navigate().to("http://saya.incois.gov.in");
        driver.findElement(By.id("txtActorUserName")).sendKeys("gaiandemo");
        driver.findElement(By.id("txtActorPassword")).sendKeys("gaian@123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void clickMyContent() {
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             clickMyContentPage();
            WebElement table=driver.findElement(By.xpath("//table[@class='table table-bordered']//tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount=rows.size();
        for(int i=0; i < rowCount; i++){
            List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
            int columnCount=columns.size();
            for(int j =0; j< columnCount; i++){
                String cellText=columns.get(j).getText();
                System.out.println(cellText);
            }
        }


    }
}
*/
