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
	List noti = null;
	if(session.getAttribute("Notice")!=null){
		noti = (List)session.getAttribute("Notice");
		if(noti.size()>0){
			NoticeInfo notice = new NoticeInfo();
			%>
		<table align="center" width="900" border="1"> 
		<tr align="center" height=30>
		<td>公告编号</td>
		<td>公告标题</td>
		<td>公告内容</td>
		<td>公告时间</td>
		<td>操作</td>
		</tr>
			<%
			for(int i=0;i<noti.size();i++){
				notice = new NoticeInfo();
				notice = (NoticeInfo)noti.get(i);
				%>
		<tr align="center" height=10>
		<td><%=notice.getNotice_id()%></td>
		<td><%=notice.getNotice_head()%></td>	
		<td><%=notice.getNotice_main()%></td>		
		<td><%=notice.getNotice_time()%></td>
		<%
			String head=notice.getNotice_head();
			String main=notice.getNotice_main();
			String noticehead= URLEncoder.encode(head,"utf-8");
			String noticemain= URLEncoder.encode(main,"utf-8");
		%>
		<td><a href="mdnotice.jsp?id=<%=notice.getNotice_id()%>&head=<%=noticehead%>&main=<%=noticemain%>">修改</a>&nbsp;<a href="DeleteNoticeServlet?id=<%=notice.getNotice_id()%>">删除</a></td>	
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