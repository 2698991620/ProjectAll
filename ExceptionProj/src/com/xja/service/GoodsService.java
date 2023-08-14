package com.xja.service;

import com.xja.domain.Goods;
import com.xja.exception.GoodsNameException;

/**
 * 商品的业务接口
 */
public interface GoodsService{
    /**
     * 保存商品的业务方法
     * @param goods 商品对象
     * @throws GoodsNameException 商品名称重复时抛出的异常
     */
    void save(Goods goods) throws GoodsNameException;
}

