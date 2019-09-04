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
<div>
	<%@include file="head.jsp" %>
</div>
<div class="table">
		<%
	List stock = null;
	if(session.getAttribute("Stock")!=null){
		stock = (List)session.getAttribute("Stock");
		if(stock.size()>0){
			StockInfo stoc = new StockInfo();
			%>
		<table align="center" width="900" border="1"> 
		<tr align="center" height=30>
		<td>商品编号</td>
		<td>商品库存</td>
		<td>操作</td>
		</tr>
			<%
			for(int i=0;i<stock.size();i++){
				stoc = new StockInfo();
				stoc = (StockInfo)stock.get(i);
				%>
		<tr align="center" height=10>
		<td><%=stoc.getGoods_id() %></td>
		<td><%=stoc.getGoods_stock() %></td>
		<td><a href="mdstock.jsp?id=<%=stoc.getGoods_id() %>&stock=<%=stoc.getGoods_stock() %>">修改</a>&nbsp;<a href="DeleteStockServlet?id=<%=stoc.getGoods_id() %>">删除</a></td>
		</tr>
	<%
			}
		}
	}
	
	%>
</table>
</div>
<%@include file="foot.jsp" %>
</body>
</html>