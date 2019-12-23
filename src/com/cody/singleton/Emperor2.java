package com.cody.singleton;

import javax.management.PersistentMBean;

/**
 * 懒汉式实现单例模式，但是不是线程安全的
 */
public class Emperor2 {
    private static Emperor2 emperor2 = null;

    private Emperor2() {

    }

    public static Emperor2 getInstance() {
        if (emperor2 == null) {
            emperor2 = new Emperor2();
        }

        return emperor2;
    }

    public static void say() {
        System.out.println("I am emperor2");
    }
}
