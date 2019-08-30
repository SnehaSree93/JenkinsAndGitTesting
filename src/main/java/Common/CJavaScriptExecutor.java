package Common;

import WebDriverInitialiazation.BasePage;
import WebDriverInitialiazation.PropertyUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CJavaScriptExecutor extends BasePage {
    private  static  JavascriptExecutor js = (JavascriptExecutor) driver;

    public static  void highLighElement(WebElement element){
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

    public static void  scrollDown(String value){
        js.executeScript(value);
    }
}
