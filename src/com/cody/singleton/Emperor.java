package com.cody.singleton;

/**
 * 饿汉式单例模式
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    // 将构造函数私有化
    private Emperor() {

    }

    // 通过类方法，提供对外的获取类实例的接口
    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("I am Emperor");
    }
}
