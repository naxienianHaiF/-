<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'serviceStatus.jsp' starting page</title>
    <style type="text/css">
    	td{
    		width: 135;
    	}
    </style>
  </head>
  
  <body style="width: 100%;height: 100%;overflow: hidden;"><!-- 隐藏滚动条 -->
    <!-- <table border="1"  style="border-collapse:collapse;cellspacing=0;bordercolor=black"> -->
    <table border="1" cellpadding="0" bordercolor="black" style="border-collapse: collapse;">
    	<tr>
    		<td>订单人</td>
    		<td>支付状态</td>
    		<td>车牌号</td>
    		<td>订单日期</td>
    		<td>金豆</td>
    		<td>银豆</td>
    		<td>查看详情</td>
    	</tr>
    </table>
  </body>
</html>
