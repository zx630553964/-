package com.csust.zx.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcConn {
	private final static String url="jdbc:mysql://localhost:3306/final?"
			+"characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
	private final static String user = "root";
	private final static String password = "123456";
	
	public static Connection conn;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement stml;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	public void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();

			}
			if (conn != null && conn.isClosed() == false) {
				conn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
