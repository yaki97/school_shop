/**
 * UserInfoController.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-03-13 19:48
 */
package com.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.pojo.UserInfo;
import com.service.UserInfoService;
import com.service.serviceImpl.UserInfoServiceImpl;
import com.util.AjaxResult;
import com.util.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-03-13 19:48
 **/
@Controller
@RequestMapping("/userInfoController")
public class UserInfoController {
    @Autowired(required = true)
    private UserInfoService userInfoService;
    @Autowired(required = true)
    private DefaultKaptcha defaultKaptcha;
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult userLogin(@RequestParam(value = "userName",required = false) String userName,
                                @RequestParam(value = "password",required = false) String password){
        System.out.println("userLogin");
        int usernum=userInfoService.loginUser(new UserInfo(userName,password));
        if(usernum==1){
            return AjaxResult.success();
        }
        else if(usernum<1){
            return AjaxResult.error("用户不存在");
        }
        else{
            return AjaxResult.error("密码错误");
        }
    }
    @RequestMapping(value = "/userRegist",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult userRegist(@RequestParam(value = "userName",required = false) String userName,
                                 @RequestParam(value = "password",required = false) String password,
                                 @RequestParam(value = "phoneNumber",required = false) String phoneNumber,
                                 @RequestParam(value = "vrifyCode",required = false) String vrifyCode,
                                 HttpServletRequest httpServletRequest,
                                 HttpServletResponse httpServletResponse)throws Exception{
        System.out.println("userRegist");
        System.out.println(userName+";"+password+";"+phoneNumber);
        String captchaId="";
        try {
            captchaId = (String) httpServletRequest.getSession().getAttribute("vrifyCode");
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        System.out.println("Session  vrifyCode "+captchaId+" form vrifyCode "+vrifyCode);
        if (!captchaId.equals(vrifyCode)) {
            return AjaxResult.error("验证码错误");
        }
        else {
            int usernum=userInfoService.findUserByUsername(userName);
            System.out.println(usernum);
            if(usernum>0){
                return AjaxResult.error("用户已存在！");
            }else{
                userInfoService.registUser(new UserInfo(userName,password,phoneNumber));
                return AjaxResult.success();
            }
        }
    }
    /**
     * 获取验证码 的 请求路径
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText);
            String sss=(String)httpServletRequest.getSession().getAttribute("vrifyCode");
            System.out.println(createText+";"+sss);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult test(@RequestParam(value = "userName",required = false)String userName)
    {
        System.out.println("test");
        System.out.println(userName);
        return AjaxResult.success();
    }
}
