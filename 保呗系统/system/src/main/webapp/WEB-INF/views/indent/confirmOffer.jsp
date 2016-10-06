<%@page import="com.baobeisystem.entity.DBArea"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-select.css">
	<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
	<link href="<%=request.getContextPath()%>/css/bootstrap-datetimepicker.css" rel="stylesheet">  
   
</head>
<script type="text/javascript">
	$(document).ready(function(){
		window.scrollTo(0, 0);
		alert("aaa...");
	});
</script>
<body>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">报价</h3>
<br /><br />

<form class="form-horizontal col-sm-9 col-sm-offset-3" role="form" action="changanbaoxian.do" method="post" id="carfourForm">
   
   <div class="form-group" align="center">
      <label for="card" class="col-sm-2 control-label">&nbsp;长&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;安&nbsp;</label>
      <div class="col-sm-5">
                 
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">实际报价</label>
      <div class="col-sm-5">
      	
      </div>
   </div>
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">&nbsp;金&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;豆&nbsp;</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="jindou" name="jindou" >
      </div>
   </div>  
    
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">&nbsp;银&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;豆&nbsp;</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="yindou" name="yindou">
      </div>
   </div>  
    
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-default">&nbsp;确&nbsp;&nbsp;定&nbsp;&nbsp;&nbsp;</button>
      </div>
   </div>
</form>

</body>
</html>