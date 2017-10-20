package cn.jwdsy.test;

import java.math.BigDecimal;

/**
 * Created by zhangfei5 on 2017/9/27.
 */
public class Master {
	public static void main(String[] args) {
		System.err.println("1111111111");
		BigDecimal b1 = new BigDecimal(1);
		BigDecimal b2 = null;
		try {
			b1.multiply(b2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("2222222222");
	}
}
