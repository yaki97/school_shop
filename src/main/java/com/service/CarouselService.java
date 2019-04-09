/**
 * CarouselService.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:26
 */
package com.service;

import com.pojo.Carousel;
import com.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:26
 **/
public interface CarouselService {
    public List<Carousel> selectCarouselByType(int carouselType);

    public int addCarousel(int goodsId,int carouselType,int sortNumber);

    public List<Goods> selectGoodsTop(int topNum);

    public int deleteCarouselByType(int carouselType);
}
