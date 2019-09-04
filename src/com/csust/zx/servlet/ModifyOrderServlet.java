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
 * Servlet implementation class ModifyOrderServlet
 */
public class ModifyOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=GBK");
		long id =Long.parseLong(request.getParameter("order_id"));
		long num =Long.parseLong(request.getParameter("order_num"));
		long amount =Long.parseLong(request.getParameter("order_amount"));
		String condition = request.getParameter("order_condition");
    	PrintWriter out = response.getWriter();
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/final?"
					+"characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
			String username = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql ="update orderinfo set order_num=?,order_amount=?,order_condition=? where order_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1,num);
			stmt.setLong(2,amount);
			stmt.setString(3,condition);
			stmt.setLong(4, id);
		    int rows = stmt.executeUpdate();
		    if(rows>0){
		    	out.print("<script>alert('修改成功!');window.location.href='order.jsp'</script>");
		    }
		}
		catch (Exception ex) {
			ex.printStackTrace();
			out.print("修改失败！");
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
