package com.ea.SpringBasic.pages;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public abstract class BasePage {

    @Autowired
    private WebDriver webDriver;

    @PostConstruct // Right after constructing the Webdriver bean on IoC container, this calls up
    public void InitPage() { // This method is extended by the derived classes and initiated their respective elements
        PageFactory.initElements(webDriver, this);
    }

    
}
