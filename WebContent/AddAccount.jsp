<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加信息</title>
</head>
<body>
<form action="AddAccountServlet" method="post">
<table align="center">
<h2 align="center">添加账目</h2>
<hr>
<tr>
    <td>销售金额：<input name="account_amount" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>销售数量：<input name="account_num" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>商品名称：<input name="goods_name" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="添加"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="account.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>