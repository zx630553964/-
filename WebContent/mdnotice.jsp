<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<form action="ModifyNoticeServlet" method="post">
<table align="center">
<h2 align="center">修改公告</h2>
<hr>
<%
	long id =Long.parseLong(request.getParameter("id"));
 	String head=request.getParameter("head");
	String main=request.getParameter("main");
%>
<tr>
    <td>公告编号：<input name="notice_id" type="text" value="<%=id %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>公告标题：<input name="notice_head" type="text" value="<%=head %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>公告内容：<input name="notice_main" type="text" value="<%=main %>"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="修改"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="notice.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>