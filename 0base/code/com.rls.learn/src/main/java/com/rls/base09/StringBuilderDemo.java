package main.java.com.rls.base09;
/*
 * StringBuilder:是一个可变的字符串类。
 *
 * String和StringBuilder的区别：
 * 		String的内容是固定的。
 * 		StringBuilder的内容是可变的。
 *
 * 构造方法
 * public StringBuilder()
 * public StringBuilder(String str)
 *
 * public String toString():返回此序列中数据的字符串表示形式。
 */

/*
 * 添加功能
 * 		public StringBuilder append(任意类型):添加数据，并返回对象本身。
 * 反转功能
 * 		public StringBuilder reverse()
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        //public StringBuilder()
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println(sb.length());
        System.out.println("----------------");

        //public StringBuilder(String str)
        StringBuilder sb2 = new StringBuilder("helloworld");
        System.out.println("sb2:"+sb2);
        System.out.println(sb2.length());

        //链式编程
        sb.append("hello").append("world").append(true).append(100);
        System.out.println("sb:"+sb);

        sb.reverse();
        System.out.println("sb:"+sb);
    }
}
