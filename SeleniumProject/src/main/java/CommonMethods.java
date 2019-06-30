import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CommonMethods {

   public static final String path = System.getProperty("user.dir")+"/src/sample.txt";


   public static  void robot(String filePath) throws AWTException {
      StringSelection ss = new StringSelection(filePath);
      System.out.println("FilePath is " +ss);
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
      Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_V);

      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
   }
}
