package com.csust.zx.entity;

public class OrderInfo {

	private long goods_id;//商品编号
	private long order_id;//订单编号
	private long order_num;//订单数量
	private long order_amount;//订单金额
	private String order_condition;//订单状态
	private String order_time;//下单时间
	public OrderInfo(long goods_id, long order_id, long order_num, long order_amount, String order_condition,
			String order_time) {
		this.goods_id = goods_id;
		this.order_id = order_id;
		this.order_num = order_num;
		this.order_amount = order_amount;
		this.order_condition = order_condition;
		this.order_time = order_time;
	}
	public OrderInfo() {

	}
	public long getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public long getOrder_num() {
		return order_num;
	}
	public void setOrder_num(long order_num) {
		this.order_num = order_num;
	}
	public long getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(long order_amount) {
		this.order_amount = order_amount;
	}
	public String getOrder_condition() {
		return order_condition;
	}
	public void setOrder_condition(String order_condition) {
		this.order_condition = order_condition;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
}
