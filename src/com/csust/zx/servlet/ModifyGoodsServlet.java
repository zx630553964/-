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
public class ModifyGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyGoodsServlet() {
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
		String type = request.getParameter("goods_type");
		String name = request.getParameter("goods_name");
		long price = Long.parseLong(request.getParameter("goods_price"));
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
			String sql ="update goodsinfo set goods_type=?,goods_name=?,goods_price=? where goods_id=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,type);
			stmt.setString(2,name);
			stmt.setLong(3,price);
			stmt.setLong(4,id);
		    int rows = stmt.executeUpdate();
		    if(rows>0){
		    	out.print("<script>alert('修改成功!');window.location.href='goods.jsp'</script>");
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
