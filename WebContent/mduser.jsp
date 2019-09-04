<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<form action="ModifyUserServlet" method="post">
<table align="center">
<h2 align="center">修改用户</h2>
<hr>
<%
 	String username=request.getParameter("username");
	String pwd=request.getParameter("pwd");
	String relname=request.getParameter("relname");
	String email=request.getParameter("email");
	long phone=Long.parseLong(request.getParameter("phone"));
%>
<tr>
    <td>用户账号：<input name="username" type="text" value="<%=username %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>用户密码：<input name="password" type="text" value="<%=pwd %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>真实姓名：<input name="realname" type="text" value="<%=relname %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>邮箱地址：<input name="email" type="text" value="<%=email %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>电话号码：<input name="phone" type="text" value="<%=phone %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="修改"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="user.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>