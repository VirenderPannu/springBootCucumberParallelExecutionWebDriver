package com.learn.SpringBasic;

import com.learn.SpringBasic.pages.HomePage;
import com.learn.SpringBasic.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@SpringBootTest // To bootstarp the entire IoC container i.e. ApplicationContext
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private HomePage homePage;

    @Autowired
    private LoginPage loginPage;

    @BeforeTest
    protected void setupWebDriver(){
        webDriver.navigate().to(appUrl);
    }

    @Test
    public void testLogin() {
        homePage.ClickLogin();
        loginPage.Login("admin", "password");
        loginPage.ClickLogin();
        homePage.ClickLogoff();
    }

    @Test
    public void testLoginAgain() {
        homePage.ClickLogin();
        loginPage.Login("admin", "password");
        loginPage.ClickLogin();
    }

    @BeforeSuite(alwaysRun = true)
    @Override // Before suite, it will overide the test context so that it can instantiate Bean of WebDriver  
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

    @AfterTest
    protected void tearDownWebDriver(){
        webDriver.quit();
    }

}
