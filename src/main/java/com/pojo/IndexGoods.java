/**
 * IndexGoods.java
 * Copyright 2019 天津亿网通达网络技术有限公司.
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
    private Integer index_goods_id;
    private Integer goods_id;
    private Integer sort_number;

    public IndexGoods() {
    }

    public Integer getIndex_goods_id() {
        return index_goods_id;
    }

    public void setIndex_goods_id(Integer index_goods_id) {
        this.index_goods_id = index_goods_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getSort_number() {
        return sort_number;
    }

    public void setSort_number(Integer sort_number) {
        this.sort_number = sort_number;
    }
}
