package com.zazhiii;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws IOException {
        //1. 获取本机ip对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        //2. 获取指定ip或域名的ip对象
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu.getHostName());
        System.out.println(baidu.getHostAddress());

        // ping
        System.out.println(baidu.isReachable(1000));
    }
}