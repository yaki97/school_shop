/**
 * carouselController.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:30
 */
package com.controller;

import com.pojo.Carousel;
import com.pojo.Goods;
import com.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:30
 **/
@Controller
@RequestMapping("carouselController")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;

    private List<Carousel> carouselList=null;

    @RequestMapping(value = "/selectCarouselA", method = RequestMethod.POST)
    @ResponseBody
    public List<Carousel> selectCarouselA()
    {
        System.out.println("selectCarouselA");
        carouselList=carouselService.selectCarouselByType(1);
        return carouselList;
    }
    @RequestMapping(value = "/selectCarouselB", method = RequestMethod.POST)
    @ResponseBody
    public List<Carousel> selectCarouselB()
    {
        System.out.println("selectCarouselB");
        carouselList=carouselService.selectCarouselByType(2);
        carouselList=getRandomList(carouselList,20);
        return carouselList;
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test()
    {
        System.out.println("test");
        carouselService.deleteCarouselByType(2);
        List<Goods> goodsList=carouselService.selectGoodsTop(50);
        for (int i=0;i<goodsList.size();i++){
            carouselService.addCarousel(goodsList.get(i).getGoodsId(),2,i+1);
        }
        return "over";
    }


    /**
     * @function:从list中随机抽取若干不重复元素
     *
     * @param paramList:被抽取list
     * @param count:抽取元素的个数
     * @return:由抽取元素组成的新list
     */
    public static List getRandomList(List paramList,int count){
        if(paramList.size()<count){
            return paramList;
        }
        Random random=new Random();
        List<Integer> tempList=new ArrayList<>();
        List<Object> newList=new ArrayList<Object>();
        int temp=0;
        for(int i=0;i<count;i++){
            temp=random.nextInt(paramList.size());//将产生的随机数作为被抽list的索引
            if(!tempList.contains(temp)){
                tempList.add(temp);
                newList.add(paramList.get(temp));
            }
            else{
                i--;
            }
        }
        return newList;
    }

}
