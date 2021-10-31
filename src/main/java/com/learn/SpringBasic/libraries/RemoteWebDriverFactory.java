package com.learn.SpringBasic.libraries;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // enable this config for the local execution
//@Component
public class RemoteWebDriverFactory {
    String Node = "http://http://192.168.1.13:4444";

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    @Scope("webdriverscope")
    public WebDriver getRemoteWebDriverForChrome() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        return new RemoteWebDriver(new URL(Node), caps);
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Scope("webdriverscope")
    public WebDriver getRemoteWebDriverForFirefox() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        return new RemoteWebDriver(new URL(Node), caps);
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "safari")
    @Scope("webdriverscope")
    public WebDriver getRemoteWebDriverForSafari() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("safari");
        return new RemoteWebDriver(new URL(Node), caps);
    }
}
