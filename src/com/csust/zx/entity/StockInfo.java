package com.csust.zx.entity;

public class StockInfo {

	private long goods_id;//��Ʒ���
	private long goods_stock;//��Ʒ���
	public StockInfo(long goods_id, long goods_stock) {
		this.goods_id = goods_id;
		this.goods_stock = goods_stock;
	}
	public StockInfo() {

	}
	public long getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}
	public long getGoods_stock() {
		return goods_stock;
	}
	public void setGoods_stock(long goods_stock) {
		this.goods_stock = goods_stock;
	}
}
