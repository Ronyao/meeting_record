package com.ronyao.bean;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private Date userLastlogindate;

    private Integer userLogincount;

    private Byte userRight;

    private Byte userWhether;

    private Integer userDepart;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserLastlogindate() {
        return userLastlogindate;
    }

    public void setUserLastlogindate(Date userLastlogindate) {
        this.userLastlogindate = userLastlogindate;
    }

    public Integer getUserLogincount() {
        return userLogincount;
    }

    public void setUserLogincount(Integer userLogincount) {
        this.userLogincount = userLogincount;
    }

    public Byte getUserRight() {
        return userRight;
    }

    public void setUserRight(Byte userRight) {
        this.userRight = userRight;
    }

    public Byte getUserWhether() {
        return userWhether;
    }

    public void setUserWhether(Byte userWhether) {
        this.userWhether = userWhether;
    }

    public Integer getUserDepart() {
        return userDepart;
    }

    public void setUserDepart(Integer userDepart) {
        this.userDepart = userDepart;
    }
}