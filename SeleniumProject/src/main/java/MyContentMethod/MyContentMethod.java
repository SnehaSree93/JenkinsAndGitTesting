package MyContentMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyContentMethod  {
 WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'My Content')]")
    public WebElement myContent;

    public void myContent(){
        myContent.click();
    }
    public MyContentMethod(){
        PageFactory.initElements(driver, this);
    }
}
