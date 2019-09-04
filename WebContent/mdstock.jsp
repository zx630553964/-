<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<h2 align="center">修改库存</h2>
<hr>
<%
	long id =Long.parseLong(request.getParameter("id"));
	long stock =Long.parseLong(request.getParameter("stock"));
%>
<form action="ModifyStockServlet" method="post">
<table align="center">
<tr height="20px"></tr>
<tr>
    <td>商品编号：<input name="order_id" type="text" value="<%=id%>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>商品库存：<input name="order_num" type="text" value="<%=stock%>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="修改"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="stock.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>