package com.rls.multithreading;

public class Use_Thread {

	public static void main(String[] args) {

		/*
		 * 一共就两种开启线程的方式：
		 *
		 * 方式一： 自定义类继承Thread类 优点：子类继承了 Thread类的 方法，使用起来更加的便捷 缺点： 扩展性不强
		 *
		 * 方式二： 自定义类实现Runnable接口 优点：扩展性强 缺点：没有Thread的方法可以直接使用，需要获取当前线程对象来调用方法。
		 */

		// 第一种实现多线程的方式
		new Thread() {
			@Override
			public void run() {
				System.out.println("处理请求。");
			}
		}.start();

		// 第二种实现方式：
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("....");
			}
		}).start();

		/*
		 	synchronized (锁对象) {
				共享数据
			}
		*/
	}

}
