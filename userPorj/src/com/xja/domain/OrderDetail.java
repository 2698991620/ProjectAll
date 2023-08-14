package com.xja.domain;

/**
 * 项目名称: com.xja.domain <br/>
 * 文件名称: OrderDetail <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/11:16:56 <br/>
 * 包名：com.xja.domain
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class OrderDetail {
	private Goods goods;
	private Integer detail_id;
	private String detail_order_id;
	private Integer detail_goods_id;
	private Double detail_price;
	private Integer detail_num;
	
	public OrderDetail() {
	}
	
	public OrderDetail(Goods goods, Integer detail_id, String detail_order_id, Integer detail_goods_id, Double detail_price, Integer detail_num) {
		this.goods = goods;
		this.detail_id = detail_id;
		this.detail_order_id = detail_order_id;
		this.detail_goods_id = detail_goods_id;
		this.detail_price = detail_price;
		this.detail_num = detail_num;
	}
	
	public Goods getGoods() {
		return goods;
	}
	
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public Integer getDetail_id() {
		return detail_id;
	}
	
	public void setDetail_id(Integer detail_id) {
		this.detail_id = detail_id;
	}
	
	public String getDetail_order_id() {
		return detail_order_id;
	}
	
	public void setDetail_order_id(String detail_order_id) {
		this.detail_order_id = detail_order_id;
	}
	
	public Integer getDetail_goods_id() {
		return detail_goods_id;
	}
	
	public void setDetail_goods_id(Integer detail_goods_id) {
		this.detail_goods_id = detail_goods_id;
	}
	
	public Double getDetail_price() {
		return detail_price;
	}
	
	public void setDetail_price(Double detail_price) {
		this.detail_price = detail_price;
	}
	
	public Integer getDetail_num() {
		return detail_num;
	}
	
	public void setDetail_num(Integer detail_num) {
		this.detail_num = detail_num;
	}
}
