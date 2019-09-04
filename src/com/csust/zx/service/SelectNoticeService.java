package com.csust.zx.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.csust.zx.entity.NoticeInfo;
import com.csust.zx.jdbc.jdbcConn;

public class SelectNoticeService {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	private NoticeInfo notice;
	public List<NoticeInfo> getNotice(){
		List<NoticeInfo> list = new ArrayList<NoticeInfo>();
		conn=jdbcConn.getConnection();
		try {
			stmt=conn.createStatement();
			sql="select * from noticeinfo";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				notice = new NoticeInfo();
				notice.setNotice_id(rs.getLong("notice_id"));
				notice.setNotice_head(rs.getString("notice_head"));
				notice.setNotice_main(rs.getString("notice_main"));
				notice.setNotice_time(rs.getString("notice_time"));
				list.add(notice);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
