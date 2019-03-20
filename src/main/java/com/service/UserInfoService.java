/**
 * UserInfoService.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:39
 */
package com.service;

import com.pojo.UserInfo;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:39
 **/
public interface UserInfoService {
    //注册
    public int registUser(UserInfo userInfo);
    //登陆
    public int loginUser(UserInfo userInfo);

    public int findUserByUsername(String username);
}
