<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.csust.zx.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品管理系统</title>
<link rel="stylesheet" href="css/main.css" type="text/css"/>
</head>
<body>
<div id="div1">
	<ul>
			<li><a>商品管理</a>
				<ul>
					<li><a href="SelectGoodsServlet">查询商品</a></li>
					<li><a href="AddGoods.jsp">添加商品</a></li>
				</ul>
			</li>
			<li><a>订单管理</a>
				<ul>
					<li><a href="SelectOrderServlet">查询订单</a></li>
					<li><a href="AddOrder.jsp">添加订单</a></li>

				</ul>
			</li>
			<li><a>库存管理</a>
				<ul>
					<li><a href="SelectStockServlet">查询库存</a></li>
					<li><a href="AddStock.jsp">添加库存</a></li>
				</ul>
			</li>
			<li><a>账目管理</a>
				<ul>
					<li><a href="SelectAccountServlet">查询账目</a></li>
					<li><a href="AddAccount.jsp">添加账目</a></li>
				</ul>			
			</li>
			<li><a>公告管理</a>
				<ul>
					<li><a href="SelectNoticeServlet">查询公告</a></li>				
					<li><a href="AddNotice.jsp">添加公告</a></li>
				</ul>			
			</li>
			<li><a>用户管理</a>
				<ul>
					<li><a href="SelectUserServlet">查询用户</a></li>
				</ul>			
			</li>
	</ul>
</div>