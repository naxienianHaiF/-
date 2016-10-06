<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/message.js" ></script>
		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-select.css">
		<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
		
</head>

<script type="text/javascript">
	function tab_change(obj){
		var id="#"+obj.id;
		if($(id).is(':checked'))
		{
		}
		else
		{
			$("#tab1").removeClass("active"); 
			$("#tab2").addClass("active");
			$("#base").hide(); //Hide all tab content  
	        var activeTab = $("#tab2").find("a").attr("href"); //Find the rel attribute value to identify the active tab + content  
	        $(activeTab).fadeIn();
		}
	}
</script>

<body>
<br />
<a href="" onclick="window.history.go(-1);" style="margin-left: 10px;">上一页 </a><br>
<br />
<div class="container" style="overflow: hidden;">
	<div class="row" style="overflow: hidden;">		
		<div class="col-sm-9 col-md-9 col-sm-offset-2 col-md-offset-2">
		<h3>方案</h3>
		<ul id="myTab" class="nav nav-tabs">
		   <li class="active" id="tab1">
		    	<a href="#base" data-toggle="tab">基础套餐</a>
		   </li>
		   <li id="tab2">
		   		<a href="#select" data-toggle="tab">自选套餐</a>
		   </li>
		   <script type="text/javascript">
		    	$("#tab1").on('shown.bs.tab', function (e){
		    		alert("基础套餐");
		    	});
		    	$("#tab2").on('shown.bs.tab', function (e){
		    		alert("自选套餐");
		    	});
			</script>
		</ul>		
		<div id="myTabContent" class="tab-content">
		   <div class="tab-pane fade in active" id="base">
		    
		   </div>
		   <div class="tab-pane fade" id="select">
		      
		   </div>
		</div>
		<div class="col-md-12">
		<h4>交强险</h4>
      	<form class="form-horizontal" id="rewrite" action="confirmOffer.do" method="post">
			<div class="col-sm-9 col-md-9">
				
				<div class="form-group">
					<label>交强险</label>
					
					<input type="checkbox" checked=="true" id="cb1" name="BZ">  <!-- sumPremiumCI -->
					&nbsp;&nbsp;&nbsp;&nbsp;
					<label id="jqx">122000</label>	
				<script type="text/javascript">
					$("#cb1").change(function(){
						tab_change(this);
						
					});
				</script>
				</div>
				
				<div class="form-group">
					<label>车船税缴纳类型</label>
					<select  id="company" class="selectpicker" data-live-search="false" title="车船税缴纳类型" name="carShipTax">
						<option value ="TaxFlagBDC">减税</option>  
  						<option value ="TaxFlagBDE">免税</option>
  						<option value ="TaxFlagQGN">正常纳税</option>
  						<option value ="TaxFlagBJR">拒缴</option>
  						<option value ="TaxFlagSHW">已完税</option>						
					</select>
				</div>
				<div class="row">
				<h4>商业险<input type="checkbox" name="sumPremiumBI" checked="checked"></h4>						
				<label>基本险</label><br/>
				</div>
				
				<div class="form-group">
					<label>车损险</label>								
					  <input type="checkbox" name="chesunxian" checked="checked">
					  &nbsp;&nbsp;&nbsp;&nbsp;
					  <input type="text"  name="zerenxian" value="137800"/>
					  <p class="pull-right">						  	
					  <input type="checkbox" checked="checked"> 不计免赔<br />
					  </p>	
				</div>
				
				<div class="form-group">
					<label>三责险</label>
					
					<input type="checkbox" checked="checked">&nbsp;&nbsp;&nbsp;&nbsp;
					<select  id="company" class="selectpicker" data-live-search="false" name="year">
						<option value ="1">5万</option>  
  						<option value ="2">10万</option>
  						<option value ="3">15万</option>
  						<option value ="4">20万</option>
  						<option value ="5">30万</option>
  						<option value ="6" selected="selected">50万</option>
  						<option value ="7">100万</option>
  						<option value ="8">大于100万</option>
					</select>
					<p class="pull-right">						  	
					  <input type="checkbox" checked="checked"> 不计免赔<br />
					</p>
					
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#sjzrx").hide();
						$("#sijizerenxian").click(function(){
							$("#sjzrx").toggle();
						});
					});
				</script>
				
				<div class="form-group">
					<label>司机责任险</label>								
					  <input type="checkbox" name="sijizerenxian" id="sijizerenxian"> <br/>
					  <div id="sjzrx">
						  <input type="text"  name="AD11"/>
						  <p class="pull-right">						  	
						  <input type="checkbox" checked="checked"> 不计免赔<br />
						  </p>	
					  </div>							
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#ckzrx").hide();
						$("#chengkezerenxian").click(function(){
							$("#ckzrx").toggle();
						});
					});
				</script>
				
				<div class="form-group">
					<label>乘客责任险</label>								
					<input type="checkbox" id="chengkezerenxian"> <br />
					<div id="ckzrx">
					  <input type="text" id="ckzrx"/>*
					  <input type="text" id="zuo" />座
					  <p class="pull-right">						  	
					  <input type="checkbox" checked="checked"> 不计免赔<br />
					  </p>
					</div>  							
				</div>
		
				<script type="text/javascript">
					$(document).ready(function(){
						$("#qcdqx").hide();
						$("#quanchedaoqiangxian").click(function(){
							$("#qcdqx").toggle();
						});
					});
				</script>
						
				<div class="form-group">
					<label>全车盗抢险</label>
					<input type="checkbox" id="quanchedaoqiangxian"> <br/>
					<div id="qcdqx">								
					  <input type="text" id="qcdqx" name="AG"/>
					  <p class="pull-right">						  	
					  <input type="checkbox" checked="checked"> 不计免赔<br />
					  </p>
					</div>  								
				</div>
				<div class="row">
				<label>附加险</label>						
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#blpsx").hide();
						$("#boliposuixian").click(function(){
							$("#blpsx").toggle();
						});
					});
				</script>				
				
				<div class="form-group">
					<label>玻璃破碎险</label>								
				    <input type="checkbox" id="boliposuixian"> <br />
				    <div id="blpsx">
					    <select  id="company" class="selectpicker" data-live-search="false" title="玻璃破碎险" name="year">
							<option value ="1">国产玻璃</option>  
	  						<option value ="2">进口玻璃</option>						
						</select>
					</div>						
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#cshhx").hide();
						$("#cheshenhuahengxian").click(function(){
							$("#cshhx").toggle();
						});
					});
				</script>				
				
				<div class="form-group">
					<label>车身划痕险</label>								
				    <input type="checkbox" id="cheshenhuahengxian"> <br />
				    <div id="cshhx">
					    <select  id="company" class="selectpicker" data-live-search="false" title="车身划痕险" name="year">
							<option value ="1">2千</option>  
	  						<option value ="2">5千</option>	
	  						<option value ="3">1万</option>  
	  						<option value ="4">2万</option>
						</select>
						<p class="pull-right">						  	
						<input type="checkbox" checked="checked"> 不计免赔<br />
						</p>
					</div>								
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#fdjssx").hide();
						$("#fadongjisunshixian").click(function(){
							$("#fdjssx").toggle();
						});
					});
				</script>				
				
				<div class="form-group">
					<label>发动机损失险</label>								
				    <input type="checkbox" id="fadongjisunshixian"> <br />
				    <div id="fdjssx">
					    <input type="text" id="fdjssx"/>
						<p class="pull-right">						  	
						<input type="checkbox" checked="checked"> 不计免赔<br />
						</p>
					</div>								
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#zrssx").hide();
						$("#ziransunshixian").click(function(){
							$("#zrssx").toggle();
						});
					});
				</script>				
				
				<div class="form-group">
					  <label>自燃损失险</label>								
					  <input type="checkbox" id="ziransunshixian"> <br />
					  <div id="zrssx">
						  <input type="text" id="zrssx" name="AZ"/>
						  <p class="pull-right">						  	
						  	<input type="checkbox" checked="checked"> 不计免赔<br />
						  </p>	
					  </div>							
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#zxcty").hide();
						$("#zxctyx").click(function(){
							$("#zxcty").toggle();
						});
					});
				</script>				
				
				<div class="form-group">
					<label>专修厂特约</label>								
					  <input type="checkbox" id="zxctyx" name="J1"> <br />
					  <div id="zxcty">
					  <label id="gcjk">进口（0.15-0.6）</label> 
					  <input type="text" id="zxcty"/>
					  </div>								
				</div>
				
				<script type="text/javascript">
					$(document).ready(function(){
						$("#dsftyx").hide();
						$("#disanfang").click(function(){
							$("#dsftyx").toggle();
						});
					});
				</script>
								
				<div class="form-group">
					<label>第三方特约险</label>								
					  <input type="checkbox" id="disanfang">
					  <div id="dsftyx" class="pull-right">
						  <input type="text" id="dsftyx" placeholder="请输入保额"/>								
					  </div>
				</div>
				
				<div class="form-group">
					<input type="submit" class="btn btn-default pull-left" value="开始报价"/>						
				</div>
			</div>
			
		</form>
    </div>
	</div>
		
	</div>
	
</div>
</body>
</html>