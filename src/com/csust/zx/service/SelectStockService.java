package com.csust.zx.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.csust.zx.entity.StockInfo;
import com.csust.zx.jdbc.jdbcConn;

public class SelectStockService {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private String sql;
	private List<StockInfo> list;
	private StockInfo stock;
	
	public List<StockInfo> selectStock(){
		list = new ArrayList<StockInfo>();
		conn = jdbcConn.getConnection();
		try {
			st = conn.createStatement();
			sql="select * from stockinfo";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				stock = new StockInfo();
				stock.setGoods_id(rs.getLong("goods_id"));
				stock.setGoods_stock(rs.getLong("goods_stock"));

				list.add(stock);
			}
			conn.close();
			
		}catch(Exception e ) {
			e.getMessage();
		}
		
		return list;
	}
}
