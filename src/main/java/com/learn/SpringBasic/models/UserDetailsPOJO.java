package com.learn.SpringBasic.models;

public class UserDetailsPOJO {

    private String username;
    private String password;

    public UserDetailsPOJO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
