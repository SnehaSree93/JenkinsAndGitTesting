package methods;

import Common.CJavaScriptExecutor;
import Waiting.Waiting;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ReportingPage;

import java.sql.Time;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;



public class ReportingPageMethod extends ReportingPage {



    WebDriverWait wait = new WebDriverWait(driver,10 );
    Logger log = Logger.getLogger(ReportingPageMethod.class);

    ReportingPage reportingPage = new ReportingPage();

    public void navigationPath(){


        wait.until(ExpectedConditions.visibilityOf(selfHeader));
       selfHeader.click();
       wait.until(ExpectedConditions.visibilityOf(reporting));
       reporting.click();
       wait.until(ExpectedConditions.visibilityOf(advancedReporting));
       advancedReporting.click();




    }

    public void navigationMenu() throws InterruptedException {

        System.out.println(" ....:Trying to switch to frame : ---");

        WebElement frame =driver.findElement(By.id("productPillarFrame"));
        CJavaScriptExecutor.highLighElement(frame);

        driver.switchTo().frame("productPillarFrame");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        System.out.println("Switchching to frame");
        log.info("Switching to frame");
        WebElement folderContent = driver.findElement(By.id("foldersPodContent"));
        wait.until(ExpectedConditions.visibilityOf(folderContent));
        CJavaScriptExecutor.highLighElement(folderContent);
        System.out.println("Switched to folder content");

        WebElement siteKeyExpansion=driver.findElement(By.id("handler2"));
        wait.until(ExpectedConditions.visibilityOf(siteKeyExpansion));


        CJavaScriptExecutor.highLighElement(siteKeyExpansion);
        System.out.println("Switched to siteKey");

        siteKeyExpansion.click();
        System.out.println("TestCase Passed");

        WebElement reportsExpansion= driver.findElement(By.id("handler8"));
        wait.until(ExpectedConditions.visibilityOf(reportsExpansion));
        reportsExpansion.click();
        System.out.println("reports clicked");
        Waiting.staticWait(2000);
       WebElement audience=driver.findElement(By.xpath("//*[text()='Audience']"));
        wait.until(ExpectedConditions.visibilityOf(audience));
        audience.click();


        WebElement audienceAssociationSummary=driver.findElement(By.xpath("//*[text()='Audience User Association Summary']"));
        wait.until(ExpectedConditions.visibilityOf(audienceAssociationSummary));
        audienceAssociationSummary.click();
        Waiting.staticWait(10000);


        }


        public boolean navigateAudienceUserAssociationSummary(){


            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            WebElement inputControls=driver.findElement(By.id("inputControls"));
            CJavaScriptExecutor.highLighElement(inputControls);
            Waiting.staticWait(5000);
            WebElement audiName=driver.findElement(By.id("pAudNames"));
            CJavaScriptExecutor.highLighElement(audiName);

            WebElement audienceReport=driver.findElement(By.xpath("//*[text()='ASP Audience']"));
            audienceReport.click();
            log.info("Clicked on ASP Audience");
            WebElement apply=driver.findElement(By.xpath("//span[text()='Apply']"));
            wait.until(ExpectedConditions.visibilityOf(apply));
            apply.click();
            log.info("Clicked on apply");

            WebElement Ok=    driver.findElement(By.xpath("//button[@id='ok']"));
            wait.until(ExpectedConditions.visibilityOf(Ok));
            Ok.click();
            log.info("CLicked on OK");

            boolean text = driver.findElement(By.xpath("//span[text()='AUDIENCE USER ASSOCIATION']")).isDisplayed();
            log.info("Text has been displayed");
            return text;
        }
}
