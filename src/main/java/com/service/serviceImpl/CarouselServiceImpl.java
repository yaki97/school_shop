/**
 * CarouselServiceImpl.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:27
 */
package com.service.serviceImpl;

import com.dao.CarouselDao;
import com.pojo.Carousel;
import com.pojo.Goods;
import com.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:27
 **/
@Service
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselDao carouselDao;
    @Override
    public List<Carousel> selectCarouselByType(int carouselType) {
        return carouselDao.selectCarouselByType(carouselType);
    }

    @Override
    public int addCarousel(int goodsId, int carouselType, int sortNumber) {
        return carouselDao.addCarousel(goodsId,carouselType,sortNumber);
    }

    @Override
    public List<Goods> selectGoodsTop(int topNum) {
        return carouselDao.selectGoodsTop(topNum);
    }

    @Override
    public int deleteCarouselByType(int carouselType) {
        return carouselDao.deleteCarouselByType(carouselType);
    }
}
