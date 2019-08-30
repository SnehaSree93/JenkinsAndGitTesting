package pages;

import Waiting.Waiting;
import WebDriverInitialiazation.BasePage;
import methods.LoginPageMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id="BodyContent_MainContent_MainContentPlaceHolder_UserName")
    public WebElement userName;

    @FindBy(id="BodyContent_MainContent_MainContentPlaceHolder_Password")
    public WebElement password;

    @FindBy(id="BodyContent_MainContent_MainContentPlaceHolder_LoginButton")
    public WebElement signIn;


    public  LoginPage(){
        PageFactory.initElements(driver, this);
    }


    public WebElement getiAgree() {
        return iAgree;
    }

    public void setiAgree(WebElement iAgree) {
        this.iAgree = iAgree;
    }

    @FindBy(xpath = "//input[@value='I Agree']")
    public WebElement iAgree;


    public WebElement getUserName() {
        return userName;
    }

    public void setUserName(WebElement userName) {
        this.userName = userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public void setSignIn(WebElement signIn) {
        this.signIn = signIn;
    }

}
