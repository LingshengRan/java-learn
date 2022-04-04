package com.rls.reflect;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/*
 * BeanUtils：Apache commons提供的一个组件，主要功能就是为了简化JavaBean封装数据的操作
 * 			static void	setProperty(Object bean, String name, Object value)
 * 			static String getProperty(Object bean, String name)
 * 			static void	populate(Object bean, Map properties)
 *
 * 注意：BeanUtils的setProperty和getProperty方法底层并不是直接操作成员变量，而是操作和成员变量名有关的get和set方法
 */
public class BeanUtilsDemo {
	public static void main(String[] args) throws ReflectiveOperationException  {
		//static void	populate(Object bean, Map properties)
		Person p = new Person();

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "lisi");
		map.put("age", 18);
		map.put("gender", "male");

		BeanUtils.populate(p,map);
		System.out.println(p);

	}

	private static void method() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Person p = new Person();
		//System.out.println(p);

		//static void	setProperty(Object bean, String name, Object value) ：给JavaBean对象的成员变量进行赋值
		BeanUtils.setProperty(p, "name", "zhangsan");
		//BeanUtils.setProperty(p, "age", 18);
		//System.out.println(p);

		//static String getProperty(Object bean, String name) 
		String name = BeanUtils.getProperty(p, "name");
		System.out.println(name);
	}
}
