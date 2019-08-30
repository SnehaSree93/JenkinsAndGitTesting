package main.java.methods;

import Common.CJavaScriptExecutor;
import Common.CommonConstants;
import Common.CommonMethods;
import WebDriverInitialiazation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LearningActivities extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, 180);
private static      Logger logger =  Logger.getLogger(LearningActivities.class);

    @FindBy(xpath = "//i[@class='fa fa-admin-custom']")
    public WebElement adminIncon;

    @FindBy(xpath = "//span[text()='Product Administration']")
    public WebElement productAdministration;

    @FindBy(xpath = "//span[text()='Learning']")
    public WebElement learning;

    @FindBy(xpath = "//span[text()='Learning Activities']")
    public WebElement learningActivities;

    @FindBy(id="fileUpload_Button")
    public WebElement fileUploadButton;

    @FindBy(xpath = "//div[(text() = 'Browse...' or . = 'Browse...')]")
    public WebElement browse;

    @FindBy(xpath = "//button[text()='Upload Files']")
    public WebElement uploadFilesButton;

    @FindBy(xpath = "//button[@title = 'Next' and (text() = 'Next' or . = 'Next')]")
    public WebElement clickOnFileUploadNext;

    @FindBy(id="txt-activityName")
    public WebElement activityName;

    @FindBy(name="txt-activityCode")
    public WebElement activityCode;

    @FindBy(xpath = "//button[@title='Upload' and text()='Upload']")
    public WebElement upload;

    @FindBy(xpath = "//button[@title='View In Progress']")
    public WebElement viewInProgress;

    public LearningActivities(){
        PageFactory.initElements(driver, this);
    }

    public void navigateLearningActivities(){
        adminIncon.click();
        wait.until(ExpectedConditions.visibilityOf(productAdministration));
        productAdministration.click();
        wait.until(ExpectedConditions.visibilityOf(learning));
        learning.click();
        wait.until(ExpectedConditions.visibilityOf(learningActivities));
        learningActivities.click();
    }
    public void uploadFile() throws InterruptedException, AWTException {
        driver.switchTo().frame("productPillarFrame");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(fileUploadButton));
        Thread.sleep(5000);
        fileUploadButton.click();
        WebDriver listActivitiesFrame = driver.switchTo().frame("listActivitiesFrame");
        System.out.println("---"+listActivitiesFrame.getTitle());
        CJavaScriptExecutor.highLighElement(browse);
        wait.until(ExpectedConditions.elementToBeClickable(browse));
        browse.click();
        Thread.sleep(3000);
     //  JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript(CommonConstants.uploadFile);*/
      //  executor.executeScript("'arguments[0].style = ""; arguments[0].style.display = "block"; arguments[0].style.visibility = "visible";', file_input)

        //  executor.executeScript("")
       /* WebElement browse= driver.findElement(By.xpath("(//span[text()='Browse...'])[1]"));
        Actions actions= new Actions(driver);
        actions.
       // actions.moveToElement(browse).build().perform();
        actions.sendKeys(browse,CommonConstants.uploadFile).build().perform();*/
/*
      wait.until(ExpectedConditions.visibilityOf(browse));
       browse.sendKeys(CommonConstants.uploadFile);*/
        System.out.println(CommonConstants.uploadFile);
        CommonMethods.uploadFile(CommonConstants.uploadFile);

        Thread.sleep(3000);
        uploadFilesButton.click();

         Thread.sleep(10000);
        clickOnFileUploadNext.click();
        Thread.sleep(3000);
    }


    public boolean clickNextIsEnabled() throws InterruptedException {
        boolean enabled = clickOnFileUploadNext.isEnabled();
        if(enabled){
            Actions actions = new Actions(driver);
            actions.doubleClick(clickOnFileUploadNext);
            Thread.sleep(3000);
        }
        return enabled;
    }

    public String getActivityCode() throws InterruptedException {

        String aName="ActivitiyName"+CommonMethods.getCurrentTimeStamp();
        activityName.sendKeys(aName);
        String aCode="ActivityCode"+CommonMethods.getCurrentTimeStamp();
        activityCode.sendKeys(aCode);
        Thread.sleep(10000);
        clickOnFileUploadNext.click();
        Thread.sleep(5000);

        upload.click();
        wait.until(ExpectedConditions.elementToBeClickable(viewInProgress));
        viewInProgress.click();
        Thread.sleep(3000);
        return aCode;
    }

    public void aNameVisibleOrNot1(String aCode) throws InterruptedException
    {
        Select select=new Select(driver.findElement(By.xpath("//select[@ng-model='selected']")));
        Thread.sleep(10000);
        select.selectByVisibleText("View In Progress");


     //      WebElement aNameValue=driver.findElement(By.xpath("//div[contains(text(),'"+aCode+"')]"));
             //System.out.println("--Aname" +aNameValue);
            if(wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//div[contains(text(),'"+aCode+"')]")))))
            // if (wait.until(ExpectedConditions.invisibilityOf(aNameValue)))
            {
                WebElement aNameValue=driver.findElement(By.xpath("//div[contains(text(),'"+aCode+"')]"));
                System.out.println("---");
                select.selectByVisibleText("View Items in Staging");
                if(aNameValue.isDisplayed()){
                    driver.findElement(By.xpath("//div[@title='"+aCode+"']//preceding::td//*[@type='checkbox']")).click();
                    Thread.sleep(3000);

                    System.out.println("---gjhgfh");
                }
            }else {
                 System.out.println("///");

             }
        }





       public boolean  aNameVisibleOrNot(String aCode) throws InterruptedException {
           Select select=new Select(driver.findElement(By.xpath("//select[@ng-model='selected']")));
           select.selectByVisibleText("View In Progress");

        //   WebElement aCodeInProgess =driver.findElement(By.xpath("//*[@title='"+aCode+"' and //span[@title='In Progress']]"));


           //boolean displayed= aCodeInProgess.isDisplayed();

           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@title='"+aCode+"' and //span[@title='In Progress']]")));
           select.selectByVisibleText("View Items in Staging");
           WebElement aCodeValueInStaging =driver.findElement(By.xpath("//*[@title='"+aCode+"' and //span[@title='In Staging']]"));
           boolean displayedStaging =aCodeValueInStaging.isDisplayed();
           System.out.println("staging" +aCodeValueInStaging);

           WebElement checkBox=driver.findElement(By.xpath("//div[@title='"+aCode+"']//../preceding-sibling::td//input[@type='checkbox']"));
           System.out.println("CheckBox" +checkBox.getText());

           wait.until(ExpectedConditions.elementToBeClickable(checkBox));
               checkBox.click();
               Thread.sleep(5000);
              return displayedStaging;
       }

       public static void close(){
        driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
       }


    }


