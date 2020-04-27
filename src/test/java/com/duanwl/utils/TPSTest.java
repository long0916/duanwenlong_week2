package com.duanwl.utils;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.duanwl.common.utils.DateUtil;
import com.duanwl.common.utils.RandomUtil;
import com.duanwl.common.utils.StringUtil;

public class TPSTest {

	@Test
	public void test() {
		for(int i=0;i<100;i++) {
			TPS t = new TPS();
			//专家姓名属性值调用ZHStringUtil的getZHName()(5分)
			t.setName(ZHStringUtil.getZHName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间(5分)
			t.setAge(RandomUtil.random(1, 100));
			//薪酬是3万到8万，小数点后2位的随机数
			t.setSalary(RandNumUtil.random(30000, 80000));
			//聘用日期属性值模拟2012年1月1日至今任意随机时间
			Calendar c = Calendar.getInstance();
			c.set(2012, 1, 1);
			t.setPydate(DateUtil.random(c.getTime(), new Date()));
			t.setId(RandNumUtil.random(1, 100));
			
		   System.out.println(i+1+""+t);
		}
	}

}
