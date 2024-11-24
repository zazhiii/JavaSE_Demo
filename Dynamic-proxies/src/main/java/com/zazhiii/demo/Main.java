package com.zazhiii.demo;

/**
 * @author zazhi
 * @date 2024/11/23
 * @description: 动态代理demo
 *
 */
public class Main {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("张三");
        Star starProxy = ProxyUtil.createProxy(bigStar);
        starProxy.sing("好日子");
        starProxy.dance();
    }
}
