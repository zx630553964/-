package com.csust.zx.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.csust.zx.entity.OrderInfo;
import com.csust.zx.jdbc.jdbcConn;

public class SelectOrderService {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private String sql;
	private List<OrderInfo> list;
	private OrderInfo order;
	
	public List<OrderInfo> selectOrder() {
		list = new ArrayList<OrderInfo>();
		conn = jdbcConn.getConnection();
		try {
			st = conn.createStatement();
			sql="select * from orderinfo";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				order = new OrderInfo();
				order.setGoods_id(rs.getLong("goods_id"));
				order.setOrder_id(rs.getLong("order_id"));
				order.setOrder_num(rs.getLong("order_num"));
				order.setOrder_amount(rs.getLong("order_amount"));
				order.setOrder_condition(rs.getString("order_condition"));
				order.setOrder_time(rs.getString("order_time"));
				list.add(order);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
