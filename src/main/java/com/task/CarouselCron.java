/**
 * CarouselCron.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 17:54
 */
package com.task;

import com.pojo.Goods;
import com.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 17:54
 **/
public class CarouselCron {
    @Autowired
    private CarouselService carouselService;
    public void cron() {
        System.out.println("轮播图更新.......");

        carouselService.deleteCarouselByType(2);
        List<Goods> goodsList=carouselService.selectGoodsTop(50);
        for (int i=0;i<goodsList.size();i++){
            carouselService.addCarousel(goodsList.get(i).getGoodsId(),2,i+1);
        }
    }
}
