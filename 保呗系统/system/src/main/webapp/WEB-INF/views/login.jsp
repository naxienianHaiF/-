<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<!-- 可选的Bootstrap主题文件（一般不用引入） -->
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<base target="iframeWJH"/>
</head>
<body>
	<div class="page-header">
	  <h2>保呗系统 <small>WEB版</small></h2>
	</div>
	<ul id="myTab" class="nav nav-tabs">
	    <li class="active">
	      	<a href="#updateInformation" data-toggle="tab">修改信息</a>
	    </li>
	    <li><a href="#buyCarInsurance" data-toggle="tab">车险购买</a></li>
	    <li class="dropdown">
	      <a href="#" id="myTabDrop1" class="dropdown-toggle" 
	         data-toggle="dropdown">业务查询 
	         <b class="caret"></b>
	      </a>
	      <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
	         <li><a href="#carInsurance" tabindex="-1" data-toggle="tab">车险</a></li>
	         <li><a href="#accidentInsurence" tabindex="-1" data-toggle="tab">意外险</a></li>
	      </ul>
	   </li>
	   <li><a href="" onclick="window.location.href='exit.do?name=退出'" data-toggle="tab">退出</a></li>
	   <!-- <button type="button" class="btn btn-default navbar-btn" onclick="window.location.href='exit.do'"> 
          	退出
       </button>  -->
	</ul>
	
	<div id="myTabContent" class="tab-content">
   		<div class="tab-pane fade in active" id="updateInformation">
   			<div class="embed-responsive embed-responsive-16by9">
   				<iframe class="embed-responsive-item" src="updateInformation.do" height="450"></iframe>
   			</div>
   		</div>
   		
	   	<div class="tab-pane fade" id="buyCarInsurance">
   			<div class="embed-responsive embed-responsive-16by9">
   				<iframe class="embed-responsive-item" src="carinsurancebuy.do" height="450"></iframe>
   			</div>	   		
	   	</div>
	   	<div class="tab-pane fade" id="carInsurance">
   			<div class="embed-responsive embed-responsive-16by9">
   				<iframe class="embed-responsive-item" src="carInsurance.do" height="450"></iframe>
   			</div>	   		
	   	</div>
	  	<div class="tab-pane fade" id="accidentInsurence">
   			<div class="embed-responsive embed-responsive-16by9">
   				<iframe class="embed-responsive-item" src="accidentInsurance.do" height="450"></iframe>
   			</div>	  		
	   	</div>
	   	
	  	<div class="tab-pane fade" id="exit">
   			<div class="embed-responsive embed-responsive-16by9">
   				<iframe class="embed-responsive-item" src=""></iframe>
   			</div>	  		
	   	</div>		   	
	</div>
</body>
</html>