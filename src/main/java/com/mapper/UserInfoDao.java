/**
 * UserInfoDao.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:31
 */
package com.mapper;

import com.pojo.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:31
 **/
@Repository
public interface UserInfoDao {
    //注册
    public int registUser(UserInfo userInfo);
    //登陆
    public int loginUser(UserInfo userInfo);
}
