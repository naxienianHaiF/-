<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="<%=request.getContextPath() %>/laydate/laydate.js"></script>
</head>
<body>
<%-- <c:set var="wjh" value="奥迪AUDI RS5 COUPE 4.2FSI QUATTRO轿跑车"></c:set> --%>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">自选套餐</h3>
<br />
<form class="form-horizontal col-sm-9 col-sm-offset-3" role="form" action="confirmOffer.do" method="post">
   <div class="form-group" align="left">
      <label for="firstname" class="col-sm-2 control-label">车型名称</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="toubaodiqu" value="${wjh }"> 
      </div>
   </div>
   
   	    <div class="checkbox"> 
	        <label> 
	            <input type="checkbox" id="jiaoqiangxian" name="jiaoqiangxian">交强险
	            <label id="jqxlabel"></label>
	        </label> 
	    </div>
	    <div class="checkbox"> 
	        <label> 
	            <input type="checkbox" name="shagnyexian">商业险
	        </label> 
	    </div>
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-primary">确认报价</button>
      </div>
   </div>
</form>
</body>
</html>
