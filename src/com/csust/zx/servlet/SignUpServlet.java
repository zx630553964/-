package com.csust.zx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class Login
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
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
		String rln = request.getParameter("realname");
		String eml = request.getParameter("email");
		long pho = Long.parseLong(request.getParameter("phone"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/final?"
					+"characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
			String username = "root";
			String password = "123456";
			Connection conn =DriverManager.getConnection(url, username, password);
			String sql ="insert into users(username,password,realname,email,phone) values(?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setString(2,pwd);
			stmt.setString(3,rln);
			stmt.setString(4,eml);
			stmt.setLong(5,pho);
			int row =stmt.executeUpdate();
			if(row>0) {
				response.setContentType("text/htmll;charset=GBK");
				PrintWriter out = response.getWriter();
				out.println("×¢²á³É¹¦! 5ÃëºóÌø×ª");
				response.setHeader ("refresh", "5;URL=/FinalProject/Login.jsp");
			}
			
		}catch(Exception e ) {
			e.printStackTrace();
			response.setContentType("text/htmll;charset=GBK");
			PrintWriter out = response.getWriter();
			out.println("×¢²áÊ§°Ü!");
			response.setHeader ("refresh", "5;URL=/FinalProject/SignUp.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
