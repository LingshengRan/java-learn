package com.rls.reflect;

/*
 * 反射：
 * 		在运行时，我们可以获取任意一个类的所有方法和属性
 * 		在运行时，让我们调用任意一个对象的所有方法和属性
 *
 * 反射的前提：
 * 		要获取类的对象（Class对象）
 *
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// 通过Object的getClass()方法获取，必须要有对象
		Student s = new Student();
		Class clazz = s.getClass();

		// 通过类名获取字节码对象
		Class clazz2 = Student.class;

		// static Class<?> forName(String className)
		Class clazz3 = Class.forName("com.rls.reflect.Student");

		System.out.println(clazz == clazz2);
		System.out.println(clazz == clazz3);
		System.out.println(clazz);

	}
}
