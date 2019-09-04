package com.csust.zx.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.csust.zx.entity.AccountInfo;
import com.csust.zx.jdbc.jdbcConn;

public class SelectAccountService {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private String sql;
	private List<AccountInfo> list;
	private AccountInfo account;
	
	public List<AccountInfo> selectAccount(){
		list = new ArrayList<AccountInfo>();
		conn = jdbcConn.getConnection();
		try {
			st = conn.createStatement();
			sql="select * from accountinfo";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				account = new AccountInfo();
				account.setAccount_amount(rs.getLong("account_amount"));
				account.setAccount_num(rs.getLong("account_num"));
				account.setAccount_date(rs.getString("account_date"));
				account.setGoods_name(rs.getString("goods_name"));
				list.add(account);
			}
			conn.close();
			
		}catch(Exception e ) {
			e.getMessage();
		}
		
		return list;
	}
}
