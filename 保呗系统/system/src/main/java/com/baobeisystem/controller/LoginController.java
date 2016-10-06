package com.baobeisystem.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baobeisystem.dao.user.BBSuserDao;
import com.baobeisystem.entity.BBSuser;
/**
 * 登陆注册模块控制器
 * @author WJH
 * @version 1.0
 */
@Controller
public class LoginController {

	@Autowired
	private BBSuserDao bBSuserDao;
	//登陆
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		System.out.println("用户名："+username+",密码："+password);
		//如果根据用户名查询不到数据，则返回null
		BBSuser user=bBSuserDao.getBBSuserByUsername(username);
		String result=new String();
		if(password.length()!=0 && user!=null && password.equals(user.getPassword())){
			result="login";
		}else {
/*			request.setAttribute("waringInformation", "用户名或密码错误！请重新输入");
			result="error/errorPage";*/
		}
		return result;
	}
	//注册
	@RequestMapping("/register.do")
	public void register(HttpServletRequest request,HttpServletResponse response){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		System.out.println(username+","+password+","+email);
		
		BBSuser user=new BBSuser();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		System.out.println("成功插入了"+bBSuserDao.registerUser(user)+"行记录。。。");
		
		String string="注册成功";
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//修改个人信息
	@RequestMapping("/updateInformation.do")
	public String updateInformation(){
		return "updateInformation";
	}
	//
	@RequestMapping("/update.do")
	public void update(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		BBSuser user=new BBSuser();
		user.setUsername((String) session.getAttribute("username"));
		user.setNickname(request.getParameter("nickname"));
		user.setSignature(request.getParameter("signature"));
		user.setPassword(request.getParameter("password1"));
		user.setPhonenumber(request.getParameter("phonenumber"));
		if(request.getParameter("age")!=""){
			user.setAge(Byte.parseByte(request.getParameter("age")));
		}else{
			user.setAge((byte)0);
		}
		user.setJob(request.getParameter("job"));
		System.out.println(user);
		bBSuserDao.updateBBSuserByUsername(user);
		
		System.out.println("登陆用户名："+request.getSession().getAttribute("username"));
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().print("信息修改成功...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//退出
	@RequestMapping("/exit.do")
	public String exit(){
		return "error/errorPage";
	}
	
}
