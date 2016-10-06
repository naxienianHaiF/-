<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>

<!--用百度的静态资源库的cdn安装bootstrap环境-->
		<!-- Bootstrap 核心 CSS 文件 -->
		<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
		<!--font-awesome 核心我CSS 文件-->
		<link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- 在bootstrap.min.js 之前引入 -->
		<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
		<!-- Bootstrap 核心 JavaScript 文件 -->
		<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<!--jquery.validate-->
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.validate.min.js" ></script>
		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-select.css">
		<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
		<style type="text/css">
			/* body{background: url(img/4.jpg) no-repeat;background-size: cover;font-size: 16px;} */
			.form{background: rgba(255,255,255,0.2);width:200px;margin:10px auto;}
			/*#login_form{display: block;}
			#register_form{display: none;}
			*/
			.fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}
			input[type="text"],input[type="password"]{padding-left:26px;}
			.checkbox{padding-left:21px;}
		</style>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#wjhUpdate").click(function(){
					var url="update.do";
					var str=$("#rewrite").serialize();
					$.post(url,str,function(data){
						alert(data);
					});
					$(":input","#ApplicationList")  
					.not(":button, :submit, :reset, :hidden")  
				 	.val("")  
				 	.removeAttr("checked")  
				 	.removeAttr("selected"); 
				});

			});
		</script>

</head>
<body>
	<div class="container">
		<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="rewrite" >
			<h4>修改个人信息</h4>
			<div class="col-sm-9 col-md-9">				
				<div class="form-group">
						<i class="fa fa-user fa-lg"></i>
						<input class="form-control" type="text" placeholder="昵称" name="nickname" autofocus="autofocus" maxlength="16"/>
					</div>
					<div class="form-group">
						<i class="fa fa-tag fa-lg"></i>
						<input class="form-control" type="text" placeholder="个性签名(最多60个字)" name="signature" maxlength="60"/>
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i>
						<input class="form-control" type="password" placeholder="新密码" id="register_password" name="password1"/>
					</div>
					<div class="form-group">
						<i class="fa fa-check fa-lg"></i>
						<input class="form-control" type="password" placeholder="再次输入新密码" name="rpassword"/>
					</div>
					<div class="form-group">
						<i class="fa fa-mobile fa-lg"></i>
						<input class="form-control" type="text" placeholder="手机号" name="phonenumber"/>
					</div>
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i>
						<input class="form-control" type="text" placeholder="年龄" name="age"/>
					</div>
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i>
						<input class="form-control" type="text" placeholder="职业" name="job"/>
					</div>
					<div class="form-group">
						<input type="button" class="btn btn-success pull-right" value="提交修改 " id="wjhUpdate"/>						
					</div>
			</div>
		</form>
		
		<script type="text/javascript">
			$("#rewrite").validate({
				rules:{
					password1: {
						minlength: 5
					},
					rpassword: {
						equalTo: "#register_password"
					},
					age:{
						digits:true
					}
				},
				messages: {
					password1: {
						minlength: jQuery.format("密码不能小于{0}个字符")
					},
					rpassword: {
						equalTo: "两次密码不一样"
					},
					age:{
						digits:"请输入整数"
					}
				}
			});
		</script>
	</div>

</body>
</html>