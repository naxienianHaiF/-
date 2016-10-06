package com.baobeisystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobeisystem.dao.car.CarInfoDao;
import com.baobeisystem.entity.CarInfo;

@Service
public class CarService {
	
	@Autowired
	private CarInfoDao carInfoDao;
	
	public List<CarInfo> searchCarInformation(String string){
		StringBuffer result=new StringBuffer(); 
		String[] str=string.split("\\s+");
		for(int i=0;i<str.length;i++){
			if(i==str.length-1){
				result.append(str[i]);
			}else {
				result.append(str[i]).append("%");
			}
		}
		List<CarInfo> list=carInfoDao.selectByBrandName(new String(result));
		return list;
	}
}
