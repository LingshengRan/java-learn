package com.rls.base14;


import java.io.*;

/*
 * 字节缓冲区流：
 * BufferedOutputStream:字节缓冲输出流
 * BufferedInputStream:字节缓冲输入流
 *
 * BufferedOutputStream(OutputStream out)
 * 使用这种构造方法，它提供了一个默认的缓冲区大小，所以一般我们使用默认的缓冲区就可以了。
 *
 * 为什么构造方法传递的是一个：OutputStream，而不是具体的文件或者路径呢?
 * 字节缓冲区流仅仅提供缓冲区，而真正的底层的读写数据还得需要基本的流对象进行操作。
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
            //封装数据源
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            //封装目的地
            BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

            //读写数据
            String line;
            while((line=br.readLine())!=null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //释放资源
            bw.close();
            br.close();

    }
}
