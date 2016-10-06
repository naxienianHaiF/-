package com.baobeisystem.dao.waiwang;

import com.baobeisystem.entity.DBArea;

public interface DBAreaDao {

	DBArea getDBAreaByUsername(String str);
	//根据市名查询车牌前缀
	String getLicensePrefixByShortname(String str);
}
