<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>success</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="success">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
	<br />
	<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;text-decoration: none;" >上一页 </a><br>
	<br><br><br>
	<h2 align="center" style="color: red;">投保成功</h2>
	<br /><br />	  
	
		<h2 align="center">&nbsp;我冷眼回望过去，只见它曲折灌溉的悲喜，都消失在一片&nbsp;</h2>
		<h2 align="center">亘古的荒漠，这才知道我的全部努力，不过完成了普通的生活。</h2>
		
  </body>
</html>
