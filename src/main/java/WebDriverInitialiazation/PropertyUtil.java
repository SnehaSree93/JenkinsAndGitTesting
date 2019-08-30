package WebDriverInitialiazation;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertyUtil  {

    public static ResourceBundle bundle = ResourceBundle.getBundle("portal");
    public static String baseurl="";
    public static String props;



    public static String getValueForKey(String key){
        baseurl=bundle.getString(key);
        return baseurl;
    }

}
