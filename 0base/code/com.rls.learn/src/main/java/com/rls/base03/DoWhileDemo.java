package main.java.com.rls.base03;
/*
 * do...while循环语句的格式：
 * 		do {
 * 			循环体语句;
 * 		}while(判断条件语句);
 *
 * 完整格式：
 * 		初始化语句;
 * 		do {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}while(判断条件语句);
 *
 * 执行流程：
 * 		A:执行初始化语句
 * 		B:执行循环体语句
 * 		C:执行控制条件语句
 * 		D:执行判断条件语句，看是true还是false
 * 			如果是false，就结束循环
 * 			如果是true，就回到B继续
 *
 * 练习：求和案例，水仙花案例
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        //在控制台输出5次HelloWorld案例
		/*
		for(int x=1; x<=5; x++) {
			System.out.println("HelloWorld");
		}
		*/

        int x=1;
        do {
            System.out.println("HelloWorld");
            x++;
        }while(x<=5);

    }
}


/*
 * 三种循环语句可以完成相同的事情，但是也是有小区别的：
 * 		do...while循环语句至少执行一次循环体。
 * 		而for和while循环语句要先进行条件的判断，然后看是否执行循环体语句。
 *
 * for循环和while循环的小区别：
 * 		for循环结束后，初始化的变量不能被使用了。
 * 		而while循环结束后，初始化的变量还可以继续被使用。
 *
 * 推荐使用的顺序：
 * 		for -- while -- do...while
 */
class DoWhileDemo2 {
    public static void main(String[] args) {
		/*
		int x = 3;
		do {
			System.out.println("爱生活，爱Java");
			x++;
		}while(x < 3);
		*/

		/*
		int x = 3;
		while(x < 3) {
			System.out.println("爱生活，爱Java");
			x++;
		}
		*/

		/*
		for(int x=1; x<=5; x++) {
			System.out.println("爱生活，爱Java");
		}
		System.out.println(x);
		*/

        int x=1;
        while(x <= 5) {
            System.out.println("爱生活，爱Java");
            x++;
        }
        System.out.println(x);
    }
}
