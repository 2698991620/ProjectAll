package com.xja.domain;

/**
 * 项目名称: com.xja.domain <br/>
 * 文件名称: Goods <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/11:16:51 <br/>
 * 包名：com.xja.domain
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class Goods {
	private GoodsType goodsType;
	private Integer goods_id;
	private String goods_name;
	private Double goods_price;
	private Integer goods_num;
	private String goods_img;
	private Integer goods_type_id;
	private String goods_desc;
	
	public Goods(GoodsType goodsType, Integer goodsId, String goodsName, Double goodsPrice, Integer goodsNum, String goodsImg, Integer goodsTypeId, String goodsDesc) {
		this.goodsType = goodsType;
		goods_id = goodsId;
		goods_name = goodsName;
		goods_price = goodsPrice;
		goods_num = goodsNum;
		goods_img = goodsImg;
		goods_type_id = goodsTypeId;
		goods_desc = goodsDesc;
	}
	
	public GoodsType getGoodsType() {
		return goodsType;
	}
	
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	
	public Integer getGoods_id() {
		return goods_id;
	}
	
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
	
	public String getGoods_name() {
		return goods_name;
	}
	
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	
	public Double getGoods_price() {
		return goods_price;
	}
	
	public void setGoods_price(Double goods_price) {
		this.goods_price = goods_price;
	}
	
	public Integer getGoods_num() {
		return goods_num;
	}
	
	public void setGoods_num(Integer goods_num) {
		this.goods_num = goods_num;
	}
	
	public String getGoods_img() {
		return goods_img;
	}
	
	public void setGoods_img(String goods_img) {
		this.goods_img = goods_img;
	}
	
	public Integer getGoods_type_id() {
		return goods_type_id;
	}
	
	public void setGoods_type_id(Integer goods_type_id) {
		this.goods_type_id = goods_type_id;
	}
	
	public String getGoods_desc() {
		return goods_desc;
	}
	
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}
}
