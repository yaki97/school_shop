/**
 * IndexGoods.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-02-11 14:22
 */
package com.pojo;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-02-11 14:22
 **/
public class IndexGoods {
    private Integer indexGoodsId;
    private Integer goodsId;
    private Integer sortNumber;

    public IndexGoods() {
    }

    public Integer getIndexGoodsId() {
        return indexGoodsId;
    }

    public void setIndexGoodsId(Integer indexGoodsId) {
        this.indexGoodsId = indexGoodsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }
}
