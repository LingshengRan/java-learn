package com.rls.base12;

import java.util.HashSet;
import java.util.Set;

/*
 * Set:
 * 		一个不包含重复元素的 collection
 *
 * HashSet:
 * 		它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变
 */

/*
 * HashSet保证元素唯一性的原理?
 *
 * 通过查看add方法的源码，我们知道了添加功能的执行过程中，是进行了数据的判断的。
 * 这个判断的流程是：
 * 		首先比较对象的哈希值是否相同，这个哈希值是根据对象的hashCode()计算出来的。
 * 			如果哈希值不同，就直接添加到集合中
 * 			如果哈希值相同，继续执行equals()进行比较，
 * 				返回的是true，说明元素重复，不添加。
 * 				返回的是false，说明元素不重复，就添加。
 *
 * 如果我们使用HashSet集合存储对象，你要想保证元素的唯一性，就必须重写hashCode()和equals()方法。
 */

public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //唯一
        set.add("world");

        //遍历集合
        for(String s : set) {
            System.out.println(s);
        }

    }
}
