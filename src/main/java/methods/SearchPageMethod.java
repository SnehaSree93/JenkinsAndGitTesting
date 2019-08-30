package methods;

import Waiting.Waiting;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SearchPage;

import java.util.AbstractCollection;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SearchPageMethod extends SearchPage {
 Logger log = Logger.getLogger(SearchPageMethod.class);

    public boolean getSearchFunctionality() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getSearchHeader().click();

        getSearch().sendKeys("*");

        WebElement selectElementGetText = driver.findElement(By.xpath("(//*[text()='Select'])[2]"));

        boolean isDisplayed = selectElementGetText.isDisplayed();
        if (isDisplayed) {
            System.out.println("Search functionality has been completed");
            log.info("-------------------------------------");
        } else {
            System.out.println("Search functionality is not completed");

        }

        return isDisplayed;



    }

}
