package com.ea.SpringBasic.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // one way to mark the class as prototype scope
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // another way to mark the class as prototype scope for Webdriver
public class HomePage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Log off")
    public WebElement lnkLogOff;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using="Employee Details")
    WebElement lnkEmployeeDetails;

    public LoginPage ClickLogin() {
        lnkLogin.click();
        return new LoginPage();
    }

    public HomePage ClickLogoff() {
        lnkLogOff.click();
        return new HomePage();
    }

    public void ClickEmployeeList() {lnkEmployeeList.click();}

    public boolean isEmployeeDetailsExist() {return lnkEmployeeDetails.isDisplayed();}

}
