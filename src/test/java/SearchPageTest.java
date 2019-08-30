package test.java;


import methods.SearchPageMethod;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class SearchPageTest extends BaseTest {

    Logger log = Logger.getLogger(SearchPageTest.class);
    methods.LoginPageMethod loginPageMethod ;
    SearchPageMethod searchPageMethod ;
/*
    @BeforeMethod
    public void login() throws InterruptedException, AWTException {
        loginPageMethod= new LoginPageMethod();
        driver.get(PropertyUtil.getValueForKey("env.baseurl"));
        loginPageMethod.login(PropertyUtil.getValueForKey("username"), PropertyUtil.getValueForKey("password"));

    }*/
    @Test

    public void co_searchFunctionality(){
       searchPageMethod = new SearchPageMethod();
       boolean search= searchPageMethod.getSearchFunctionality();
        Assert.assertTrue(search,"searchSite_Key functionality is failed");
    }

   /* @AfterMethod
    public void quit(){
        driver.quit();
    }
*/
}
