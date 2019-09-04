package com.csust.zx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddGoodsServlet
 */
public class AddNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNoticeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=GBK");
		long id =Long.parseLong(request.getParameter("notice_id"));
		String head = request.getParameter("notice_head");
		String main = request.getParameter("notice_main");
		Date date = new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
		String time = dateFormat.format(date);
    	PrintWriter out = response.getWriter();
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/final?"
					+"characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
			String username = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql ="insert into noticeinfo(notice_id,notice_head,notice_main,notice_time) values(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1,id);
			stmt.setString(2,head);
			stmt.setString(3,main);
			stmt.setString(4, time);
		    int rows = stmt.executeUpdate();
		    if(rows>0){
		    	out.print("<script>alert('添加成功!');window.location.href='notice.jsp'</script>");
		    }
		}
		catch (Exception ex) {
			ex.printStackTrace();
			out.print("添加失败！");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
