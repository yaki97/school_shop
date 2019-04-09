/**
 * HotListCron.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-03-26 19:51
 */
package com.task;

import com.pojo.Goods;
import com.service.HotListService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-03-26 19:51
 **/
public class HotListCron {
    @Autowired
    private HotListService hotListService;
    public void cron() {
        System.out.println("热销榜更新.......");

        List<Goods> goodsList=hotListService.selectGoodsTop(10);
        for (int i=0;i<goodsList.size();i++){
            hotListService.addHotList(goodsList.get(i).getGoodsId(),new Date(System.currentTimeMillis()),i+1);
        }
    }
}
