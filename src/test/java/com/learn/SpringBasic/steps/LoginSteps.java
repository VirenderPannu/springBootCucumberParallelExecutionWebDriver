package com.learn.SpringBasic.steps;

import com.learn.SpringBasic.models.TestUserDetails;
import com.learn.SpringBasic.models.UserDetailsPOJO;
import com.learn.SpringBasic.pages.HomePage;
import com.learn.SpringBasic.pages.LoginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {
        homePage.ClickLogin();
        //Scenario scope
        testUserDetails.setUserDetails(new UserDetailsPOJO("admin", "password"));
    }

    @And("I click login button")
    public void iClickLoginButton() throws InterruptedException {
        loginPage.ClickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExist() , true);
    }

    @And("I click logout link")
    public void iClickLogoutLink() {
        homePage.ClickLogoff();
    }
}
