package com.learn.SpringBasic.steps;

import com.learn.SpringBasic.models.TestUserDetails;
import com.learn.SpringBasic.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //var data = table.asList();
        loginPage.Login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }
}
