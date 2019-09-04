<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<form action="ModifyGoodsServlet" method="post">
<table align="center">
<h2 align="center">修改商品</h2>
<hr>
<%
	long id =Long.parseLong(request.getParameter("id"));
 	String name=request.getParameter("name");
	String type=request.getParameter("type");
	long price =Long.parseLong(request.getParameter("price"));
%>
<tr>
    <td>商品编号：<input name="goods_id" type="text" value="<%=id %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>商品名称：<input name="goods_name" type="text" value="<%=name %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>商品类型：<input name="goods_type" type="text" value="<%=type %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>商品价格：<input name="goods_price" type="text" value="<%=price %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="修改"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="goods.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>