package com.baobeisystem.test;

import java.util.List;

import org.junit.Test;

import com.baobeisystem.entity.carSearch.CarModelDTO;
import com.baobeisystem.entity.carSearch.CarModelInfo;
import com.baobeisystem.entity.carSearch.CarTypeSearch;

public class TestHttp {

	@Test
	public void httpTest(){
		CarModelInfo car=new CarModelInfo();
		car.setLicenseNo("京C34567");
		car.setEngineNo("F01020304");
		car.setFrameNo("LSHUJINFGH4857639");
		car.setVinNo("LSHUJINFGH4857639");
		car.setVehicleBrand("大众");
		car.setVehicleModel("大众桑塔纳");
		car.setEnrollDate("2012-10-11");
		car.setCarkindcode("");
		car.setStartdate("2016-09-01");
		car.setIndustryModelCode("");
		car.setCarType2("");
		car.setCarType3("");
		car.setReplacement("");
		car.setCarBookingTime("");
		
		String url="http://120.55.174.144:7106/";
		List<CarModelDTO> list=CarTypeSearch.testPost(url, car);
		for (CarModelDTO carModelDTO : list) {
			System.out.println(carModelDTO);
		}
	}
	
}
