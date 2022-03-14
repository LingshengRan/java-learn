package main.java.com.rls.base04;

/*
 * 数组：存储同一种数据类型的多个元素的容器。
 *
 * 定义格式：
 * 		A:数据类型[] 数组名;(推荐的使用方式)
 * 		B:数据类型 数组名[];
 *
 * 		举例：
 * 			int[] arr;	定义了一个int类型的数组，数组名是arr
 * 			int arr[];	定义了一个int类型的变量，变量名是arr数组
 *
 * 数组初始化：
 * 		A:所谓的初始化，其实就是为数组开辟内存空间，并为数组中的每个元素赋予初始值。
 * 		B:如何进行初始化呢?我们有两种方式对数组进行初始化
 * 			a:动态初始化	只给出长度，由系统给出初始化值
 * 			b:静态初始化	给出初始化值，由系统决定长度
 *
 * 动态初始化：
 * 		数据类型[] 数组名 = new 数据类型[数组长度];
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //数据类型[] 数组名 = new 数据类型[数组长度];
        int[] arr = new int[3];
        /*
         * 左边：
         * 		int:说明的是数组中的元素类型是int类型
         * 		[]:说明这是一个数组
         * 		arr:这是数组的名称
         * 右边：
         * 		new:为数组申请分配内存空间。
         * 		int:说明的是数组中的元素类型是int类型
         * 		[]:说明这是一个数组
         * 		3:数组长度，其实就是数组中的元素个数
         */

        //输出数组名
        System.out.println("arr:"+arr); //[I@104c575
        //通过输出数组名，我们得到了一个地址值，但是这个值对我们来说没有意义
        //我要获取的是数组中的元素值，能不能获取到呢?能
        //怎么获取呢?不同担心，Java已经帮你想好了
        //其实数组中的每个元素是有编号的，编号从0开始，最大的编号是数组的长度-1
        //通过数组名和编号的配合使用我们就可以获取数组中指定编号的元素值
        //怎么配合的呢?编号的专业叫法：索引
        //获取元素的格式：数组名[索引]
        System.out.println("arr[0]:"+arr[0]);//0
        System.out.println("arr[1]:"+arr[1]);//0
        System.out.println("arr[2]:"+arr[2]);//0
    }
}


/*
 * 静态初始化：给出数组中的元素值，由系统决定数组的长度。
 *
 * 格式：
 * 		数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};
 *
 * 举例：
 * 		int[] arr = new int[]{1,2,3};
 *
 * 简化的格式：
 * 		数据类型[] 数组名 = {元素1,元素2,元素3,...};
 * 简化格式的代码：
 * 		int[] arr = {1,2,3};
 */
class ArrayDemo2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3};

        //输出数组名和元素值
        System.out.println("arr:"+arr);
        System.out.println("arr[0]:"+arr[0]);
        System.out.println("arr[1]:"+arr[1]);
        System.out.println("arr[2]:"+arr[2]);
    }
}

