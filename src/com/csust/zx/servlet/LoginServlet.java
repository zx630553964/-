package com.csust.zx.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csust.zx.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		PreparedStatement stmt=null;
		ResultSet rs=null;

		String sql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/final?"
					+"characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
			String username = "root";
			String password = "123456";
			Connection conn =DriverManager.getConnection(url, username, password);
			sql ="select * from users where username=? and password=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setString(2,pwd);
			rs =stmt.executeQuery();
			if(rs!=null) {
				response.sendRedirect("main.jsp");
			}
			
		}catch(Exception e ) {
			e.getMessage();
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
