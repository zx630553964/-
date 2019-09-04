package com.csust.zx.entity;

public class AccountInfo {

	private long account_amount;//销售金额
	private long account_num;//销售数量
	private String account_date;//销售日期
	private String goods_name;//商品名称
	
	public AccountInfo(long account_amount, long account_num, String account_time, String goods_name) {
		this.account_amount = account_amount;
		this.account_num = account_num;
		this.account_date = account_time;
		this.goods_name = goods_name;
	}
	
	public AccountInfo() {

	}

	public long getAccount_amount() {
		return account_amount;
	}
	public void setAccount_amount(long account_amount) {
		this.account_amount = account_amount;
	}
	public long getAccount_num() {
		return account_num;
	}
	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}
	public String getAccount_date() {
		return account_date;
	}
	public void setAccount_date(String account_time) {
		this.account_date = account_time;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
}
