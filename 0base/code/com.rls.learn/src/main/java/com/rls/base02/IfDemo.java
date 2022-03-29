package com.rls.base02;
/*
 * if语句有三种格式。
 *
 * 格式1：
 * 		if(关系表达式) {
 * 			语句体;
 * 		}
 *
 * 执行流程：
 * 		A:首先计算关系表达式的值，看是true还是false
 * 		B:如果是true，就执行语句体
 * 		C:如果是false，就不执行语句体
 */
public class IfDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        //定义两个int类型的变量
        int a = 10;
        int b = 20;

        //判断两个变量是否相等
        if(a == b) {
            System.out.println("a等于b");
        }

        //定义变量
        int c = 10;
        if(a == c) {
            System.out.println("a等于c");
        }

        System.out.println("结束");
    }
}

/*
 * 格式2：
 * 		if(关系表达式) {
 * 			语句体1;
 * 		}else {
 * 			语句体2;
 * 		}
 *
 * 执行流程：
 * 		A:首先计算关系表达式的值，看结果是true还是false
 * 		B:如果是true，就执行语句体1
 * 		C:如果是false，就执行语句体2
 */

class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("开始");

        //判断一个数据是奇数还是偶数
        //思路：如果一个数据对2取余的结果是0，说明该数是偶数
        //定义一个变量
        int a = 100;
        //重新给a赋值
        a = 99;

        if(a%2 == 0) {
            System.out.println("a是偶数");
        }else {
            System.out.println("a是奇数");
        }

        System.out.println("结束");
    }
}




/*
 * 格式3：
 * 		if(关系表达式1) {
 * 			语句体1;
 * 		}else if(关系表达式2) {
 * 			语句体2;
 * 		}
 * 		...
 * 		else {
 * 			语句体n+1;
 * 		}
 *
 * 执行流程：
 * 		A:计算关系表达式1的值，看是true还是false
 * 		B:如果是true，就执行语句体1
 * 		C:如果是false，就继续计算关系表达式2的值，看是true还是false
 * 		D:如果是true，就执行语句体2
 * 		E:如果是false，就继续计算...
 * 		F:所有的关系表达式的结果都是false，执行语句体n+1
 */
class IfDemo3 {
    public static void main(String[] args) {
        System.out.println("开始");

        //假如x和y满足如下的关系：
        //x>=3	y=2x+1
        //-1<=x<3	y=2x
        //x<-1	y=2x-1

        //根据给定的x的值，计算出y的值
        int x = 5;
        x = 0;
        x = -5;

        //定义变量y
        int y;

        if(x >= 3) {
            y = 2*x+1;
        }else if(x>=-1 && x<3) {
            y = 2*x;
        }else if(x<-1) {
            y = 2*x-1;
        }else {
            y = 0;
            System.out.println("不存在这样的x的值");
        }

        System.out.println("y:"+y);

        System.out.println("结束");
    }
}
