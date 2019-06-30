/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UploadFile {
    WebDriver driver=null;
@Test

        public void hello() throws AWTException, IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
    driver  = new ChromeDriver();
    driver.get("http://www.indeed.co.in");
    driver.findElement(By.xpath("//a[text()='Post your resume']")).click();
    driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();



    //Store the location of the file in clipboard
    //Clipboard
    StringSelection strSel = new StringSelection("C:\\Users\\sajambula\\Documents\\sample");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);

    //Create an object for robot class
    Robot robot = new Robot();
    //Control key in the keyboard
    //Ctrl+V
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);


   Dimension d1 = new Dimension(1200,1800);
    BufferedImage bufImage = robot.createScreenCapture(new Rectangle(d1));
    File f = new File("indeedScreenshot.jpg");
    ImageIO.write(bufImage,"jpg", f);
}

}
*/
