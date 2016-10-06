<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

</head>
<body>
<%-- <c:set var="wjh" value="奥迪AUDI RS5 COUPE 4.2FSI QUATTRO轿跑车"></c:set> --%>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">车型确定</h3>
<br />
<form class="form-horizontal col-sm-9 col-sm-offset-3" role="form" action="confirmOrder.do" method="post">
   <div class="form-group" align="left">
      <label for="firstname" class="col-sm-2 control-label">车型名称</label>
      <div class="col-sm-5">
      	  <input type="text" class="form-control" value="${carType.modelName}">
      </div>
   </div>
   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">能源类型</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="fuelType" name="fuelType" 
            placeholder="燃油" value="${carType.powerType }">
      </div>
   </div>
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">排量(升)</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="exhaustScale" 
         	name="exhaustScale" value="${carType.displacement/1000.0 } ">
      </div>
   </div>   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">功率</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="powerScale" 
         	name="powerScale" value="${carType.power }">
      </div>
   </div>  
    
    <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">座位数</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="lastname" 
         	name="ratedPassengerCapacity" value="${carType.ratedPassengerCapacity }">
      </div>
   </div> 
   
   <div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">是否过户车</label>
		&nbsp;&nbsp;&nbsp;
		<label class="radio-inline"> <input type="radio"
			name="chgOwnerFlag" id="guohuriqifou" value="0" checked="checked">否
		</label>
		<label class="radio-inline"> <input type="radio"
			name="chgOwnerFlag" id="guohuriqishi" value="1">是
		</label>
	</div>   

   <script type="text/javascript">
 		$(document).ready(function(){
			$("#guohuriqi").hide();
			$("#guohuriqishi").click(function(){
				$("#guohuriqi").show();
			});
			$("#guohuriqifou").click(function(){
				$("#guohuriqi").hide();
			});			
		});
   </script> 
 
     <div class="form-group" id="guohuriqi">
      <label for="lastname" class="col-sm-2 control-label">过户日期</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="lastname" name="guohuriqi" 
         	onclick="laydate()" placeholder="过户日期">
      </div>
   </div> 
   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">商业险起保日期</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="startDateBI" name="startDateBI" 
            placeholder="请填选初登日期" onclick="laydate()">
      </div>
   </div>   
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">交强险起保日期</label>
      <div class="col-sm-5">
         <input type="text" class="form-control" id="startDateCI" name="startDateCI" 
            placeholder="请填选初登日期" onclick="laydate()">
      </div>
   </div>    
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-primary">确认报价</button>
      </div>
   </div>
</form>

</body>
</html>
