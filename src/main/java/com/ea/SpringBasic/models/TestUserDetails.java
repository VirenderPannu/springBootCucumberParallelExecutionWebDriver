package com.ea.SpringBasic.models;


import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class TestUserDetails {

    private UserDetailsPOJO userDetails;

    public UserDetailsPOJO getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetailsPOJO userDetails) {
        this.userDetails = userDetails;
    }
}
