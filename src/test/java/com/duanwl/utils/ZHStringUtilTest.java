package com.duanwl.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZHStringUtilTest {
	//测试随机数字方法
	@Test
	public void testGetZHString() {
		String s = ZHStringUtil.getZHString(5);
		System.out.println(s);
	}
	//测试随机获取姓名方法
	@Test
	public void testGetZHName() {
		String z = ZHStringUtil.getZHName();
		System.out.println(z);
	}

}
