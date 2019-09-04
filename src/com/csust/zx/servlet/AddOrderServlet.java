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
 * Servlet implementation class AddOrderServlet
 */
public class AddOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=GBK");
		long id =Long.parseLong(request.getParameter("goods_id"));
		long oid =Long.parseLong(request.getParameter("order_id"));
		long onum =Long.parseLong(request.getParameter("order_num"));
		long oamt =Long.parseLong(request.getParameter("order_amount"));
		String ocond = request.getParameter("order_condition");
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
			String sql ="insert into orderinfo(goods_id,order_id,order_num,order_amount,order_condition,order_time) values(?,?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1,id);
			stmt.setLong(2,oid);
			stmt.setLong(3,onum);
			stmt.setLong(4,oamt);
			stmt.setString(5, ocond);
			stmt.setString(6, time);
		    int rows = stmt.executeUpdate();
		    if(rows>0){
		    	out.print("<script>alert('添加成功!');window.location.href='order.jsp'</script>");
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
