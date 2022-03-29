package com.rls.base07;

/*
 * 多态：同一个对象，在不同时刻体现出来的不同状态。
 * 举例：
 * 		猫：猫是猫，猫是动物。
 * 		水：液体，固体，气体。
 *
 * Java中多态的前提：
 * 		A:有继承关系
 * 		B:有方法重写
 * 		C:有父类引用指向子类对象
 * 			Fu f = new Fu();
 * 			Zi z = new Zi();
 *
 * 			Fu f = new Zi();
 */

/*
 * 多态中成员的访问特点：
 * 		A:成员变量
 * 			编译看左边，执行看左边。
 * 		B:成员方法
 * 			编译看左边，执行看右边。
 *
 * 		为什么成员变量和成员方法的访问不一样呢?
 * 			因为成员方法有重写，而变量没有。
 */

/*
 * 多态的好处：提高了程序的扩展性
 * 		具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作。
 * 多态的弊端：不能使用子类的特有功能
 */

public class DuoTaiTest {
	public static void main(String[] args) {
		//父类指向子类对象
		Animal a = new Cat();
		a.eat();
		
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
		a = new Dog();
		a.eat();
		
		Dog d = (Dog) a;
		d.eat();
		d.lookDoor();
	}
}
