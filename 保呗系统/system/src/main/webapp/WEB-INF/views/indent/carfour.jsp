<%@page import="com.baobeisystem.entity.DBArea"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 开始报价  第一个页面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="<%=request.getContextPath() %>/laydate/laydate.js"></script>
   <%-- <script type="text/javascript" src="<%=request.getContextPath() %>/js/cardValid.js"></script> --%>
   <script type="text/javascript" src="<%=request.getContextPath() %>/js/cardValidWJH.js"></script>	   
	
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>   
</head>

<body>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">车四项</h3>
<br /><br />

<script>
	$().ready(function() {
	    $("#carfourForm").validate();
	});
</script>

<form class="form-horizontal col-sm-9 col-sm-offset-3" role="form" action="carinformation.do" method="post" id="carfourForm">
   <div class="form-group" align="center">
      <label for="card" class="col-sm-2 control-label">身&nbsp;&nbsp;份&nbsp;&nbsp;证</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="firstname" name="shenfenzhen" 
            placeholder="数字或字母" onblur="if(this.value==''){this.value='';}nunber(this.value);">
            <span  id="span_username"></span> 
            
<!--          <script type="text/javascript">
         	$(document).ready(function(){
         		$("#shenfenzhen").blur(function(){
         			var sfz=$("#shenfenzhen").val(); 
         			var res=IdentityCodeValid(sfz);
         		});
         	});
         </script> -->    
                 
      </div>
   </div>
   <div class="form-group"><!--   -->
      <label for="lastname" class="col-sm-2 control-label">车&nbsp;&nbsp;架&nbsp;&nbsp;号</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="frameNo" name="frameNo" 
            placeholder="17位数字或字母">
      </div>
   </div>
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">发动机号</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="engineNo" name="engineNo" 
            placeholder="输入发动机号">
      </div>
   </div>   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">初登日期</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="enrollDate" name="enrollDate"  
            placeholder="请填选初登日期" onclick="laydate()">
      </div>
   </div>   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">车型名称</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="modelName" name="modelName" 
            placeholder="别克SGM7240GA" minlength="3" required>
      </div>
   </div>    
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-default">&nbsp;确&nbsp;&nbsp;定&nbsp;</button>
      </div>
   </div>
</form>

</body>
</html>