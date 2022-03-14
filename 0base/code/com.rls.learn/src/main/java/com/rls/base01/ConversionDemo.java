package main.java.com.rls.base01;
/*
 * +:做加法的符号。
 *
 * 类型转换：
 * 		隐式转换
 * 		强制转换
 *
 * 隐式转换：
 * 		byte,short,char -- int -- long -- float -- double
 *
 * 		boolean类型不参与这样的运算。
 */
public class ConversionDemo {
	public static void main(String[] args) {
		//定义两个int类型的变量
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		//我可以把a+b的结果进行输出，说明这个计算的结果是没有问题的
		//那么，我应该也可以把这个结果接收一下。
		int c = a + b;
		System.out.println(c);
		System.out.println("-----------------");

		//定义两个变量，一个int类型，一个byte类型
		int aa = 10;
		byte bb = 20;
		System.out.println(aa+bb);
		//下面这种写法报错了
		//byte cc = aa+bb;
		int cc = aa + bb;
		System.out.println(cc);
	}
}

/*
 * 强制转换：
 * 		目标类型 变量名= (目标类型)(被转换的数据);
 *
 * 		虽然可以做强制转换，但是不建议。因为强制转换可能会有数据的丢失。
 */
class ConversionDemo2 {
	public static void main(String[] args) {
		//定义两个变量，一个int类型，一个byte类型
		int a = 10;
		byte b = 20;
		int c = a + b;
		System.out.println(c);

		byte d = 30;
		byte e = (byte)(a + b);
		System.out.println(e);
	}
}

