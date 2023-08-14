package com.xja.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Goods{
    private Integer goodsId;
    private String goodsName;
    private Double goodsPrice;

    public Goods() {
    }

    public Goods(Integer goodsId, String goodsName, Double goodsPrice) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(goodsId, goods.goodsId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(goodsId);
    }
    
    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                '}';
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
