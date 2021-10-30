package com.learn.SpringBasic.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/java/com/learn/SpringBasic/features"},
        // tags = {"@smokeTest", "@regressionTest"},
        // Below plugin is create json report and later it will be parsed into html by maven-cucumber-reporting plugin
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = "com.learn.SpringBasic.steps"
        //monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests { // Cucumber runner with extending TestNG cucumber Tests class
    // Allows to execute cucumber tests scenarios in parallel
    // In case of false - it will show error NoSuchSession Session ID is null
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
