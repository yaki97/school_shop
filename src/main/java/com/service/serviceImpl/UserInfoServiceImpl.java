/**
 * UserInfoServiceImpl.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:39
 */
package com.service.serviceImpl;

import com.dao.UserInfoDao;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:39
 **/
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired(required = true)
    private UserInfoDao userInfoDao;
    @Override
    public int registUser(UserInfo userInfo) {
        return userInfoDao.registUser(userInfo);
    }
    @Override
    public UserInfo loginUser(UserInfo userInfo) {
        return userInfoDao.loginUser(userInfo);
    }

    @Override
    public int findUserByUsername(String username) {
        return userInfoDao.findUserByUsername(username);
    }
}
