/**
 * UserInfoServiceImpl.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:39
 */
package com.service.serviceImpl;

import com.cache.RedisTemplateUtil;
import com.mapper.UserInfoDao;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:39
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    private RedisTemplateUtil redisTemplateUtil;
    @Override
    public int registUser(UserInfo userInfo) {
        return userInfoDao.registUser(new UserInfo());
    }
    @Override
    public int loginUser(UserInfo userInfo) {
        return userInfoDao.loginUser(new UserInfo());
    }
}
