package com.zazhiii.demo2;

import com.zazhiii.demo.BigStar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxy(UserServiceImpl userService) {
        // 回调方法
        return (UserService) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{UserService.class},
                (proxy, method, args) -> {
                    // 代理对象要做的事情，会在这里写代码
                    if (method.getName().equals("login") |
                            method.getName().equals("deleteUsers") |
                            method.getName().equals("selectUsers")) {
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(userService, args);
                        long end = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法执行时间：" + (end - start) + "ms");
                        return result;
                    } else {
                        return method.invoke(userService, args);
                    }
                });
    }
}