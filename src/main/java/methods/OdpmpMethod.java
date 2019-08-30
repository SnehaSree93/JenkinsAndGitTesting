package methods;

import Common.CJavaScriptExecutor;
import Waiting.Waiting;
import WebDriverInitialiazation.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OdpmpPage;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.TooManyListenersException;
import java.util.concurrent.TimeUnit;

public class OdpmpMethod extends OdpmpPage {

    OdpmpPage odpmpPage;
    Waiting waiting = new Waiting();


    public void odpmpLogin(String username, String pwd) {
        odpmpPage = new OdpmpPage();
        odpmpPage.getUserName().sendKeys(username);
        odpmpPage.getPassword().sendKeys(pwd);
        odpmpPage.getLogin().click();
    }


    public void searchSite_Key() throws AWTException, IOException, UnsupportedFlavorException {

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.id("FRHost_Search")).sendKeys(PropertyUtil.getValueForKey("odpmp.search"));
        driver.findElement(By.id("FRHost_Search")).sendKeys(Keys.ENTER);
       /* Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
        /**Text copied to clipboard**/
        //   WebElement getPassword=driver.findElement(By.xpath("//div[@title='Copy password to clipboard' or text()='psadmin']"));
      //  Waiting.staticWait(3000);


        WebElement copy=driver.findElement(By.xpath("//div[@id=\"retrievepass0\"]"));
        Waiting.webDriverWait(copy,30);
        copy.click();
        CJavaScriptExecutor.highLighElement(copy);

        System.out.println("Copy " +copy.getText());


        String passwordIs =  (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        System.out.println("Password is:" +passwordIs);
     /*   WebElement  clickOnPsAdmin= driver.findElement(By.xpath("//span[text()='psadmin']"));
        clickOnPsAdmin.click();
        Waiting.staticWait(3000);
        WebElement clickOnOk=driver.findElement(By.xpath("//em[text()='OK']"));
        clickOnOk.click();
        Waiting.staticWait(4000);
        WebElement copyToClipboard = driver.findElement(By.xpath("//span[text()='psadmin']//following::div//div[@title='Copy password to clipboard']"));
        CJavaScriptExecutor.highLighElement(copyToClipboard);
        System.out.println("------" +copyToClipboard.getText());*/
      /*  if(copyToClipboard.isDisplayed()){
            copyToClipboard.click();
        }
        else{
            CJavaScriptExecutor.scrollDown("window.scrollBy(0,100)");
            System.out.println(copyToClipboard.isEnabled());
            System.out.println(copyToClipboard.isDisplayed());
            copyToClipboard.click();
            System.out.println(copyToClipboard.getText());
        }
     *//*   *//**//**Extracting password from clipboard**//**//*
        String passwordIs =  (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        System.out.println("Password is:" +passwordIs);
        Waiting.staticWait(30);

        //Webelement we getting is psadmin

        System.out.println(copyToClipboard.isEnabled());
        System.out.println(copyToClipboard.isDisplayed());
        copyToClipboard.click();
        System.out.println(copyToClipboard.getText());*//*

        //div[@title='Copy password to clipboard']//preceding::div//a//span[text()='psadmin']

    }
*/


    }
    public void openBrowserOnRightClick(String site_key){

        WebElement img_Icon=driver.findElement(By.xpath("//span[text()='"+site_key+"']/../following::span[@divtype='popUp' and @class='icon-open-connection iconlf']"));
        CJavaScriptExecutor.highLighElement(img_Icon);
        img_Icon.click();
        //span[text()='UDP_ACS_Stage']/../following::span[@divtype='popUp' and @class='icon-open-connection iconlf']
    }
}