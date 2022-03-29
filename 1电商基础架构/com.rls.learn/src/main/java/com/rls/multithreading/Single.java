package com.rls.multithreading;

/**
 * 单例模式:只能获取同一个对象，不可多次创建
 * 1.懒汉式 空间换时间
 * 2.饿汉式 时间换空间
 * 3.final 修饰
 */
public class Single {
    //懒汉式
    private static Single s = new Single();
    public static Single getInstance(){
        return s;
    }

    //饿汉式
    private static Single s2;
    //多线程加锁
    public synchronized static Single getInstance2(){
        if (s2 == null){
            s2 = new Single();
        }
        return s2;
    }

    // final 修饰
    public static final Single s3 = new Single();
}
