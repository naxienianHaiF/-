<%@page import="com.baobeisystem.entity.DBArea"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 长安保险 -->
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
<%-- 	<script src="<%=request.getContextPath()%>/js/moment-with-locales.js"></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap-datetimepicker.js"></script> --%>
   
</head>

<body>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">长安保险</h3>
<br /><br />

<form class="form-horizontal col-sm-9 col-sm-offset-3" role="form" action="confirmToubao.do" method="post" id="carfourForm">
   
   <div class="form-group form-inline">
      <label for="card" class="col-sm-2 control-label">实际报价</label>
      <div class="col-sm-5">
             2545.30    
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">商业险</label>
      <div class="col-sm-5">
      	
      </div>
   </div>
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">交强险</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="jindou" name="jindou" >
      </div>
   </div>  
    
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">赚金豆</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="yindou" name="yindou">
      </div>
   </div>  
 
   <div class="form-group">
     <label for="lastname" class="col-sm-2 control-label">享服务</label>
    &nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">享服务</button>
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
	  <div class="modal-dialog modal-lg">
		  <div class="modal-content">
		  
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">享受服务</h4>
		      </div>
		      <div class="modal-body">
		        <p>长安保险&hellip;</p>
		        <input type="text" name="mtk" placeholder="请输入...">
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		      </div>
	      </div>   <!-- content -->
	   </div>
	</div> 
   </div>	 

    
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-default">&nbsp;投&nbsp;&nbsp;保&nbsp;</button>
      </div>
   </div>
   
</form>

</body>
</html>