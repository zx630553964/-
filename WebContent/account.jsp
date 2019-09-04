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
	List account = null;
	if(session.getAttribute("Account")!=null){
		account = (List)session.getAttribute("Account");
		if(account.size()>0){
			AccountInfo acct = new AccountInfo();
			%>
		<table align="center" width="900" border="1"> 
		<tr align="center" height=30>
		<td>商品名称</td>
		<td>销售金额</td>
		<td>销售数量</td>
		<td>销售日期</td>
		<td>操作</td>
		</tr>
			<%
			for(int i=0;i<account.size();i++){
				acct = new AccountInfo();
				acct = (AccountInfo)account.get(i);
				%>
		<tr align="center" height=10>
		<td><%=acct.getGoods_name() %></td>
		<td><%=acct.getAccount_amount()%></td>
		<td><%=acct.getAccount_num() %></td>
		<td><%=acct.getAccount_date() %></td>
		<%
			String name=acct.getGoods_name();
			String goodsname= URLEncoder.encode(name,"utf-8");
		%>
		<td><a href="mdaccount.jsp?amount=<%=acct.getAccount_amount()%>&num=<%=acct.getAccount_num() %>&name=<%=goodsname%>">修改</a>&nbsp;<a href="DeleteAccountServlet?name=<%=goodsname%> ">删除</a></td>
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