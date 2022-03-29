package com.rls.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 *	通过反射获取构造方法并使用
 *			Constructor<?>[] getConstructors()
 *			Constructor<T> getConstructor(Class<?>... parameterTypes)
 *			 T newInstance()
 *
 *Constructor：
 *	 	T newInstance(Object... initargs)
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ReflectiveOperationException {
		Class clazz = Class.forName("com.rls.reflect.Student");

		//method(clazz);
		//Constructor<T> getConstructor(Class<?>... parameterTypes)
		//method2(clazz);
		//method3(clazz);

		Object obj = clazz.newInstance();
		System.out.println(obj);



	}

	private static void method3(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Constructor c = clazz.getConstructor(String.class,int.class);//获取有参构造，参数1类型为String，参数2类型为int
		System.out.println(c);
		Object obj = c.newInstance("lisi",30);
		System.out.println(obj);
	}

	private static void method2(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Constructor c = clazz.getConstructor();//获取无参构造
		System.out.println(c);
		Object obj = c.newInstance();
		System.out.println(obj);
	}

	private static void method(Class clazz) {
		//Constructor<?>[] getConstructors() :获取所有public修饰的构造方法
		Constructor[] cs = clazz.getConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
	}

}