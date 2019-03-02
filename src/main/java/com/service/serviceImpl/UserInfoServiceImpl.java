/**
 * UserInfoServiceImpl.java
 * Copyright 2019 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2019-02-11 14:39
 */
package com.service.serviceImpl;

import com.pojo.UserInfo;
import com.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:39
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public int registUser(UserInfo userInfo) {
        return 0;
    }

    @Override
    public int loginUser(UserInfo userInfo) {
        return 0;
    }
}
