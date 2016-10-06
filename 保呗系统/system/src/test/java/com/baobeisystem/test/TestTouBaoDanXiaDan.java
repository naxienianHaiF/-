package com.baobeisystem.test;

import org.junit.Test;

import com.baobeisystem.http.TouBaoDanXiaDan;

public class TestTouBaoDanXiaDan {

	@Test
	public void test(){
		String url="http://120.55.174.144:7106/";
		TouBaoDanXiaDan.testPost(url);
	}
}
