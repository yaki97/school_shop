/**
 * HotListDao.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:15
 */
package com.dao;

import com.pojo.Goods;
import com.pojo.HotList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:15
 **/
@Repository
public interface HotListDao {
    public List<Goods> selectGoodsTop(@Param("topNum") int topNum);

    public List<HotList> selectHotListByDate(@Param("number") int number);

    public int addHotList(@Param("goodsId") int goodsId, @Param("dateTime") Date dateTime, @Param("sortNumber") int sortNumber);

}
