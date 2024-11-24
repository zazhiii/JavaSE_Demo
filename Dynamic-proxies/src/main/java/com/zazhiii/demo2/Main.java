package com.zazhiii.demo2;

import java.util.Arrays;

/**
 * @author zazhi
 * @date 2024/11/23
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 1、创建用户业务的代理对象
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());

        // 2、调用用户业务的功能。
        // 调用代理对象的方法，实际上是调用了InvocationHandler的invoke方法
        // InvocationHandler: 调用处理器，代理对象的调用处理器
        // invoke: 调用
        userService.login("admin", "123456");
        System.out.println("----------------------------------");

        userService.deleteUsers();
        System.out.println("----------------------------------");

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户是：" + Arrays.toString(names));
        System.out.println("----------------------------------");
    }
}
