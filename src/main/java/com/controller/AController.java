/**
 * AController.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-03-07 22:54
 */
package com.controller;

import com.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-03-07 22:54
 **/
@Controller
@RequestMapping(value = "AController",method = RequestMethod.POST)
public class AController {
    @Autowired
    private AService aService;

    public String shopping(String userId,String goodsId){
        Thread t1=new Thread(new Runnable() {
            public void run() {
                synchronized (this){
                    if(5>0){
                        try {
                            Thread.sleep(100); //休息100毫秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("商品库存不足");
                    }

                }
            }
        });
        t1.start();
        return "";
    };
}
