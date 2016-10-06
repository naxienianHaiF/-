<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 车险保单 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
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

  </head>
  
  <body>
  <br>
<a href="" onclick="window.history.go(-1);" style="margin-left: 38px;">上一页 </a><br>  
  <br>
<div class="panel-group" id="accordion">

  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseOne" style="margin-left: 20px;">
          	保险信息
        </a>
      </h4>
    </div>
    <div id="collapseOne" class="panel-collapse collapse in">
      <div class="panel-body" style="margin-left: 20px;">
      	<br>
		交强险单号&nbsp;&nbsp;6050...   <br>
		交强险期限&nbsp;&nbsp;自2016-7-01 00:00起至2017-07-01 00:00止  <br>
		商业险单号&nbsp;&nbsp;6050...   <br>
		商业险期限&nbsp;&nbsp;自2016-7-01 00:00起至2017-07-01 00:00止  <br>
      </div>
    </div>
  </div>
  <div class="panel panel-success">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseTwo" style="margin-left: 20px;">
         	车辆信息
        </a>
      </h4>
    </div>
    <div id="collapseTwo" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			车牌号&nbsp;&nbsp;   <br>
			车架号&nbsp;&nbsp; LSDHDKDKDNBDBEAFD   <br>
			发动机号&nbsp;&nbsp;   <br>
			车型名称&nbsp;&nbsp;   <br>
			注册日期&nbsp;&nbsp;   <br>
			是否过户车&nbsp;&nbsp;   <br>
      </div>
    </div>
  </div>
  <div class="panel panel-info">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseThree" style="margin-left: 20px;">
     		车主信息
        </a>
      </h4>
    </div>
    <div id="collapseThree" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			姓名&nbsp;&nbsp;   <br>
			证件类型&nbsp;&nbsp; 居民身份证   <br>
			证件号&nbsp;&nbsp;   <br>
			手机号&nbsp;&nbsp;   <br>
			地址&nbsp;&nbsp;   山东省济南市<br>
      </div>
    </div>
  </div>
  
  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseFour" style="margin-left: 20px;">
         	投保人信息
        </a>
      </h4>
    </div>
    <div id="collapseFour" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			姓名&nbsp;&nbsp;   <br>
			证件类型&nbsp;&nbsp; 居民身份证   <br>
			证件号&nbsp;&nbsp;   <br>
			手机号&nbsp;&nbsp;   <br>
			地址&nbsp;&nbsp;   山东省济南市<br>
      </div>
    </div>
  </div> 
  
  <div class="panel panel-success">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseFive" style="margin-left: 20px;">
         	被投保人信息
        </a>
      </h4>
    </div>
    <div id="collapseFive" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			姓名&nbsp;&nbsp;   <br>
			证件类型&nbsp;&nbsp; 居民身份证   <br>
			证件号&nbsp;&nbsp;   <br>
			手机号&nbsp;&nbsp;   <br>
			地址&nbsp;&nbsp;   山东省济南市<br>
      </div>
    </div>
  </div>  

  <div class="panel panel-info">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseSix" style="margin-left: 20px;">
         	配送地址
        </a>
      </h4>
    </div>
    <div id="collapseSix" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			配送方式&nbsp;&nbsp;   <br>
			接收人&nbsp;&nbsp;    <br>
			联系电话&nbsp;&nbsp;   <br>
			地址&nbsp;&nbsp;   山东省济南市<br>
      </div>
    </div>
  </div>

  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseSeven" style="margin-left: 20px;">
         	交强险
        </a>
      </h4>
    </div>
    <div id="collapseSeven" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			车船税&nbsp;&nbsp;   270<br>
			交强险&nbsp;&nbsp;   950.0   <br>
      </div>
    </div>
  </div>

  <div class="panel panel-success">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseEight" style="margin-left: 20px;">
         	商业险
        </a>
      </h4>
    </div>
    <div id="collapseEight" class="panel-collapse collapse">
      <div class="panel-body" style="margin-left: 20px;">
			基本险&nbsp;&nbsp;   <br>
			&nbsp;&nbsp;&nbsp;&nbsp;车损险(92773.2)&nbsp;&nbsp;1504.94<br>
			&nbsp;&nbsp;&nbsp;&nbsp;三责险(500000)&nbsp;&nbsp;1243.94<br>
			附加险&nbsp;&nbsp;     <br>
			不计免赔&nbsp;&nbsp;     <br>
			&nbsp;&nbsp;&nbsp;&nbsp;机动车损失险&nbsp;&nbsp;243.94<br>
			&nbsp;&nbsp;&nbsp;&nbsp;商业第三者责任保险&nbsp;&nbsp;1243.94<br>
      </div>
    </div>
  </div>
   
</div>

  </body>
</html>
