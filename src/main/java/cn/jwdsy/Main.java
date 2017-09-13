package cn.jwdsy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangfei5 on 2017/9/13.
 */
public class Main {
	public static void main(String[] args) {
		System.err.println("Hello World");
		for (int i = 0; i < 10; i++) {
			System.err.println("i="+i);
		}
		Map<String, Object> iMap = new HashMap<>();
		List<Integer> integers = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		for (int i = 0; i < integers.size(); i++) {
			Integer integer = integers.get(i);
			iMap.put(integer.toString(), integer);
		}
	}
}
