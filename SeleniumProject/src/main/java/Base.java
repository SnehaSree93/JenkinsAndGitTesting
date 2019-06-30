import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    WebDriver driver = null;

    public void LaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "./server/chromedriver.exe");
        driver = new ChromeDriver();

    }
}