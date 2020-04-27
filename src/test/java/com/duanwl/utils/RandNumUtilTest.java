package com.duanwl.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		double d = RandNumUtil.getValue(25400.56, 67078.94, 2);
		System.out.println(d);
	}

	@Test
	public void testRandom() {
		int i = RandNumUtil.random(1, 3);
		System.out.println(i);
	}

}
