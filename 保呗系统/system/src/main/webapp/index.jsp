<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!doctype html>
<html>
<head>
	<link rel="shortcut icon" href="image/shu.ico" />
	<title>保呗系统</title>
	<!-- 第一个CSS是登陆页面的CSS -->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styles.css">
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.1.0.js"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
	<script>
		$().ready(function() {
		    $("#commentForm").validate();
		});
	</script>
		<script>
		$().ready(function() {
		    $("#registerForm").validate();
		});
	</script>
	<!-- 注册ajax -->
	<script type="text/javascript">
		$(document).ready(function(){
			$("#registerWJH").click(function(){
				var url="register.do";
				var shuju=$("#registerForm").serialize();
				$.post(url,shuju,function(data){
					alert(data);
					console.log("注册成功...");
				});
			});
		});
	</script>
</head>
<body>
	<div class="jq22-container" style="padding-top:0px">
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">登陆</label>
				<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">注册</label>
				<div class="login-form">
					<div class="sign-in-htm">
						<!-- 登陆 -->
						<form action="login.do" method="post" id="commentForm">
							<div class="group">
								<label for="user" class="label">用户名</label>
								<input id="user" type="text" class="input" name="username" minlength="3" required>
							</div>
							<div class="group">
								<label for="pass" class="label">密码</label>
								<input id="pass" type="password" class="input" name="password">
							</div>

							<div class="group">
								<input type="submit" class="button" value="登陆">
							</div>
							
<!-- 							<label style="color: red;" id="loginlabel">aaa</label> -->
														
						</form>
					</div>
					<div class="sign-up-htm">
						<!-- 注册 -->
						<form action="" method="post" id="registerForm">
							<div class="group">
								<label for="user" class="label">用户名</label> <input id="user"
									type="text" class="input" name="username" minlength="3" required>
							</div>
							<div class="group">
								<label for="pass" class="label">密码</label> <input id="pass"
									type="password" class="input" data-type="password" name="password"
									minlength="6" required>
							</div>
							<div class="group">
								<label for="pass" class="label">邮箱</label>
								<input id="pass" class="input"  type="email" name="email" required>
							</div>
							<div class="group">
								<input type="submit" class="button" value="注册" id="registerWJH">
							</div>
						</form>
						<div class="hr"></div>
						<div class="foot-lnk">
							<label for="tab-1">已有账号?</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>