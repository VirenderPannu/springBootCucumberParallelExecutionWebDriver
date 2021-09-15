package com.ea.SpringBasic.pages;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // one way to mark the class as prototype scope for Webdriver
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // another way to mark the class as prototype scope for Webdriver
public class MainPage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

    public void PerformLogin() {
        homePage.ClickLogin();
        loginPage.Login("admin", "password");
        loginPage.ClickLogin();
    }
}
