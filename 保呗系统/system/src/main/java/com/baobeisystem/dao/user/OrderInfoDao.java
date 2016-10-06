package com.baobeisystem.dao.user;

import java.util.List;

import com.baobeisystem.entity.OrderInfo;

public interface OrderInfoDao {

	public List<OrderInfo> getByOusername(String str);
}
