<%@page import="com.baobeisystem.entity.DBArea"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 确认投保，最后一个页面 -->
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
	<script src="<%=request.getContextPath()%>/js/bootstrap-datetimepicker.js"></script> 
	<script src="<%=request.getContextPath()%>/laydate/laydate.js"></script>
   
   
</head>

<body>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">确认投保</h3>
<br /><br />

<form class="form-horizontal col-sm-10 col-sm-offset-2" role="form" action="success.do" method="post" id="carfourForm">
   
   <div class="form-group">
      <label for="card" class="col-sm-3 control-label">新车购置价(1-1)</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="purchasePrice" value="1.0(137800)">
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">公允价值(0.7-1.3)</label>
      <div class="col-sm-5">
      	 <input type="text" class="form-control" name="jindou" value="1(137800)">
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">期望折扣(0.8075-1.3225)</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="jindou" 
         name="expectDiscount" placeholder="请输入">
      </div>
   </div>  
    
<!--    <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">是否过户车</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="yindou" name="chgOwnerFlag">
      </div>
   </div>  --> 
   
   <div class="form-group">
		<label for="chgOwnerFlag" class="col-sm-3 control-label">是否过户车</label>
		&nbsp;&nbsp;&nbsp;
		<label class="radio-inline"> <input type="radio"
			name="chgOwnerFlag" id="guohuriqifou" value="0" checked="checked">否
		</label>
		<label class="radio-inline"> <input type="radio"
			name="chgOwnerFlag" id="guohuriqishi" value="1">是
		</label>
	</div>    
 
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">商业即时生效</label>
<!--       <div class="col-sm-5">
         <input type="checkbox" align="left">
      </div> -->
		&nbsp;&nbsp;&nbsp;
		<label class="radio-inline"> <input type="radio"
			name="syjssx" id="guohuriqifou" value="0" checked="checked">否
		</label>
		<label class="radio-inline"> <input type="radio"
			name="syjssx" id="guohuriqishi" value="1">是
		</label>           
   </div>
     
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">商业险起始日期</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="startDateCIP" onclick="laydate()" value="2016-08-28">
      </div> 
   </div>     

   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">交强即时生效</label>
		&nbsp;&nbsp;&nbsp;
		<label class="radio-inline"> <input type="radio"
			name="jqjssx" id="guohuriqifou" value="0" checked="checked">否
		</label>
		<label class="radio-inline"> <input type="radio"
			name="jqjssx" id="guohuriqishi" value="1">是
		</label> 
   </div>
  
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">交强险起始日期</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="startDateBZ" onclick="laydate()" value="2016-08-28">
      </div> 
   </div>     
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">车主</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="chezhu" value="wjh">
      </div>
   </div>
     
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">手机</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="phone">
      </div>
   </div>
     
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">证件类型</label>
      <div class="col-sm-5">
      <select  class="selectpicker" data-live-search="false" name="identifyType">
  		<option value="01">身份证</option>
      	<option value ="02">护照</option>  
	  </select>
	  <label><input type="text" class="form-control" name="identifyNumber"></label>
	  </div>
   </div>
     
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">地址</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address" placeholder="请输入">
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">被保险人</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 
   
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">投保人</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 
   
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">特别约定</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 
    
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">配送方式</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 
   
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">签收人姓名</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 
    
   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">签收人电话</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 

   <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">签收人地址</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address" placeholder="请输入">
      </div>
   </div> 
 
    <div class="form-group">
      <label for="lastname" class="col-sm-3 control-label">影像信息</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" name="address">
      </div>
   </div> 
                         
   <div class="form-group">
      <div class="col-sm-offset-3 col-sm-9">
         <button type="submit" class="btn btn-default">&nbsp;确&nbsp;&nbsp;认&nbsp;</button>
      </div>
   </div>
</form>

</body>
</html>