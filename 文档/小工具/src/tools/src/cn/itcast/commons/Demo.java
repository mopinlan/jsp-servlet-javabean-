package cn.itcast.commons;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Demo {
	/**
	 * 写一个Map，map中的String要封装到User的age中
	 * BeanUtils可以把String转换成int
	 */
	@Test
	public void fun1(){
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("username", "张三");
		map.put("password", "123");
		map.put("age", "55");
		
		User user = CommonUtils.toBean(map, User.class);
		System.out.println(user);
	}
	
	@Test
	public void fun2(){
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("username", "张三");
		map.put("password", "123");
		map.put("age", "55");
		map.put("birthday", "2013-01-29");
		
		User user = CommonUtils.toBean(map, User.class);
		System.out.println(user);
	}
}
