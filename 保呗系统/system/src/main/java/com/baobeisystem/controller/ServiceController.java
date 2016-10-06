package com.baobeisystem.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务查询模块控制器
 * @author WJH
 * @version 1.0
 */
@Controller
public class ServiceController {

/*	@RequestMapping("/businessquery.do")
	public String businessquery(){
		return "service/myservice";
	}*/
	@RequestMapping("/carInsurance.do")
	public String carInsurance(){
		return "service/carInsurance";
	}
	@RequestMapping("/accidentInsurance.do")
	public String accidentInsurance(){
		return "service/accidentInsurance";
	}
/*	@RequestMapping("{value}/getService.do")
	public String getService(@PathVariable String value){
		System.out.println(value);
		int val=Integer.parseInt(value);
		System.out.println(methods[val]);
		return "service/serviceStatus";
	}*/
	@RequestMapping("/carInsuranceOrder.do")
	public String carInsuranceOrder(){
		//service/carInsuranceOrder
		return "service/carInsuranceOrder";
	}
	
	@RequestMapping("/searchCarInformation.do")
	public void searchCarInformation(HttpServletRequest request,HttpServletResponse response){
		System.out.println("用户名："+request.getSession().getAttribute("username"));
		System.out.println("company:"+request.getParameter("company"));
		try {
			response.getWriter().print("cha xun success...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
