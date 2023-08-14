package com.xja.service.impl;

import com.xja.dao.GoodsDAO;
import com.xja.dao.impl.GoodsDAOImpl;
import com.xja.domain.Goods;
import com.xja.exception.GoodsNameException;
import com.xja.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {

    private GoodsDAO goodsDAO = new GoodsDAOImpl();

    @Override
    public void save(Goods goods) throws GoodsNameException {
        if(goodsDAO.findByName(goods.getGoodsName())==null){
            System.out.println("保存商品:"+goods);
        }else{
            throw new GoodsNameException("商品名称已存在！");
        }
    }
}

