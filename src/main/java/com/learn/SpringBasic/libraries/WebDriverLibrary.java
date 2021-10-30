package com.learn.SpringBasic.libraries;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration // enable this config for the local execution
//@Component
public class WebDriverLibrary {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    @Scope("webdriverscope")
    public WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","/SpringBasicParallelExecution/src/main/resources/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Scope("webdriverscope")
    public WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver","/SpringBasicParallelExecution/src/main/resources/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(firefoxOptions);
    }
}
