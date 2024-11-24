package com.zazhiii.demo;

/**
 * @author zazhi
 * @date 2024/11/23
 * @description:
 */
public class BigStar implements Star {

    String name;

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println("明星唱歌：" + name);
        return "唱完了";
    }

    @Override
    public void dance() {
        System.out.println("明星跳舞");
    }
}
