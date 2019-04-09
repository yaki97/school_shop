/**
 * Carousel.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:08
 */
package com.pojo;

import java.io.Serializable;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:08
 **/
public class Carousel implements Serializable {
    private Integer carouselId;
    private Goods goods;
    private Integer carouselType;
    private Integer sortNumber;

    public Carousel() {
    }

    public Integer getCarouselId() {
        return carouselId;
    }

    public void setCarouselId(Integer carouselId) {
        this.carouselId = carouselId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getCarouselType() {
        return carouselType;
    }

    public void setCarouselType(Integer carouselType) {
        this.carouselType = carouselType;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }
}
