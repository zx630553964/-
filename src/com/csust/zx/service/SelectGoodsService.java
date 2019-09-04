package com.csust.zx.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.csust.zx.entity.GoodsInfo;
import com.csust.zx.jdbc.jdbcConn;

public class SelectGoodsService {

	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private String sql;
	private List<GoodsInfo> list;
	private GoodsInfo goods;
	
	public List<GoodsInfo> selectGoods(){
		list = new ArrayList<GoodsInfo>();
		conn = jdbcConn.getConnection();
		try {
			st = conn.createStatement();
			sql="select * from goodsinfo";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				goods = new GoodsInfo();
				goods.setGoods_id(rs.getLong("goods_id"));
				goods.setGoods_type(rs.getString("goods_type"));
				goods.setGoods_name(rs.getString("goods_name"));
				goods.setGoods_price(rs.getLong("goods_price"));
				goods.setGoods_time(rs.getString("goods_time"));
				list.add(goods);
			}
			conn.close();
			
		}catch(Exception e ) {
			e.getMessage();
		}
		
		return list;
	}
}
