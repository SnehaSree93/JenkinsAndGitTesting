package pages;

import WebDriverInitialiazation.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OdpmpPage extends BasePage {

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    public WebElement getSearch() {
        return search;
    }

    @FindBy(id="FRHost_Search")
    public WebElement search;

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

    public WebElement getLogin() {
        return login;
    }

    public void setLogin(WebElement login) {
        this.login = login;
    }

    @FindBy(xpath = "//em[contains(text(),'Login')]")
    public WebElement login;


    public OdpmpPage(){
        PageFactory.initElements(driver, this);
    }
}
