package com.ea.SpringBasic.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hooks {

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Before // Same as TestNG's @BeforeMethod
    public void InitializeTest() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(appUrl);
        webDriver.navigate().to(appUrl);
    }

    @After  // Same as TestNG's @AfterMethod
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        webDriver.quit();
    }
}
