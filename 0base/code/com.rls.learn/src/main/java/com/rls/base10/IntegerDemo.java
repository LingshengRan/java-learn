package com.rls.base10;

/*
 * 需求：我要判断一个数据是否在int范围内?
 * 要想判断一个数据是否在int范围内，首先我们得知道int范围，在前面我们讲解基本数据类型的时候说过了：
 * 		-2147483648 到 2147483647
 *
 * 为了对基本数据类型进行更多更方便的操作，Java就针对每一种基本数据类型提供了一个对应的引用类型。
 * 基本类型包装类：
 * 		Byte	byte
 * 		Short	short
 * 		Integer	int
 * 		Long	long
 * 		Float	float
 * 		Double	double
 * 		Character	char
 * 		Boolean	boolean
 *
 * 基本数据类型包装类最常见的用法就是用于和字符串之间进行相互转换。
 */

/*
 * Integer:Integer类在对象中包装了一个基本类型 int 的值。
 *
 * 构造方法：
 * 		Integer(int value)
 * 		Integer(String s)
 * 			注意：这个字符串必须由数字字符组成
 */

/*
 * int类型和String类型的相互转换
 *
 * int	--	String
 * 		String类中：public static String valueOf(int i)
 *
 * String	--	int
 * 		Integer类中：public static int parseInt(String s)
 */

public class IntegerDemo {
    public static void main(String[] args) {
        // public static final int MAX_VALUE
        System.out.println(Integer.MAX_VALUE);
        // public static final int MIN_VALUE
        System.out.println(Integer.MIN_VALUE);


        //int	--	String
        int number = 100;
        //方式1
        String s1 = "" + number;
        System.out.println(s1);
        //方式2
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------------");

        //String  -- int
        String s = "100";
        //方式1
        //String -- Integer -- int
        Integer i = new Integer(s);
        //public int intValue()
        int x = i.intValue();
        System.out.println(x);
        //方式2
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}


/*
 * JDK5新特性：
 * 自动装箱：把基本数据类型转换为对应的包装类类型
 * 		public static Integer valueOf(int i)
 * 自动拆箱：把包装类类型转换为对应的基本数据类型
 * 		public int intValue()
 *
 * Java程序的运行：
 * 		编写java文件 -- 编译生成class文件 -- 执行
 *
 * 注意：在使用包装类类型的新特性的时候，如果做操作，最好先判断是否为null。
 *
 * 开发中的原则：
 * 		只要是对象，在使用前就必须进行不为null的判断。
 */

 class IntegerDemo2 {
    public static void main(String[] args) {
        //创建一个包装类类型的对象
        //Integer i = new Integer(100);
        Integer ii = 100; //自动装箱
        //public static Integer valueOf(int i)
        ii += 200; //ii = ii + 200; 自动拆箱,自动装箱
        //public int intValue()
        System.out.println(ii);

		/*
		Integer ii = Integer.valueOf(100);
		ii = Integer.valueOf(ii.intValue() + 200);
		System.out.println(ii);
		*/

        Integer iii = null;
        if(iii != null) {
            iii += 300; //NullPointerException
            System.out.println(iii);
        }
    }
}