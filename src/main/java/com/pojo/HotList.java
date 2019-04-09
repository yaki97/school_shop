/**
 * HotList.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-04-01 11:09
 */
package com.pojo;

import java.io.Serializable;
import java.util.Date;


/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-04-01 11:09
 **/
public class HotList implements Serializable {
    private Integer hotListId;
    private Goods goods;
    private Date dateTime;
    private Integer sortNumber;

    public HotList() {
    }

    public Integer getHotListId() {
        return hotListId;
    }

    public void setHotListId(Integer hotListId) {
        this.hotListId = hotListId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }
}
