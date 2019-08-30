package test.java;



import methods.ReportingPageMethod;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;


public class ReportingPageTest extends BaseTest {
  methods.LoginPageMethod loginPageMethod ;
    ReportingPageMethod reportingPageMethod ;
    Logger log = Logger.getLogger(ReportingPageTest.class);

  /*  @BeforeMethod
    public void login() {
       loginPageMethod = new LoginPageMethod();
        driver.get(PropertyUtil.getValueForKey("env.baseurl"));
        loginPageMethod.login(PropertyUtil.getValueForKey("username"), PropertyUtil.getValueForKey("password"));


    }*/

    @Test

    public void advancedReporting_LM() throws InterruptedException {
        reportingPageMethod = new ReportingPageMethod();

        reportingPageMethod.navigationPath();
        log.info("Navigated to menus option of reporting page");
        reportingPageMethod.navigationMenu();
        boolean b = reportingPageMethod.navigateAudienceUserAssociationSummary();
        Assert.assertTrue(b,"Report is not displayed");



    }


/*    @AfterMethod

    public void quit(){
        driver.quit();
    }*/
}
