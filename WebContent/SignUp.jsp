<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" href="css/SignUp.css" type="text/css"/>
</head>
<body>

<form action="SignUpServlet" method="post">

<table align="center">
<h2 class="head" align="center">用户注册</h2>
<tr>
    <td class="txt">用户名：&nbsp;<input class="input" name="username" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td class="txt">密 码：&nbsp;&nbsp;&nbsp;<input class="input" name="password" type="password"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td class="txt">真 名：&nbsp;&nbsp;&nbsp;<input class="input" name="realname" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td class="txt">邮 箱：&nbsp;&nbsp;&nbsp;<input class="input" name="email" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td class="txt">手机号：&nbsp;<input class="input" name="phone" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input class="btnstyle" type="submit" value="注册"></td>
</tr>
<tr height="20px"></tr>
<tr><td class="ntxt" align="center"><a href="Login.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>