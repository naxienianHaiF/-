package com.baobeisystem.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baobeisystem.dao.user.BBSuserDao;
import com.baobeisystem.dao.waiwang.DBAreaDao;
import com.baobeisystem.entity.carSearch.CarModelDTO;
import com.baobeisystem.entity.carSearch.CarModelInfo;
import com.baobeisystem.entity.carSearch.CarTypeSearch;
import com.baobeisystem.service.CarService;

/**
 * 出单模块控制器
 * @author WJH
 * @version 1.0
 */
@Controller
public class IndentController {
	
	private List<CarModelDTO> listCarModelDTO;
	private CarModelInfo car=new CarModelInfo();
	private String url="http://120.55.174.144:7106/";
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private DBAreaDao dBArdeaDao;
	@Autowired
	private BBSuserDao bBSuserDao;
	
	@RequestMapping("/carinsurancebuy.do")
	public String carinsurancebuy(HttpSession session){
		session.setAttribute("xcf", "wjhxcf");
		return "indent/startprice";
	}
	@RequestMapping("/carfour.do")
	public String carfour(HttpServletRequest request,HttpSession session){
		System.out.println("车主："+request.getParameter("carOwner"));
//		DBArea dbArea=dBArdeaDao.getDBAreaByUsername("000000");
//		session.setAttribute("dbArea", dbArea);
		
		String licenseNo=request.getParameter("licenseNo");
		System.out.println(licenseNo);
		car.setLicenseNo(licenseNo);
		
		return "indent/carfour";
	}
	//车辆信息
	@RequestMapping("/carinformation.do")
	public String carinformation(HttpServletRequest request,HttpSession session){
		String str=request.getParameter("modelName");
		System.out.println("车型号："+str);
		
		String frameNo=request.getParameter("frameNo");
		String engineNo=request.getParameter("engineNo");
		String enrollDate=request.getParameter("enrollDate");
		
		car.setFrameNo(frameNo);
		car.setEngineNo(engineNo);
		car.setVinNo(engineNo);
		car.setEnrollDate(enrollDate);

		String vehicleBrand="";
		String vehicleModel="";
		String modelName=request.getParameter("modelName");
		String regex="[\\u4e00-\\u9fa5]+";    //一个或者多个中文的正则表达式
		for(int i=0;i<modelName.length();i++){
			String s=new String(modelName.substring(0, i+1));
			if (s.matches(regex)) {
				vehicleBrand=s;
			}
		}
		vehicleModel=modelName.substring(vehicleBrand.length());
		car.setVehicleBrand(vehicleBrand);
		car.setVehicleModel(vehicleModel);
		
//		car=new CarModelInfo();
//		car.setLicenseNo("京C34567");
//		car.setEngineNo("F01020304");
//		car.setFrameNo("F01020304");
//		car.setVinNo("F01020304");
//		car.setEnrollDate("2012-10-11");
		car.setCarkindcode("");
		car.setStartdate("2015-10-01");
		car.setIndustryModelCode("");
		car.setCarType2("");
		car.setCarType3("");
		car.setReplacement("");
		car.setCarBookingTime("");
		
		listCarModelDTO=CarTypeSearch.testPost(url, car);
		session.setAttribute("carList", listCarModelDTO);
		
		return "indent/carinformation";
	}
	//车型确定
	@RequestMapping("carTypeConfirm.do")
	public String carTypeConfirm(@RequestParam String name,
			HttpServletRequest request,HttpSession session){
		System.out.println(name);
		for (int i = 0; i < listCarModelDTO.size(); i++) {
			if(name.equals(listCarModelDTO.get(i).getModelCode())){
				System.out.println(listCarModelDTO.get(i));
				session.setAttribute("carType", listCarModelDTO.get(i));
			}
		}
		return "indent/carTypeConfirm";
	}
	//确认报价
	@RequestMapping("/confirmOrder.do")
	public String confirmOrder(){
		return "indent/plan";
	}
	//选择保险
	@RequestMapping("/confirmOffer.do")
	public String confirmOffer(){
		return "indent/confirmOffer";
	}
	
	@RequestMapping("/carTypeSearch.do")
	@ResponseBody
	public List<CarModelDTO> carTypeSearch(HttpServletResponse response,
			HttpServletRequest request){
		List<CarModelDTO> search=new ArrayList<CarModelDTO>();
		String carYear=request.getParameter("carYear");
		System.out.println("年款"+carYear);
		String exhaustScale=request.getParameter("exhaustScale");  //排量
		System.out.println("排量"+exhaustScale);
//		String derailleurType=request.getParameter("derailleurType");
		String str=new String();
		for(int i=0;i<listCarModelDTO.size();i++){
			str=listCarModelDTO.get(i).getDisplacement();
			double d=Double.parseDouble(str);
			int ex=(int)(d-500)/1000+1;
			if("0".equals(carYear) && "0".equals(exhaustScale)){
				return listCarModelDTO;
			}else if ("0".equals(carYear) && ex==Integer.parseInt(exhaustScale)) {
				search.add(listCarModelDTO.get(i));
			}else if ("0".equals(exhaustScale) && listCarModelDTO.get(i).getMarketYear().contains(carYear)) {
				search.add(listCarModelDTO.get(i));
				continue;
			}else if(listCarModelDTO.get(i).getMarketYear().contains(carYear) &&
					ex==Integer.parseInt(exhaustScale) ){
				search.add(listCarModelDTO.get(i));
			}
		}
		if (search.size()==0) {
			CarModelDTO cNull=new CarModelDTO();
			cNull.setModelName("查无记录");
			cNull.setReplacementValue(0.0);
			cNull.setModelCode("Void");
			search.add(cNull);
		}
		return search;
	}
	
	@RequestMapping("/getLicensePrefixByShortname.do")
	public void getLicensePrefixByShortname(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String str=request.getParameter("city");
		String licensePrefix=dBArdeaDao.getLicensePrefixByShortname(str);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(licensePrefix);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/changanbaoxian.do")
	public String changanbaoxian(){
		return "indent/changAnbaoxian";
	}
	
	@RequestMapping("/confirmToubao.do")
	public String confirmToubao(){
		return "indent/confirmToubao";
	}
	
	@RequestMapping("/success.do")
	public String success(HttpServletRequest request,HttpSession session){
//		String ousername=(String)session.getAttribute("username");
		
		return "indent/success";
	}
}
