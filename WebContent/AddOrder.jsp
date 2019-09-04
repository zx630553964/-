<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加信息</title>
</head>
<body>
<form action="AddOrderServlet" method="post">
<table align="center">
<h2 align="center">添加订单信息</h2>
<hr>
<tr>
    <td>商品编号：<input name="goods_id" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>订单编号：<input name="order_id" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>订单数量：<input name="order_num" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>订单金额：<input name="order_amount" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
	<td>
	订单状态：
    <select style="width:150px" name="order_condition">
	<option value="已发货">已发货</option>
	<option value="未发货">未发货</option>
	</select>
	</td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="添加"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="order.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>