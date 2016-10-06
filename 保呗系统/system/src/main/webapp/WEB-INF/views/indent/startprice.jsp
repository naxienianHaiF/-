<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 开始报价  第一个页面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 		<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<!-- 可选的Bootstrap主题文件（一般不用引入） -->
		<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		
		<script type="text/javascript" src="<%=request.getContextPath() %>/laydate/laydate.js" ></script>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-select.css">
		<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
		<link href="<%=request.getContextPath()%>/css/bootstrap-datetimepicker.css" rel="stylesheet">  
		<script src="<%=request.getContextPath()%>/js/moment-with-locales.js"></script>
		<script src="<%=request.getContextPath()%>/js/bootstrap-datetimepicker.js"></script>
		
		<link href="<%=request.getContextPath() %>/css/citymain.css" rel="stylesheet">
		<script src="<%=request.getContextPath() %>/js/distpicker.data.js"></script>
		<script src="<%=request.getContextPath() %>/js/distpicker.js"></script>
		<script src="<%=request.getContextPath() %>/js/citymain.js"></script>		
</head>
<body>
<br />
<h3 align="center">报价</h3>
<br /><br />
<form class="form-horizontal col-sm-9 col-sm-offset-3" role="form" action="carfour.do" method="post">

   <div class="form-inline form-group">
   
      <label for="lastname" class="col-sm-2 control-label">投保地区&nbsp;</label>
      
      <div class="htmleaf-container">
      	<div data-toggle="distpicker">
      	
        <div class="form-group" style="margin-left: 14px;">
          <label class="sr-only" for="province1" style="margin-left: 1px;">Province</label>
          <select class="form-control" id="province1" name="province"></select>
        </div>
        <div class="form-group">
          <label class="sr-only" for="city1">City</label>
          <select class="form-control" id="city1" name="city"></select>
        </div>
        <div class="form-group">
          <label class="sr-only" for="district1">District</label>
          <select class="form-control" id="district1" name="district"></select>
        </div>
        
      </div>
    </div>
      
   </div>
   
   <script type="text/javascript">
		$(document).ready(function(){
			$("#city1").change(function(){
				var url="getLicensePrefixByShortname.do";
				var str=$("#city1").val();
				var zhi={"city":str};
				$.post(url,zhi,function(data){
					document.getElementById("lastname").value=data;
				});
			});
		});
   </script>
    
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">车&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;牌</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="lastname" name="licenseNo" 
            placeholder="新车免录车牌">
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">车&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="lastname" name="carOwner" 
            placeholder="输入车主">
      </div>
   </div>   
   
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-default">开始报价</button>
      </div>
   </div>
   
   
</form>
</body>
</html>
