package com.rls.base08;
/*
 * 非静态的成员方法：
 * 		能访问静态的成员变量
 * 		能访问非静态的成员变量
 * 		能访问静态的成员方法
 * 		能访问非静态的成员方法
 *
 * 静态的成员方法：
 * 		能访问静态的成员变量
 * 		能访问静态的成员方法
 *
 * 注意事项：
 * 		静态成员方法中不能出现this,super这样的关键字。
 * 		原因是：静态是随着类的加载而加载，this,super这样的关键字是随着对象的创建而存在。
 * 			    先进内存的，不能访问后进内存的。
 */

/*
 * static：是一个关键字，静态的意思。可以用来修饰成员变量和成员方法。
 * static修饰成员的特点：
 * 		A:被类的所有对象共享。
 * 			其实也是判断一个成员是否应该用static修饰的条件。
 * 		B:可以通过类名直接访问
 * 		C:优先于对象存在
 * 		D:随着类的加载而加载
 */

public class Cat extends Animal implements Jumpping {
	public final void play(){
		System.out.println("猫玩游戏");
	}

	@Override
	public void eat() {
		System.out.println("猫吃饭");
	}

	@Override
	public void jump() {
		System.out.println("猫会跳跃");
	}
}
