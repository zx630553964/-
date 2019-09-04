<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加信息</title>
</head>
<body>
<form action="AddStockServlet" method="post">
<table align="center">
<h2 align="center">添加库存</h2>
<hr>
<tr>
    <td>商品编号：<input name="goods_id" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>商品库存：<input name="goods_stock" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="添加"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="stock.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>