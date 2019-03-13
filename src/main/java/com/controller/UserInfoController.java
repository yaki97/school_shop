/**
 * UserInfoController.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-03-13 19:48
 */
package com.controller;

import com.service.UserInfoService;
import com.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-03-13 19:48
 **/
@Controller
@RequestMapping(value = "userInfoController")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    public AjaxResult userLogin(String username,String password){
        return AjaxResult.error();
    }
}
