package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope("prototype") // one way to mark the class as prototype scope for Webdriver
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // another way to mark the class as prototype scope for Webdriver
public class LoginPage extends BasePage{

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;
    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage ClickLogin() {
        btnLogin.click();
        return new HomePage();
    }

}
