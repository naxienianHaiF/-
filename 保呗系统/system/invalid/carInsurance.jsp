<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>" target="serviceWJH">
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
		       
    <title>My JSP 'carInsurance.jsp' starting page</title>
    

  </head>
  
  <body >
  	<div class="container">
  <!-- 		<nav class="navbar navbar-default">
  		<div class="container-fluid">
  		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav nav-tabs">
			<li role="presentation" class="dropdown"><a
				class="dropdown-toggle" data-toggle="dropdown" href="#" role="button"
				aria-haspopup="true" aria-expanded="false">全部<span
					class="caret"></span>
			</a>
			<ul class="dropdown-menu">
				<li role="presentation"><a href="0/getService.do">全部</a></li>
				<li role="presentation"><a href="1/getService.do">长安</a></li>
			</ul>
			</li>
			<li role="presentation" class="dropdown"><a
				class="dropdown-toggle" data-toggle="dropdown" href="#" role="button"
				aria-haspopup=true aria-expanded="true">状态<span
					class="caret"></span>
			</a>
			<ul class="dropdown-menu">
				<li role="presentation"><a href="2/getService.do">全部</a></li>
				<li role="presentation"><a href="3/getService.do">未完成</a></li>
				<li role="presentation"><a href="4/getService.do">待核保</a></li>
				<li role="presentation"><a href="5/getService.do">待支付</a></li>
				<li role="presentation"><a href="6/getService.do">已支付</a></li>
				<li role="presentation"><a href="7/getService.do">已完成</a></li>
				<li role="presentation"><a href="8/getService.do">支付失败</a></li>
			</ul>
			</li>
			<form class="navbar-form navbar-left" action="baobeiTime.do" method="post">
				<button type="submit" class="btn btn-link">日期</button>
				<div class="form-group">
					<input type="text" class="form-control" name="baobeiTime" size="15px" onclick="laydate()">
				</div>
			</form>
			<form class="navbar-form navbar-left" role="search">
        		<button type="submit" class="btn btn-default">Submit</button>
        		<div class="form-group">
         			<input type="text" class="form-control" placeholder="Search">
       			</div>
      		</form>
		</ul>
		</div>
		</div>
		</nav> -->
		<div class="row">
    	<div class="col-md-4">
    		<select id="company" class="selectpicker" data-live-search="false" title="保险公司" name="company">
				<option value ="0" selected="selected">查询所有</option>  
		      	<option value ="1" id="hehe">长安保险</option>  
			</select>
    	</div>
    	<div class="col-md-4">
    		<select id="status" class="selectpicker" data-live-search="false" title="状态" name="status">
				<option value ="2" selected="selected">状态</option>  <!-- 状态和全部查询的结果是一样的 -->
		      	<option value ="2">全部</option>
		      	<option value ="3">未完成</option>     			
   			</select>
    	</div>
    	<div class='col-md-4'>
            <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" id="date" name="datetime" onclick="laydate()"/>
                </div>
            </div>
        </div>
    	</div>
	</div>
	<div class="container">
        <iframe  height="500px" width="100%" frameborder="0" scrolling="auto" id="back" name="serviceWJH">
        </iframe>
    </div>
</body>
</html>
