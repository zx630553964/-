<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加信息</title>
</head>
<body>
<form action="AddNoticeServlet" method="post">
<table align="center">
<h2 align="center">添加公告</h2>
<hr>
<tr>
    <td>公告编号：<input name="notice_id" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>公告标题：<input name="notice_head" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td>公告内容：<input name="notice_main" type="text"/></td>
</tr>
<tr height="20px"></tr>
<tr>
    <td  align="center"><input type="submit" value="添加"></td>
</tr>
<tr height="20px"></tr>
<tr><td align="center"><a href="notice.jsp">返回</a></td></tr>
</table>
</form>
</body>
</html>