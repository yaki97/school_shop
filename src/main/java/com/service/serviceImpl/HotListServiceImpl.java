/**
 * HotListServiceImpl.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:27
 */
package com.service.serviceImpl;

import com.dao.HotListDao;
import com.pojo.Goods;
import com.pojo.HotList;
import com.service.HotListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:27
 **/
@Service
public class HotListServiceImpl implements HotListService {
    @Autowired
    private HotListDao hotListDao;
    @Override
    public List<Goods> selectGoodsTop(int topNum) {
        return hotListDao.selectGoodsTop(topNum);
    }

    @Override
    public List<HotList> selectHotListByDate(int number) {
        return hotListDao.selectHotListByDate(number);
    }

    @Override
    public int addHotList(int goodsId, Date dateTime, int sortNumber) {
        return hotListDao.addHotList(goodsId,dateTime,sortNumber);
    }
}
