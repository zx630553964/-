<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品管理系统</title>
<link rel="stylesheet" href="css/Login.css" type="text/css"/>
</head>
<body>
<form action="LoginServlet" method="post">

<table align="center">
<h2 class="head" align="center">商品管理系统</h2>
<tr>
    <td><input class="input" name="username" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td><input class="input" name="password" type="password"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input class="btnstyle" type="submit" value="登录"></td>
</tr>
<tr height="20px"></tr>
<tr><td class="ntxt" align="center"><a href="SignUp.jsp">注册</a></td></tr>
</table>
</form>
</body>
</html>