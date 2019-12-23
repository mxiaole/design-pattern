package com.cody.singleton;

public class SingletonDemo {

    /**
     * 只能实例化一个类对象
     * 将构造函数设置为私有的
     */
    private static SingletonDemo singletonDemo = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return singletonDemo;
    }

    public static void main(String[] args) {
        SingletonDemo instance = SingletonDemo.getInstance();
        System.out.println(instance);
        SingletonDemo instance2 = SingletonDemo.getInstance();
        System.out.println(instance2);
    }
}
