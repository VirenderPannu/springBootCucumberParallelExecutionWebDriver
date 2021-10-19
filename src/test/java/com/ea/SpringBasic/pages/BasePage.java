package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public abstract class BasePage {

    @Autowired
    private WebDriver webDriver;

    @PostConstruct // Right after constructing the Webdriver bean on IoC container, this calls up
    public void InitPage() { // This method is extended by the derived classes and initiated their respective elements
        PageFactory.initElements(webDriver, this);
    }

    
}
