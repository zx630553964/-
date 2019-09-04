<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<h2 align="center">修改订单</h2>
<hr>
<%
	long id =Long.parseLong(request.getParameter("id"));
	long num =Long.parseLong(request.getParameter("num"));
	long amount =Long.parseLong(request.getParameter("amount"));
%>
<form action="ModifyOrderServlet" method="post">
<table align="center">
<tr height="20px"></tr>
<tr>
    <td>订单编号：<input name="order_id" type="text" value="<%=id%>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>订单数量：<input name="order_num" type="text" value="<%=num%>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>订单金额：<input name="order_amount" type="text" value="<%=amount%>"/></td>
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
    <td  align="center"><input type="submit" value="修改"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="order.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>