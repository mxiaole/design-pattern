package com.cody.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * 单例模式的扩展
 * 产生固定数量的实例
 */
public class MultiEmperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList<String> nameList = new ArrayList<>();

    private static ArrayList<MultiEmperor> emperorArrayList = new ArrayList<>();

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorArrayList.add(new MultiEmperor("emperor" + i));
        }
    }

    public static int countNumOfEmperor = 0;

    private MultiEmperor() {
    }

    private MultiEmperor(String name) {
        nameList.add(name);
    }

    public static MultiEmperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorArrayList.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println("I am " + nameList.get(countNumOfEmperor));
    }
}
