<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<form action="ModifyAccountServlet" method="post">
<table align="center">
<h2 align="center">修改账目</h2>
<hr>
<%
 	String name=request.getParameter("name");
	long amount =Long.parseLong(request.getParameter("amount"));
	long num =Long.parseLong(request.getParameter("num"));
%>
<tr>
    <td>商品名称：<input name="goods_name" type="text" value="<%=name %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>销售金额：<input name="account_amount" type="text" value="<%=amount %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>销售数量：<input name="account_num" type="text" value="<%=num %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="修改"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="account.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>