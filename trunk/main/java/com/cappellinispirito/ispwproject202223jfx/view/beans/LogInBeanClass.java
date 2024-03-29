package com.cappellinispirito.ispwproject202223jfx.view.beans;

import com.cappellinispirito.ispwproject202223jfx.model.beansInterface.LogInBean;

public class LogInBeanClass implements LogInBean {
    private String username;
    private String password;
    private boolean isPremium;
    private Boolean isCredentialsCorrect;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String user) {
        username = user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String pwd) {
        password = pwd;
    }

    @Override
    public Boolean getIsCredentialsCorrect() {
        return isCredentialsCorrect;
    }

    @Override
    public void setIsCredentialsCorrect(Boolean bool) {
        isCredentialsCorrect = bool;
    }

    @Override
    public boolean getIsPremium() {
        return isPremium;
    }

    @Override
    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }
}
