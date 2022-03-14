package main.java.com.rls.base13;

import java.io.File;
import java.io.IOException;

/*
 * File:文件和目录路径名的抽象表示形式
 * 也就是说文件和目录是可以通过File封装成对象的
 * 目录：其实就是文件夹
 *
 * File构造方法：
 * 		File(String pathname):通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 * 		File(String parent, String child):根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 * 		File(File parent, String child):根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
 */

/*
 * 创建功能
 * public boolean createNewFile():创建文件
 * 		如果文件不存在，创建文件并返回true
 * 		如果文件存在，创建文件失败并返回false
 *
 * public boolean mkdir():创建目录
 * 		如果目录不存在，创建目录并返回true
 * 		如果目录存在，创建目录失败并返回false
 *
 * public boolean mkdirs():创建多级目录
 */

/*
 * 删除功能
 * public boolean delete():删除文件和目录
 *
 * 路径的问题：
 * 绝对路径：是以盘符开始的路径。d:\\aa\\b.txt
 * 相对路径：不以盘符开始。相对于当前的项目而言，在项目的目录下。如何显示出来呢？刷新项目就可以了。
 *
 * 注意：
 * 		如果一个目录中有内容(目录，文件)，就不能直接删除。
 * 		应该先删除目录中的内容，最后才能删除目录。
 */

/*
 * 判断功能
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * 获取功能
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //File(String pathname)
        File f1 = new File("b.txt");
        System.out.println("createNewFile:"+f1.createNewFile());
        System.out.println("getAbsolutePath:"+f1.getAbsolutePath());
        System.out.println("getPath:"+f1.getPath());
        System.out.println("getName:"+f1.getName());
        System.out.println("delete:" + f1.delete());

        //File(String parent, String child)
        File f2 = new File(".","b.txt");
//        System.out.println("mkdir:"+f2.mkdirs());

        //File(File parent, String child)
        File f3 = new File(".");
        File f4 = new File(f3,"b.txt");
    }
}
