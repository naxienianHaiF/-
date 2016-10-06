<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		 
		<script type="text/javascript">
			$(document).ready(function(){
				$("#wjhSearch").click(function(){
				
	    			var companySelect=document.getElementById("company");
	    			var companyIndex=companySelect.selectedIndex;
	    			var statusSelect=document.getElementById("status");
	    			var statusIndex=statusSelect.selectedIndex;
	    			var dateValue=$("#date").val();
	    			
	    			alert(companySelect.options[companyIndex].text+"："+companySelect.options[companyIndex].value+
	    				","+statusSelect.options[statusIndex].text+"："+statusSelect.options[statusIndex].value
	    				+","+dateValue);
	    				
	    			var str={"company":companySelect.options[companyIndex].value,
	    					 "status":statusSelect.options[statusIndex].value,
	    					 "date":dateValue};
	    			var url="searchCarInformation.do";
	    			$.post(url,str,function(data){
	    				alert(data);
	    			});
	    		}); 	    			
			});
		</script>
		       
    <title>My JSP 'carInsurance.jsp' starting page</title>
  </head>
  
  <body >
  <br>
  	<div class="container">
		<div class="row">
    	<div class="col-md-3">
    		<select id="company" class="selectpicker" data-live-search="false" title="保险公司" name="company">
				<option value ="00" selected="selected">全部</option>  
		      	<option value ="01" id="changan">长安保险</option>  
			</select>
    	</div>
    	
    	<div class="col-md-3">
    		<select id="status" class="selectpicker" data-live-search="false" title="状态" name="status">
				<option value ="2" selected="selected">状态</option>  <!-- 状态和全部查询的结果是一样的 -->
		      	<option value ="3">全部</option>
		      	<option value ="4">未完成</option>  
		      	<option value ="5">待核保</option>
		      	<option value ="6">待支付</option>
		      	<option value ="7">已支付</option>
		      	<option value ="8">已完成</option> 
		      	<option value ="9">支付失败</option>
		      	<option value ="10">核保失败</option>
		      	<option value ="11">落地失败</option> 		      	   			
   			</select>
    	</div>
    	<div class='col-md-3'>
            <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" id="date" name="datetime" onclick="laydate()"/>
                </div>
            </div>
        </div>
        
    	<div class='col-md-3'>
            <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='button' class="form-control" value="搜索" id="wjhSearch"/>
                </div>
            </div>
        </div>   
        
	</div>
	<br />
	<div class="container">
		<div class="row">
			<table class="table table-bordered">
				<thead>
					<tr>
		    		<td>车主</td>
		    		<td>支付状态</td>
		    		<td>车牌号</td>
		    		<td>订单日期</td>
		    		<td>金豆</td>
		    		<td>银豆</td>
		    		<td>查看详情</td>
					</tr>
				</thead>
				<tbody>
					<tr class="active">
		    		<td>周佳雯</td>
		    		<td>已完成</td>
		    		<td>89741974191234567</td>
		    		<td>2016-05-06</td>
		    		<td>1234434.5</td>
		    		<td>银豆</td>
		    		<td><a href="carInsuranceOrder.do" target="_self">查看详情</a></td>						
					</tr>
					<tr class="success">
		    		<td>订单人</td>
		    		<td>支付状态</td>
		    		<td>车牌号</td>
		    		<td>订单日期</td>
		    		<td>金豆</td>
		    		<td>银豆</td>
		    		<td><a href="carInsuranceOrder.do" target="_self">查看详情</a></td>						
					</tr>					
				</tbody>
			</table>
		</div>
	</div>
</body>

</html>
