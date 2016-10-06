package com.baobeisystem.dao.car;

import java.util.List;

import com.baobeisystem.entity.CarInfo;
import com.baobeisystem.entity.CarInfoKey;

public interface CarInfoDao {
    int deleteByPrimaryKey(CarInfoKey key);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectByPrimaryKey(CarInfoKey key);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
    /**
     * 根据LICENSE_NO查询CarInfo信息
     * @param str LICENSE_NO值
     * @return CarInfo对象
     */
    CarInfo selectByLicenseNo(String str);
    
    List<CarInfo> selectByBrandName(String str);
}