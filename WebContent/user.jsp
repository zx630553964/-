<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.csust.zx.entity.*" %>
<%@page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品管理系统</title>
<link rel="stylesheet" href="css/main.css" type="text/css"/>
</head>
<body>
<div>
	<%@include file="head.jsp" %>
</div>
<div class="table">
	<%
	List users = null;
	if(session.getAttribute("User")!=null){
		users = (List)session.getAttribute("User");
		if(users.size()>0){
			User user = new User();
			%>
		<table align="center" width="900" border="1"> 
		<tr align="center" height=30>
		<td>用户名</td>
		<td>用户密码</td>
		<td>真实姓名</td>
		<td>邮箱地址</td>
		<td>电话号码</td>
		<td>操作</td>
		</tr>
			<%
			for(int i=0;i<users.size();i++){
				user = new User();
				user = (User)users.get(i);
				%>
		<tr align="center" height=10>
		<td><%=user.getUsername()%></td>
		<td><%=user.getPassword()%></td>
		<td><%=user.getRealname() %></td>
		<td><%=user.getEmail()%></td>
		<td><%=user.getPhone()%></td>
		<%
			String name=user.getRealname();
			String relname= URLEncoder.encode(name,"utf-8");
		%>
		<td><a href="mduser.jsp?username=<%=user.getUsername()%>&pwd=<%=user.getPassword()%>&relname=<%=relname%>&email=<%=user.getEmail()%>&phone=<%=user.getPhone()%>">修改</a>&nbsp;<a href="DeleteUserServlet?id=<%=user.getUsername()%>">删除</a></td>
		</tr>
	<%
			}
		}
	}
	
	%>
		</table>
</div>
<%@include file="foot.jsp" %>
</body>
</html>