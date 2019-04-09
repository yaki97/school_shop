/**
 * UserInfoDao.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:31
 */
package com.dao;

import com.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:31
 **/
@Repository("userInfoDao")
public interface UserInfoDao {
    //注册
    public int registUser(UserInfo userInfo);
    //登陆
    public UserInfo loginUser(UserInfo userInfo);

    public int findUserByUsername(String username);

    public List<UserInfo> findUserByType(@Param("userType") int userType,@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize);

    public List<UserInfo> findAllUserByType(@Param("userType") int userType);
}
