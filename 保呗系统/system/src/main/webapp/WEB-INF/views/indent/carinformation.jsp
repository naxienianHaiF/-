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
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("select").change(function() {
				alert("jiayou...");
				var url="carTypeSearch.do";
				var str=$("#carInfo").serialize();
				$.post(url,str,function(data){
					alert(data);
					var html="";
					for(var i=0;i<data.length;i++){
						html+="<tr><td>"+data[i].modelName+"</td><td>"+data[i].replacementValue+
							"</td><td>"+data[i].modelCode+"</td>"+
							"<td><a href='carTypeConfirm.do?name="+data[i].modelCode+"'>车型确定</a></td></tr>";
					}
					$("#tbodyJson").html(html);
				});
			});
		});
	</script>
	
</head>
<body>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<h3 align="center">车辆信息</h3>
<br /><br />

<form class="form-horizontal" role="form" action="" id="carInfo">   
  	<div class="container">
		<div class="row">
    	<div class="col-md-4">
    		<select id="carYear" class="selectpicker"  data-live-search="false" title="年款" name="carYear">
				<option value ="0" selected="selected">年款</option>  
		      	<option value ="2010" id="changan">2010</option>  
		      	<option value ="2011" id="changan">2011</option>
		      	<option value ="2012" id="changan">2012</option>
		      	<option value ="2013" id="changan">2013</option>
			</select>
    	</div>
    	<div class="col-md-4">
    		<select id="status" class="selectpicker" data-live-search="false" title="排量" name="exhaustScale">
				<option value ="0" selected="selected">排量</option>
		      	<option value ="3">3</option>  
		      	<option value ="2">2</option>
		      	<option value ="1">1</option>
		      	<option value ="6">6</option>
		      	<option value ="5">5</option>
		      	<option value ="4">4</option>
   			</select>
    	</div>
    	<div class="col-md-4">
    		<select id="company" class="selectpicker" data-live-search="false" title="变速箱类别" name="derailleurType">
				<option value ="0" selected="selected">变速箱类别</option>  
		      	<option value ="1" id="changan">AMT</option>   
			</select>
    	</div>    	
    	</div>       	
	</div>
</form>	
	<br>
	<div class="container">
		<div class="row">
			<table class="table table-bordered">
				<thead>
					<tr>
		    		<td width="20%">车名称</td>
		    		<td width="20%">价格</td>
		    		<td width="20%">型号</td>
		    		<td width="20%">查看详情</td>
					</tr>
				</thead>
				<tbody id="tbodyJson">
					<c:forEach items="${carList }" var="car">
						<tr>
							<td>${car.modelName }</td>
							<td>${car.replacementValue }</td>
							<td>${car.modelCode }</td>
							<td><a href="carTypeConfirm.do?name=${car.modelCode }">车型确定</a></td>
						</tr>
					</c:forEach>					
				</tbody>
			</table>
		</div>
	<br>
	<div>
		<p>在这里显示</p>
		<a href="carTypeConfirm.do">车型确定</a>
		${wjh }<%=session.getAttribute("xcf") %>
	</div>


</body>
</html>
