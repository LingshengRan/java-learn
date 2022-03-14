package main.java.com.rls.base10;

import java.util.Arrays;

/*
 * Arrays:提供了对数组操作的各种方法。
 * public static String toString(int[] a):把数组转成字符串
 * public static void sort(int[] a):对数组进行升序排序
 */

/*
 * Arrays类中真的没有构造方法吗?
 * 		一个类中没有构造方法，系统将提供一个无参构造方法。
 * 		而我们在帮助文档中没有看到Arrays类的构造方法，这是为什么呢?
 * 			Arrays类中有构造方法，只不过构造方法被private修饰，外界是无法使用的。
 * 			因为外界无法使用，所以帮助文档中就看不到。
 *
 * 通过查看源码，我们找到了如下的内容：
 * private Arrays() {}
 *
 *
 * Arrays类的这种设计是常用的工具类的设计思想：
 * 		构造方法私有。
 * 		成员都用static修饰。
 *
 * Math，Collections等
 */

public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24,69,80,57,13};

        //public static String toString(int[] a):把数组转成字符串
        System.out.println("排序前："+Arrays.toString(arr));

        //public static void sort(int[] a):对数组进行升序排序
        Arrays.sort(arr);

        System.out.println("排序后："+Arrays.toString(arr));
        //冒泡排序
        sort(arr);
    }

    /*
     * 数组排序：(冒泡排序)
     */
    /*
     * 两个明确：
     * 		返回值类型：void
     * 		参数列表：int[] arr
     */
    public static void sort(int[] arr) {
        for(int x=0; x<arr.length-1; x++) {
            for(int y=0; y<arr.length-1-x; y++) {
                if(arr[y] > arr[y+1]) {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }

    /*
     * 数组遍历
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++) {
            if(x==arr.length-1) {
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+", ");
            }
        }
        System.out.println("]");
    }
}
