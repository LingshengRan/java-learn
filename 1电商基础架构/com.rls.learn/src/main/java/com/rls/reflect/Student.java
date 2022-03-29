package com.rls.reflect;

public class Student {
	private String name = "zhangsan";
	public int age = 18;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void method() {
		System.out.println("method");
	}


}

