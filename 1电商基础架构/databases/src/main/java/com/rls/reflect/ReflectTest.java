package com.rls.reflect;

/*
 * 创建一个标准的Person类，在主方法中创建对象并使用
 *
 */
public class ReflectTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("zhangsan");
		p.setAge(18);
		p.setGender("nan");
		System.out.println(p);
	}

	public static void method(String name, int age, String gender) {

	}

	public static void method(Person p) {

	}

}
