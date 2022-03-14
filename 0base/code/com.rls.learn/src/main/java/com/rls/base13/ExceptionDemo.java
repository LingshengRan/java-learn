package main.java.com.rls.base13;

/*
 * 异常：就是程序出现了不正常的情况。
 *
 * ArithmeticException:当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。
 *
 * Throwable 类是 Java 语言中所有错误或异常的超类。
 *
 * Error 是 Throwable 的子类，用于指示合理的应用程序不应该试图捕获的严重问题。
 * 		也就是说针对程序发生了Error的情况，Java程序本身是无能为力的，比如说：硬件层面的问题，内存不足等。
 * 		所以，针对Error的问题我们不处理。
 *
 * Exception 类及其子类是 Throwable 的一种形式，它指出了合理的应用程序想要捕获的条件。
 * 		也就是说针对程序发生了Exception的情况，是我们需要处理的问题。
 *
 * RuntimeException 是那些可能在 Java 虚拟机正常运行期间抛出的异常的超类。
 *
 * Exception分为运行期和编译期：
 * 		运行期的异常：在编译期是不处理的，在程序运行时候出现了问题，需要我们回来修改代码。
 * 		编译期的异常：在编译期就必须处理，否则程序不能通过编译，就更不能正常的执行了。
 *
 * 异常的体系：
 * Throwable
 * 		Error:严重问题，不需要处理
 * 		Exception
 * 			RuntimeException:在编译期是不处理的，在程序运行时候出现了问题，需要我们回来修改代码。
 * 			非RuntimeException:在编译期就必须处理，否则程序不能通过编译，就更不能正常的执行了。
 */

/*
 * 异常的默认处理方式
 *
 * java.lang.ArithmeticException:异常的类名，包括包名
 * / by zero:异常的原因，被0除
 * at com.itheima.ExceptionDemo2.method(ExceptionDemo2.java:17):异常的位置
 *
 * 如果程序出现了问题，我们没有做任何的处理，最终JVM会做出默认的处理。
 * 处理方案：
 * 		A:把异常的名称，异常的原因，异常出现的位置等信息在控制台输出
 * 		B:让程序停止执行
 */


/*
 * 异常处理：
 * 方案1：try...catch...
 *
 * 格式：
 * 		try {
 * 			可能出现异常的代码;
 * 		}catch(异常类名  变量名) {
 * 			异常的处理代码;
 * 		}
 *
 * 执行流程：
 * 		程序从try开始执行，执行到哪里出现了问题，就会跳转到catch里面执行。
 * 		执行完毕后，程序还能继续往下执行。
 *
 * public void printStackTrace():把异常的错误信息输出在了控制台。
 * 在实际开发中，我们遇见了异常，会给出一个页面进行提示，而我们目前做不了，
 * 所以，就用异常对象调用printStackTrace()就可以了。
 * 这样做了以后，我们的程序还可以继续往下执行。
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 异常处理方案2：throws
 *
 * 我们通过try...catch可以对异常进行处理了，但是并不是所有的时候我们都有权限进行异常的处理。
 * 也就是说，有些时候我们处理不了，但是，这个时候异常时存在的，不处理也不行，怎么办?
 * 这个时候，Java就提供了throws的处理方案。
 *
 * 格式：
 * 		throws 异常类名
 * 		注意：这个格式必须跟在方法的括号的后面
 *
 * 注意：
 * 		编译时异常时必须要进行处理的，两种处理方案：try...catch...或者throws
 * 		如果你采用了throws这种方案，将来谁调用，还得进行处理。
 *
 * 		运行时异常可以不用处理，出现问题后我们需要回来修改代码。
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }

        method();
    }
    //编译时异常
    public static void method2() throws ParseException {
        String s = "2088-08-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    public static void method() {
        int a = 10;
        int b = 5;
        //b = 0;
        System.out.println(a/b);
    }

}
