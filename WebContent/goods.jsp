<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.csust.zx.entity.*" %>
<%@page import="java.net.*" %>
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
	List<?> list = null;
	if(session.getAttribute("Goods")!=null){
		list = (List<?>)session.getAttribute("Goods");
		if(list.size()>0){
			GoodsInfo goods = new GoodsInfo();
			%>
		<table align="center" width="900" border="1px"> 
		<tr align="center" height=30>
		<td>商品编号</td>
		<td>商品名称</td>
		<td>商品类型</td>
		<td>商品价格</td>
		<td>发布时间</td>
		<td>操作</td>
		</tr>
			<%
			for(int i=0;i<list.size();i++){
				goods = new GoodsInfo();
				goods = (GoodsInfo)list.get(i);
				%>
		<tr align="center" height=10>
		<td><%=goods.getGoods_id() %></td>
		<td><%=goods.getGoods_name() %></td>
		<td><%=goods.getGoods_type() %></td>
		<td><%=goods.getGoods_price() %></td>
		<td><%=goods.getGoods_time() %></td>
		<%
			String name=goods.getGoods_name();
			String type=goods.getGoods_type();
			String goodsname= URLEncoder.encode(name,"utf-8");
			String goodstype= URLEncoder.encode(type,"utf-8");
		%>
		<td><a href="mdgoods.jsp?id=<%=goods.getGoods_id() %>&name=<%=goodsname %>&type=<%=goodstype %>&price=<%=goods.getGoods_price() %>">修改</a>&nbsp;<a href="DeleteGoodsServlet?action=<%=goods.getGoods_id() %>">删除</a></td>
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