package com.rls.network.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

    /*
     * 1、开启服务，等待客户
     *
     * 2、客户来了我就开始读写
     *
     * 3、读写完了就释放资源。
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        BufferedInputStream bs = new BufferedInputStream(is);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test2.txt"));

        int b;

        while((b = bs.read()) != -1){
            bos.write(b);
        }

        bos.close();

        socket.close();
    }

}
