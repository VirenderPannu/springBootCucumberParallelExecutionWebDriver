package com.ea.SpringBasic.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/java/com/ea/SpringBasic/features"},
        //plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        //plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json"},
        //tags = {"@currentTest"},
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = "com.ea.SpringBasic.steps"
        //monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Allows to execute cucumber tests scenarios in parallel
    // In case of false - it will show error NoSuchSession Session ID is null
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
