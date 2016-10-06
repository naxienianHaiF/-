<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    	<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<!-- 可选的Bootstrap主题文件（一般不用引入） -->
		<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		<base target="iframeWJH"/>
		<style>
			body{
				width: 100%;
				height: 600px;
			}
			#left{ 
				float: left;
			    width: 15%;
			    height: 100%;
			}
			#right{
			 	float: left;
			    width: 80%;
			    height: 100%;
			    margin-top: 5%;
			}
		</style>
  </head>
  
  <body>
    <div id="left" style="margin-left:5px;margin-right: 10px;margin-top: 65px;margin-bottom: 10%;">
	    <!-- <div class="btn-group-vertical" role="group" aria-label="..."> -->
	    <h5>保呗WEB系统</h5><br><br><br><br>
	    <div class="btn-group-vertical" role="group">
			<!-- <a href="businessquery.do"><button type="button" class="btn btn-info" id="businessquery">业务查询</button></a> -->
			<a class="btn btn-primary" href="updateInformation.do" >修改信息</a>
			<a class="btn btn-success" href="carinsurancebuy.do" >车险购买</a>
			<div class="btn-group" role="group">
				<a class="btn btn-info" href="businessquery.do" data-toggle="dropdown" 
				aria-haspopup="true" aria-expanded="false">业务查询<span class="caret"></span></a>
				<ul class="dropdown-menu">
				    <li><a href="carInsurance.do">车险</a></li>
				    <li><a href="accidentInsurance.do">意外险</a></li>
    			</ul>
			</div>
			<a class="btn btn-danger" href="/system/" target="_parent" >退出</a>
	    </div>
	    <br />
    </div>    
    <div id="right">
        <iframe  height="100%" width="100%" frameborder="0" scrolling="auto" id="back" name="iframeWJH"></iframe>
    </div>
  </body>
</html>
