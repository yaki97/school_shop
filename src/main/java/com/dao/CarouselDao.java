/**
 * CarouselDao.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:17
 */
package com.dao;

import com.pojo.Carousel;
import com.pojo.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:17
 **/
@Repository
public interface CarouselDao {
    public List<Carousel> selectCarouselByType(int carouselType);

    public int addCarousel(@Param("goodsId") int goodsId,@Param("carouselType") int carouselType,@Param("sortNumber") int sortNumber);

    public List<Goods> selectGoodsTop(@Param("topNum") int topNum);

    public int deleteCarouselByType(int carouselType);
}
