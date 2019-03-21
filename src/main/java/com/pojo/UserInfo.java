/**
 * UserInfo.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:22
 */
package com.pojo;

import java.io.Serializable;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:22
 **/
public class UserInfo implements Serializable {
    private Integer userId;
    private String userName;
    private String realName;
    private String password;
    private String phoneNumber;
    private String contactAddress;
    private Integer userType;
    private Integer status;

    public UserInfo() {
    }

    public UserInfo(String userName,Integer userType) {
        this.userName = userName;
        this.userType = userType;
    }

    public UserInfo(String userName, String password, String phoneNumber, Integer userType) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }

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
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
