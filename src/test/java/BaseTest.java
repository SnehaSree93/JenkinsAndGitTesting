package test.java;

import WebDriverInitialiazation.PropertyUtil;


import org.testng.annotations.*;

import java.awt.*;

public class BaseTest extends WebDriverInitialiazation.BasePage {

    methods.LoginPageMethod loginPageMethod;

    @BeforeClass
    public void login() throws InterruptedException, AWTException {

        loginPageMethod= new methods.LoginPageMethod();

       // driver.get(PropertyUtil.getValueForKey("env.baseurl"));
        loginPageMethod.login(PropertyUtil.getValueForKey("username"), PropertyUtil.getValueForKey("password"));

    }


    @AfterClass
    public void logOut(){
        methods.LoginPageMethod.logout();

    }


}
