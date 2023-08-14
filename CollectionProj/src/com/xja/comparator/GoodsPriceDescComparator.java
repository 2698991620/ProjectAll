package com.xja.comparator;

import com.xja.domain.Goods;

import java.util.Comparator;

/**
 * 项目名称: com.xja.comparator <br/>
 * 文件名称: GoodsPriceDescComparatoe <br/>
 * 描述: 商品价格倒叙排序 <br/>
 * 创建时间: 2023/7/26:14:00 <br/>
 * 包名：com.xja.comparator
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class GoodsPriceDescComparator implements Comparator<Goods> {
	@Override
	public int compare(Goods o1, Goods o2) {
		if (o1.getGoodsPrice()>o2.getGoodsPrice()){
			return 1;
		}else {
			return -1;
		}
	}
}
