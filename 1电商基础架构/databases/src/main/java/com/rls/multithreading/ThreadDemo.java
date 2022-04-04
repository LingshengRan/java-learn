package com.rls.multithreading;
/*
 * 多线程：
 *
 * 进程：当前正在运行的程序，一个应用程序在内存中的执行区域
 * 线程：进程中的一个执行控制单元，执行路径
 *
 * 一个进程可以有一个线程，也可以有多个线程
 *
 * 单线程：安全性高，但是效率低
 * 多线程：安全性低，效率高
 *
 * 多线程案例：360,迅雷等
 *
 */
/*
 * 多线程的实现方式：
 * 		方式1：一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。接下来可以分配并启动该子类的实例
 *
 * Thread
 * 		String getName()      返回该线程的名称。
 * 		void   setName(String name) 改变线程名称，使之与参数 name 相同。
 *
 *
 * CPU执行程序的随机性
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //创建线程实例
        MyThread mt = new MyThread();
        //修改线程名字
        mt.setName("张三");

        //启动线程
        mt.start();

        //创建线程实例
        MyThread mt2 = new MyThread();
        mt2.setName("老王");

        //启动线程
        mt2.start();
    }
}

