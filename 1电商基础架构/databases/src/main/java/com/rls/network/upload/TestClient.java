package com.rls.network.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestClient {

    /*
     * 1、连接服务器
     *
     * 2、把文件传给服务器
     * 		读取本地文件，用字节输入流的方式读，写给服务器
     *
     * 3、关闭资源
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1电商基础架构/com.rls.learn/src/main/java/com/rls/network/upload/test.txt"));
        OutputStream os = socket.getOutputStream();

        BufferedOutputStream bos = new BufferedOutputStream(os);
        int b;

        while((b = bis.read()) != -1 ){
            bos.write(b);
        }

        bis.close();

        socket.close();
    }
}
