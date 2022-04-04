package com.rls.reflect;
import java.lang.reflect.Field;

/*
 *	通过反射获取私有成员变量并使用
 *			 Field[] getDeclaredFields()
 *			 Field getDeclaredField(String name)
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws ReflectiveOperationException {
		//获取学生类的字节码对象
		Class clazz = Class.forName("com.rls.reflect.Student");
		//获取学生对象
		Object stu = clazz.newInstance();
		//获取私有的字段对象
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);//设置反射时取消Java的访问检查,暴力访问
		//System.out.println(f);

		f.set(stu, "lisi");

		Object name = f.get(stu);
		System.out.println(name);
	}

}
