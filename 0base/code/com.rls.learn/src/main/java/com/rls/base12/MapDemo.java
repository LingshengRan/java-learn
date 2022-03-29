package com.rls.base12;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * V put(K key,V value):添加元素
 * V remove(Object key):根据键删除键值对元素
 * void clear():移除所有的键值对元素
 * boolean containsKey(Object key)：判断集合是否包含指定的键
 * boolean containsValue(Object value):判断集合是否包含指定的值
 * boolean isEmpty()：判断集合是否为空
 * int size()：返回集合中的键值对的对数
 *
 * Map集合中的实现类的数据结构只针对键有效。
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key,V value):添加元素
        //如果键是第一次存储，就直接存储元素，返回null
        //如果键不是第一次存储，就用值把以前的值替换，返回以前的值
//		System.out.println("put:"+map.put("张无忌", "周芷若"));
//		System.out.println("put:"+map.put("张无忌", "赵敏"));
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V remove(Object key):根据键删除键值对元素
//		System.out.println("remove:"+map.remove("郭靖"));
//		System.out.println("remove:"+map.remove("郭襄"));

        //void clear():移除所有的键值对元素
        //map.clear();

        //boolean containsKey(Object key)：判断集合是否包含指定的键
//		System.out.println("containsKey:"+map.containsKey("郭靖"));
//		System.out.println("containsKey:"+map.containsKey("郭襄"));

        //boolean containsValue(Object value):判断集合是否包含指定的值 自己练习

        //boolean isEmpty()：判断集合是否为空
        //System.out.println("isEmpty:"+map.isEmpty());

        //int size()：返回集合中的键值对的对数
        System.out.println("size:"+map.size());

        //输出集合对象
        System.out.println(map);

        /*
         * V get(Object key):根据键获取值
         * Set<K> keySet():获取所有键的集合
         * Collection<V> values():获取所有值的集合
         */

        //添加元素
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");

        //V get(Object key):根据键获取值
        System.out.println("get:"+map.get("张无忌"));
        System.out.println("get:"+map.get("张三丰"));
        System.out.println("--------------------");

        //Set<K> keySet():获取所有键的集合
        Set<String> set = map.keySet();
        for(String key : set) {
            System.out.println(key);
        }
        System.out.println("--------------------");

        //Collection<V> values():获取所有值的集合
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.println(value);
        }


        /*
         * Map集合遍历的方式2
         *
         * 思路：
         * 		A:获取所有结婚证的集合
         * 		B:遍历结婚证的集合，得到每一个结婚证
         * 		C:根据结婚证获取丈夫和妻子
         *
         * 转换：
         * 		A:获取所有键值对对象的集合
         * 		B:遍历键值对对象的集合，得到每一个键值对对象
         * 		C:根据键值对对象获取键和值
         */

        //获取所有键值对对象的集合
//		Set<Map.Entry<K,V>> entrySet()
//		获取键值对对象的集合
        Set<Map.Entry<String,String>> set2 = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for(Map.Entry<String,String> me : set2) {
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"---"+value);
        }

    }
}
