package com.csust.zx.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.csust.zx.entity.User;
import com.csust.zx.jdbc.jdbcConn;

public class SelectUserService {
	private Connection conn;
	private Statement stmt;
	private	ResultSet rs;
	private String sql;
	private User user;
	public List<User> getUser(){
		List<User> list = new ArrayList<User>();
		conn = jdbcConn.getConnection();
		try {
			stmt=conn.createStatement();
			sql="select * from users";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRealname(rs.getString("realname"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getLong("phone"));
				list.add(user);
			}
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
