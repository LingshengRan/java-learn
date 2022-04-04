package com.rls.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress:此类表示互联网协议 (IP) 地址。
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException   {
		//static InetAddress getByName(String host)
		InetAddress address = InetAddress.getByName("MBP.local");
//		InetAddress address = InetAddress.getByName("192.168.1.107");//ip地址是唯一的

		String hostAddress = address.getHostAddress();//192.168.1.107 返回IP地址
		String hostName = address.getHostName();//itheima	返回主机名

		System.out.println(hostAddress);
		System.out.println(hostName);


	}
}

