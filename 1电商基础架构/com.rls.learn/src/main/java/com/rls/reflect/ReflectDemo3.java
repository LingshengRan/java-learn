package com.rls.reflect;


import java.lang.reflect.Field;

/*
 *	通过反射获取成员变量并使用
 *			Field[] getFields()
 *			Field getField(String name)
 *
 *			Field[] getDeclaredFields()
 *			Field getDeclaredField(String name)
 *
 * Field:
 * 			Object get(Object obj)
 * 			void set(Object obj, Object value)


 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ReflectiveOperationException {
		//获取学生类的字节码对象
		Class clazz = Class.forName("com.rls.reflect.Student");
		//获取学生类的对象
		Object stu = clazz.newInstance();


		//Field getField(String name)  :根据字段名称获取公共的字段对象
		Field f = clazz.getField("age");//获取成员变量对象
		//System.out.println(f);

		//void set(Object obj, Object value)
		f.set(stu,28);//通过成员变量对象，修改指定对为指定的值


		//Object get(Object obj)
		Object age = f.get(stu);//通过对象获取成员变量的值
		System.out.println(age);

		System.out.println(stu);


	}

	private static void method(Class clazz) {
		//Field[] getFields()  :获取公共的成员变量
		Field[] fs = clazz.getFields();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
		}
		System.out.println("----------");
		//getDeclaredFields()  ：获取所有的成员变量
		Field[] fs2 = clazz.getDeclaredFields();
		for (int i = 0; i < fs2.length; i++) {
			System.out.println(fs2[i]);
		}
	}


}
