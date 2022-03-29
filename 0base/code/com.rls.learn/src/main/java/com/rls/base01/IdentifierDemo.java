package com.rls.base01;

/*
 * 内容辅助键：alt+/
 * main方法：main,然后alt+/,回车
 * 输出语句：syso,然后alt+/,回车
 *
 * 关键字：被Java语言赋予了特定含义的单词。
 *
 * 特点：
 * 		A:组成关键字的字母全部小写
 * 		B:常见的代码编辑器，对关键字有特殊的颜色标记
 */

/*
 * 标识符：就是用来给包，类，变量，方法等起名字的符号。
 *
 * 组成规则：
 * 		A:unicode字符
 * 			数字字符，英文大小写字母，汉字(不建议使用汉字)
 * 		B:下划线_
 * 		C:美元符$
 *
 * 注意事项：
 * 		A:不能以数字开头
 * 		B:不能是java中的关键字
 */
public class IdentifierDemo {
	public static void main(String[] args) {
		//数据类型 变量名 = 初始化值;
		int age = 20;

		//不能以数字开头

		//正确写法
		//int b2 = 30;

		//错误写法
		//int 2b = 30;

		//不能是java中的关键字
		//int class = 40;
	}
}

