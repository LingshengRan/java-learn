package com.rls.reflect;

import java.io.Serializable;

/*
 * JavaBean:用于封装数据
 * 		类使用公共进行修饰
 * 		提供私有修饰的成员变量
 * 		为成员变量提供公共getter和setter方法
 * 		提供公共无参的构造
 * 		实现序列号接口
 *
 */
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1049712678750452511L;
	
	private String name;
	private int age;
	private String gender;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
