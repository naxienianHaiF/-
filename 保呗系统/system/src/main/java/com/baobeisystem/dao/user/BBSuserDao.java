package com.baobeisystem.dao.user;

import com.baobeisystem.entity.BBSuser;

public interface BBSuserDao {

	BBSuser getBBSuserByUsername(String str);
	void updateBBSuserByUsername(BBSuser user);
	int registerUser(BBSuser user);
	
}
