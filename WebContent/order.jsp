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
	List orders = null;
	if(session.getAttribute("order")!=null){
		orders = (List)session.getAttribute("order");
		if(orders.size()>0){
			OrderInfo order = new OrderInfo();%>
		<table align="center" width="900" border="1"> 
		<tr align="center" height=30>
		<td>商品编号</td>
		<td>订单编号</td>
		<td>订单数量</td>
		<td>订单金额</td>
		<td>订单状态</td>
		<td>下单时间</td>
		<td>操作</td>
		</tr>
			<%
			for(int i=0;i<orders.size();i++){
				order = new OrderInfo();
				order = (OrderInfo)orders.get(i);
				%>
		<tr align="center" height=10>
		<td><%=order.getGoods_id() %></td>
		<td><%=order.getOrder_id()%></td>
		<td><%=order.getOrder_num() %></td>
		<td><%=order.getOrder_amount() %></td>
		<td><%=order.getOrder_condition() %></td>
		<td><%=order.getOrder_time() %></td>
		<td><a href="mdorder.jsp?id=<%=order.getOrder_id()%>&num=<%=order.getOrder_num() %>&amount=<%=order.getOrder_amount() %>">修改</a>&nbsp;<a href="DeleteOrderServlet?action=<%=order.getGoods_id() %>">删除</a></td>
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