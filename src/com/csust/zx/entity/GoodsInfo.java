package com.csust.zx.entity;

public class GoodsInfo {

	private long goods_id;//商品编号
	private String goods_type;//商品类型
	private String goods_name;//商品名称
	private long goods_price;//商品价格
	private String goods_time;//商品发布时间
	public GoodsInfo(long goods_id, String goods_type, String goods_name, long goods_price, String goods_time) {
		this.goods_id = goods_id;
		this.goods_type = goods_type;
		this.goods_name = goods_name;
		this.goods_price = goods_price;
		this.goods_time = goods_time;
	}
	public GoodsInfo() {

	}
	public long getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_type() {
		return goods_type;
	}
	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public long getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(long goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_time() {
		return goods_time;
	}
	public void setGoods_time(String goods_time) {
		this.goods_time = goods_time;
	}
}
