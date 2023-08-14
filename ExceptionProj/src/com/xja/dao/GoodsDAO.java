package com.xja.dao;

import com.xja.domain.Goods;

/**
 * 商品的数据访问接口
 */
public interface GoodsDAO {
    /**
     * 按商品名称查询商品对象的方法
     * @param goodsName 商品名称
     * @return 商品对象，如果没有找到返回null
     */
    Goods findByName(String goodsName);
}
