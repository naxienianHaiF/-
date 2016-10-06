package com.baobeisystem.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baobeisystem.dao.car.CarInfoDao;
import com.baobeisystem.dao.user.BBSuserDao;
import com.baobeisystem.dao.waiwang.DBAreaDao;
import com.baobeisystem.entity.CarInfo;
import com.baobeisystem.entity.CarInfoKey;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class TestWaiWang {

	@Autowired
	private DBAreaDao dbAreaDao;
	@Autowired
	private BBSuserDao bBSUserDao;
	@Test
	public void test(){
		System.out.println(dbAreaDao);
		System.out.println(dbAreaDao.getDBAreaByUsername("421126"));
		System.out.println(dbAreaDao.getLicensePrefixByShortname("天津市"));
		System.out.println(bBSUserDao);
		System.out.println(bBSUserDao.getClass());
		System.out.println(bBSUserDao.getBBSuserByUsername("wjh"));
	}
	
	@Autowired
	private CarInfoDao carInfoDao;
	@Test
	public void carInfo(){
		System.out.println(carInfoDao);
		CarInfoKey carInfoKey=new CarInfoKey();
		carInfoKey.setLicenseNo("BC12120");
		carInfoKey.setOwner("天津房管处");
		System.out.println(carInfoDao.selectByPrimaryKey(carInfoKey));
		System.out.println(carInfoDao.selectByLicenseNo("BC12120"));
	}
	
	@Test
	public void carSerach(){
		List<CarInfo> list=carInfoDao.selectByBrandName("CAF7702A");
		for (CarInfo carInfo : list) {
			System.out.println(carInfo);
//			System.out.println(carInfo.getLicenseNo());
//			System.out.println(carInfo.getBrandName());
//			System.out.println(carInfo.getOwner());
		}
	}
}
