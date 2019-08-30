package test.java;

import WebDriverInitialiazation.BasePage;
import WebDriverInitialiazation.PropertyUtil;
import methods.OdpmpMethod;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ODPMPTest extends ODPMPBaseTest{
    OdpmpMethod odpmpMethod = new OdpmpMethod();
    Logger log = Logger.getLogger(ODPMPTest.class);

    @BeforeMethod

    public void launchLogin() {
        driver.get(PropertyUtil.getValueForKey("odpmp.baseurl"));
        odpmpMethod.odpmpLogin(PropertyUtil.getValueForKey("userName"), PropertyUtil.getValueForKey("pwd"));

    }

    @Test
    public void getPassword() {
        try {

            odpmpMethod.searchSite_Key();
            odpmpMethod.openBrowserOnRightClick(PropertyUtil.getValueForKey("odpmp.search"));
            log.info("Searched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
