/**
 * HotListController.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 18:15
 */
package com.controller;

import com.pojo.Goods;
import com.pojo.HotList;
import com.service.HotListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 18:15
 **/
@Controller
@RequestMapping("hotListController")
public class HotListController {
    @Autowired
    private HotListService hotListService;

    private List<HotList> hotListList=null;

    @RequestMapping(value = "/selectHotListByDate", method = RequestMethod.POST)
    @ResponseBody
    public List<HotList> selectHotListByDate()
    {
        System.out.println("selectHotListByDate");
        hotListList=hotListService.selectHotListByDate(10);
        System.out.println(hotListList.size());
        return hotListList;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test()
    {
        System.out.println("test");
        List<Goods> goodsList=hotListService.selectGoodsTop(10);
        System.out.println(goodsList.size());
        for (int i=0;i<goodsList.size();i++){
            hotListService.addHotList(goodsList.get(i).getGoodsId(),new Date(),i+1);
        }
        return "over";
    }
}
