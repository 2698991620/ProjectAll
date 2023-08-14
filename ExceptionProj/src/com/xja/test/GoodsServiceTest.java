package com.xja.test;

import com.xja.domain.Goods;
import com.xja.exception.GoodsNameException;
import com.xja.service.GoodsService;
import com.xja.service.impl.GoodsServiceImpl;
import org.junit.Test;

public class GoodsServiceTest {
    String s;
    private GoodsService goodsService = new GoodsServiceImpl();
    @Test
    public void save(){
        Goods goods = new Goods(3,"可口可乐",3.0);
        try {
            goodsService.save(goods);
            System.out.println("保存成功！"+goods);
        } catch (GoodsNameException e) {
            System.out.println("保存失败！"+e.getMessage());
            e.printStackTrace();
        }
    }
}
