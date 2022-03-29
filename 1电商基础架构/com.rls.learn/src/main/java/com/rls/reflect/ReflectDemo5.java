package com.rls.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 *	通过反射获取成员方法并使用
 *		Method getMethod(String name, Class<?>... parameterTypes)
 *	Method:
 *		Object invoke(Object obj, Object... args)
 *
 */

public class ReflectDemo5 {
	public static void main(String[] args) throws ReflectiveOperationException {
		//获取学生类的字节码对象
		Class clazz = Class.forName("com.rls.reflect.Student");
		//获取学生类的对象
		Object stu = clazz.newInstance();

		//获取无参有返回值的方法
		Method m = clazz.getMethod("getName");
		Object obj = m.invoke(stu);
		System.out.println(obj);
	}

	private static void method2(Class clazz, Object stu)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		//获取有参无返回值的方法
		Method m = clazz.getMethod("setName", String.class);
		m.invoke(stu, "lisi");
		System.out.println(stu);
	}

	private static void method(Class clazz, Object stu)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		//获取无参无返回值的方法
		Method m = clazz.getMethod("method");
		m.invoke(stu);
	}

}
