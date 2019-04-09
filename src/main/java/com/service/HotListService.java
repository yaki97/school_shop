/**
 * HotListService.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:27
 */
package com.service;

import com.pojo.Goods;
import com.pojo.HotList;

import java.util.Date;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:27
 **/
public interface HotListService {
    public List<Goods> selectGoodsTop(int topNum);

    public List<HotList> selectHotListByDate(int number);

    public int addHotList(int goodsId, Date dateTime, int sortNumber);
}
