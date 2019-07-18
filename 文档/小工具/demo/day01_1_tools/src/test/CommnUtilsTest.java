package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

/**
 * 测试CommonUtils
 * @author qdmmy6
 *
 */
public class CommnUtilsTest {
	/**
	 * 随机生成32位长的字符串，通常用来做实体类的ID
	 */
	@Test
	public void testUuid() {
		String s = CommonUtils.uuid();//生成随机32位长的字符串
		System.out.println(s);
	}
	
	/**
	 * 把Map类型映射成Bean类型。
	 * 要求map中键的名称与Person类的属性名称相同。
	 * 即map的key分别为：pid、name、age、birthday，person的属性名称也是pid、name、age、birthday
	 */
	@Test
	public void testToBean() {
		Map<String,String> map = new HashMap<String,String>();
		/*
		 * map的key：pid、age、birthday、myname
		 * person的属性：pid、age、birthday、name
		 * map中没有名为name的键值，而多出一个名为myname的键值，所以映射后的person对象的name属性值为null。
		 * map中的age和birthday都是字符串类型，而person的age是int类型、birthday是Date类型，但toBean()方法会自动对Map中值进行类型转换。
		 */
		map.put("pid", CommonUtils.uuid());
		map.put("age", "23");
		map.put("birthday", "2014-01-30");
		map.put("myname", "张三");
		
		Person p = CommonUtils.toBean(map, Person.class);
		System.out.println(p);
	}
}
