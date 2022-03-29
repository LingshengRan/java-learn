package com.rls.base02;

/*
 * 常用的运算符：
 * 		算术运算符
 * 		自增自减运算符
 * 		赋值运算符
 * 		关系运算符
 * 		逻辑运算符
 * 		三元运算符
 *
 * 算术运算符：
 * 		+,-,*,/,%
 *
 * 		/和%的区别
 * 			/：获取两个数据相除的商
 * 			%：获取两个数据相除的余数
 *
 * 注意：
 * 		整数相除只能得到整数。要想得到小数，就必须有浮点数参与运算。
 */
public class OperatorDemo {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 5;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("------------");

        System.out.println(5/4);
        System.out.println(5.0/4);
        System.out.println(5/4.0);
    }
}

/*
 * 三元运算符：
 * 		关系表达式?表达式1:表达式2;
 *
 * 执行流程：
 * 		A:计算关系表达式的值，看结果是true还是false
 * 		B:如果是true，表达式1就是结果
 *        如果是false，表达式2就是结果
 */
 class OperatorDemo0 {
    public static void main(String[] args) {
        //定义两个变量
        int a = 10;
        int b = 20;

        int c = (a>b)?a:b;
        System.out.println("c:"+c);
    }
}


/*
 * 字符参与加法运算：其实是拿该字符在计算机中存储所表示的数据值来运算的。
 * 		'a'	97
 * 		'A'	65
 * 		'0'	48
 *
 * 字符串参与加法运算：其实这里不是加法，而是字符串的拼接。
 */
class OperatorDemo2 {
    public static void main(String[] args) {
        //定义两个变量，一个int类型，一个char类型
        int a = 10;
        char ch = 'a';
        System.out.println(a + ch);
        System.out.println("----------------");

        //字符串做加法
        System.out.println("hello"+"world");
        System.out.println("hello"+10);
        System.out.println("hello"+10+20);
        System.out.println(10+20+"hello");
    }
}

/*
 * 自增自减运算符：++,--
 *
 * 作用：就是自己+1或者-1
 *
 * ++和--可以放在变量的前面，也可以放在变量的后面。
 * 单独使用一个变量的时候，放在变量的前面或者后面，效果一样。
 * 参与其他操作的时候：
 * 		++在变量的后面，先把变量做操作，然后变量再++
 * 		++在变量的前面，先变量++，然后在做操作
 */
class OperatorDemo3 {
    public static void main(String[] args) {
        //定义一个int类型的变量
        int a = 10;
        System.out.println("a:"+a);

        //a++;
        //a--;
        //++a;
        //--a;
        //System.out.println("a:"+a);

        //int b = a++;
        int b = ++a;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}


/*
 * 赋值运算符：
 * 		基本的赋值运算符：=
 * 		扩展的赋值运算符：+=,-=,...
 */
 class OperatorDemo4 {
    public static void main(String[] args) {
        //定义变量
        int a = 10; //把10赋值给int类型的变量a
        System.out.println("a:"+a);

        //扩展的赋值运算符：+=
        //把运算符左边的数据和右边的数据进行运算，然后把结果赋值给左边
        //a = a + 20;
        a += 20;
        System.out.println("a:"+a);

        //short s = 1;
        //s = s + 1;

        //扩展的赋值运算符隐含了强制类型转换。
        //a+=20
        //等价于
        //a =(a的数据类型)(a+20);
        short s = 1;
        s += 1;
        System.out.println("s:"+s);
    }
}



/*
 * 关系运算符：
 * 		==,!=,>,>=,<,<=
 * 		关系运算符操作完毕的结果是boolean类型。
 *
 * 注意事项：
 * 		千万不要把==写成了=
 */
 class OperatorDemo5 {
    public static void main(String[] args) {
        //定义三个变量
        int a = 10;
        int b = 20;
        int c = 10;

        //==
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("------------");

        //!=
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("------------");

        //>
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println("------------");

        //>=
        System.out.println(a >= b);
        System.out.println(a >= c);
        System.out.println("------------");

        System.out.println(a == b);
        System.out.println(a = b);//20,把b的值赋值给了a，并把a作为结果输出了
    }
}


/*
 * 逻辑运算符：
 * &&:有false则false
 * ||:有true则true
 * !:true则false,false则true
 */
 class OperatorDemo6 {
    public static void main(String[] args) {
        //定义变量
        int a = 3;
        int b = 4;
        int c = 5;

        //&&逻辑与
        System.out.println((a>b) && (a>c)); //false && false
        System.out.println((a<b) && (a>c)); //true && false
        System.out.println((a>b) && (a<c)); //false && true
        System.out.println((a<b) && (a<c)); //true && true
        System.out.println("------------");

        //||逻辑或
        System.out.println((a>b) || (a>c)); //false || false
        System.out.println((a<b) || (a>c)); //true || false
        System.out.println((a>b) || (a<c)); //false || true
        System.out.println((a<b) || (a<c)); //true || true
        System.out.println("------------");

        //!逻辑非
        System.out.println((a>b));
        System.out.println(!(a>b));
        System.out.println(!!(a>b));
    }
}