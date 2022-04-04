package com.rls.reflect;

import java.util.HashMap;
import java.util.Map;

/*
 * 自定义BeanUtils:
		public static void setProperty(Object bean,String name,Object value)
		public static String getProperty(Object bean,String name)
		public static void populate(Object bean,Map map)

 */
public class MyBeanUtilsDemo {
	public static void main(String[] args) throws ReflectiveOperationException {
		//创建JavaBean对象
		Person p = new Person();

		//准备数据
		Map map = new HashMap();
		map.put("name", "zhaoliu");
		map.put("age", 20);
		map.put("gender", "other");
		map.put("birthday", "2041-01-04");

		MyBeanUtils.populate(p, map);
		System.out.println(p);
	}

	private static void method() throws ReflectiveOperationException {
		//创建JavaBean对象
		Person p = new Person();
		//赋值
		MyBeanUtils.setProperty(p, "name", "wangwu");
		MyBeanUtils.setProperty(p, "age", 20);

		//获取
		String name = MyBeanUtils.getProperty(p, "name");
		String age = MyBeanUtils.getProperty(p, "age");

		System.out.println(name);
		System.out.println(age);

		//System.out.println(p);
	}

}
