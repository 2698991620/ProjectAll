package com.xja.dao.impl;

import com.xja.dao.GoodsDAO;
import com.xja.domain.Goods;

import java.util.ArrayList;

public class GoodsDAOImpl implements GoodsDAO {
    private ArrayList<Goods> goodsList = new ArrayList<>();

    public GoodsDAOImpl() {
        
        //加5个商品对象进入goodsList
        goodsList.add(new Goods(1,"可口可乐1",3.0));
        goodsList.add(new Goods(2,"可口可乐2",3.0));
        goodsList.add(new Goods(3,"可口可乐3",3.0));
        goodsList.add(new Goods(4,"可口可乐4",3.0));
        goodsList.add(new Goods(5,"可口可乐5",3.0));
        
    }
    
    

    @Override
    public Goods findByName(String goodsName) {
        
        /*switch (goodsName){
            case "可口可乐":
                return new Goods(1,"可口可乐",3.0);
            case "百事可乐":
                return new Goods(2,"百事可乐",2.5);
            default:
                return null;
        }*/
        
        for(Goods goods:goodsList){
            if (goods.getGoodsName().equals(goodsName)){
                return goods;
            }
        }
        return null;
    }
}
