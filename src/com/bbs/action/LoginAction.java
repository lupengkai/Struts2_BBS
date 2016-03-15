package com.bbs.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by tage on 3/15/16.
 */
public class LoginAction extends ActionSupport {

    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String input() {
        return INPUT;
    }

    public String login() {
        return SUCCESS;
    }

}
